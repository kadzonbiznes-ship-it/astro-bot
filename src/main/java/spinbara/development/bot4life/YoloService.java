package spinbara.development.bot4life;

import ai.onnxruntime.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YoloService implements AutoCloseable {

    private final OrtEnvironment env;
    private final OrtSession session;

    private static final List<String> CLASS_NAMES = Arrays.asList("e letter", "q letter");

    public YoloService() throws OrtException, IOException {
        this.env = OrtEnvironment.getEnvironment();
        byte[] modelBytes = getResourceBytes("best.onnx");
        this.session = env.createSession(modelBytes, new OrtSession.SessionOptions());
    }

    /** Wczytuje plik ONNX z katalogu resources do byte[] */
    public static byte[] getResourceBytes(String path) throws IOException {
        try (InputStream in = YoloService.class.getClassLoader().getResourceAsStream(path)) {
            if (in == null) {
                throw new IOException("Resource not found: " + path);
            }
            return in.readAllBytes();
        }
    }

    /** Główna metoda predykcji */
    public String predict(BufferedImage img) {
        try {
            BufferedImage resized = resize(img, 64, 64);
            float[] chw = toCHW(resized);
            long[] shape = new long[]{1, 3, 64, 64};
            OnnxTensor input = OnnxTensor.createTensor(env, FloatBuffer.wrap(chw), shape);

            Map<String, OnnxTensor> inputs = new HashMap<>();
            String inputName = session.getInputInfo().keySet().iterator().next();
            inputs.put(inputName, input);

            OrtSession.Result output = session.run(inputs);

            float[] best = postProcessPickBest(output.get(0));

            output.close();
            input.close();

            if (best == null) return "Nie wykryto liter";

            int classId = (int) best[5];
            String className = (classId >= 0 && classId < CLASS_NAMES.size())
                    ? CLASS_NAMES.get(classId).toLowerCase()
                    : "";

            if ("e letter".equals(className)) return "E";
            if ("q letter".equals(className)) return "Q";
            return "E";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    /** Prosta post-process: wybiera najlepszy box */
    private float[] postProcessPickBest(OnnxValue ov) throws OrtException {
        if (!(ov instanceof OnnxTensor)) return null;
        OnnxTensor t = (OnnxTensor) ov;
        float[] data = t.getFloatBuffer().array();
        long[] s = t.getInfo().getShape();
        if (s.length != 3) return null;

        long n1 = s[1], n2 = s[2];
        boolean channelsFirst = false;
        long numPreds, vecLen;

        if (n2 <= 300 && n2 >= 4) {
            channelsFirst = false;
            numPreds = s[1];
            vecLen = s[2];
        } else {
            channelsFirst = true;
            numPreds = s[2];
            vecLen = s[1];
        }

        int bestIdx = -1;
        float bestScore = -1f;
        int bestClass = -1;
        float bx=0, by=0, bw=0, bh=0;

        for (int i = 0; i < (int) numPreds; i++) {
            float x = get(data, channelsFirst, i, 0, n1, n2);
            float y = get(data, channelsFirst, i, 1, n1, n2);
            float w = get(data, channelsFirst, i, 2, n1, n2);
            float h = get(data, channelsFirst, i, 3, n1, n2);

            int classStart = 4;
            float obj = 1f;
            if (vecLen >= 6 && vecLen - 5 <= 200) {
                obj = clamp01(get(data, channelsFirst, i, 4, n1, n2));
                classStart = 5;
            }

            int localBestClass = -1;
            float localBest = -1f;
            for (int c = classStart; c < vecLen; c++) {
                float clsScore = clamp01(get(data, channelsFirst, i, c, n1, n2));
                float score = obj * clsScore;
                if (score > localBest) {
                    localBest = score;
                    localBestClass = c - classStart;
                }
            }

            if (localBest > bestScore) {
                bestScore = localBest;
                bestIdx = i;
                bestClass = localBestClass;
                bx = x; by = y; bw = w; bh = h;
            }
        }

        if (bestIdx == -1 || bestScore < 0.25f) return null;

        return new float[]{bx, by, bw, bh, bestScore, bestClass};
    }

    private static float get(float[] data, boolean channelsFirst, int predIdx, int k, long n1, long n2) {
        if (channelsFirst) return data[(int)(k * n2 + predIdx)];
        else return data[(int)(predIdx * n2 + k)];
    }

    private static float clamp01(float v) {
        return Math.max(0f, Math.min(1f, v));
    }

    private static BufferedImage resize(BufferedImage src, int w, int h) {
        BufferedImage out = new BufferedImage(w, h, BufferedImage.TYPE_3BYTE_BGR);
        Graphics2D g = out.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(src, 0, 0, w, h, null);
        g.dispose();
        return out;
    }

    private static float[] toCHW(BufferedImage img) {
        int w = img.getWidth(), h = img.getHeight();
        float[] chw = new float[3 * w * h];
        int idxR = 0, idxG = w * h, idxB = 2 * w * h;

        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                int rgb = img.getRGB(x, y);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = rgb & 0xFF;
                int pos = y * w + x;
                chw[idxR + pos] = r / 255.0f;
                chw[idxG + pos] = g / 255.0f;
                chw[idxB + pos] = b / 255.0f;
            }
        }
        return chw;
    }

    @Override
    public void close() throws Exception {
        session.close();
        env.close();
    }
}

