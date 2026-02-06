package spinbara.development.bot4life;

import spinbara.development.bot4life.config.Constants;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpTimeoutException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

import javax.imageio.ImageIO;

public class ImageUploader {

    private static final String SERVER_BASE_URL = Constants.PREDICT_API_URL;
    private static final HttpClient SHARED_CLIENT = HttpClient.newBuilder()
            .connectTimeout(Duration.ofMillis(Constants.CONNECT_TIMEOUT_MS))
            .build();

    public static BufferedImage previousImage;

    public static boolean compareWithPrevious(BufferedImage currentImage, double confidenceThreshold) {
        if (previousImage == null) {
            previousImage = currentImage;
            return false;
        }

        boolean arePixelsIdentical = areImagesIdentical(previousImage, currentImage);

        if (!arePixelsIdentical) {
            double confidence = calculateImageSimilarity(previousImage, currentImage);
            if (confidence >= confidenceThreshold) {
                return true;
            }
            previousImage = currentImage;
            return false;
        }

        return true;
    }

    private static boolean areImagesIdentical(BufferedImage img1, BufferedImage img2) {
        if (img1.getWidth() != img2.getWidth() || img1.getHeight() != img2.getHeight()) {
            return false;
        }
        int[] pixels1 = img1.getRGB(0, 0, img1.getWidth(), img1.getHeight(), null, 0, img1.getWidth());
        int[] pixels2 = img2.getRGB(0, 0, img2.getWidth(), img2.getHeight(), null, 0, img2.getWidth());
        return Arrays.equals(pixels1, pixels2);
    }

    private static double calculateImageSimilarity(BufferedImage img1, BufferedImage img2) {
        if (img1.getWidth() != img2.getWidth() || img1.getHeight() != img2.getHeight()) {
            return 0.0;
        }
        int width = img1.getWidth();
        int height = img1.getHeight();
        long totalPixels = (long) width * height;
        long similarPixels = 0L;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (img1.getRGB(x, y) == img2.getRGB(x, y)) {
                    similarPixels++;
                }
            }
        }

        return totalPixels == 0 ? 0.0 : (double) similarPixels / totalPixels;
    }

    public static String sendImage(File imageFile) throws IOException, InterruptedException, ExecutionException {
        byte[] imageBytes = Files.readAllBytes(imageFile.toPath());
        String boundary = "Boundary" + System.currentTimeMillis();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeBytes("--" + boundary + "\r\n");
        dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"file\"; filename=\"" + imageFile.getName() + "\"\r\n");
        dataOutputStream.writeBytes("Content-Type: image/png\r\n\r\n");
        dataOutputStream.write(imageBytes);
        dataOutputStream.writeBytes("\r\n--" + boundary + "--\r\n");
        dataOutputStream.close();

        byte[] finalBytes = byteArrayOutputStream.toByteArray();
        String url = SERVER_BASE_URL;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .timeout(Duration.ofMillis(Constants.REQUEST_TIMEOUT_MS))
                .header("Content-Type", "multipart/form-data; boundary=" + boundary)
                .POST(HttpRequest.BodyPublishers.ofByteArray(finalBytes))
                .build();

        try {
            HttpResponse<String> response = SHARED_CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = response.statusCode();
            if (statusCode == 403) {
                return null;
            }
            if (statusCode != 200) {
                return null;
            }
            return response.body();
        } catch (HttpTimeoutException | IOException | InterruptedException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return null;
        }
    }

    public static String sendImage(BufferedImage image) throws IOException, InterruptedException, ExecutionException {
        ByteArrayOutputStream imageOut = new ByteArrayOutputStream();
        ImageIO.write(image, "PNG", imageOut);
        byte[] imageBytes = imageOut.toByteArray();

        String url = SERVER_BASE_URL;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "image/png")
                .POST(HttpRequest.BodyPublishers.ofByteArray(imageBytes))
                .build();

        try {
            HttpResponse<String> response = SHARED_CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = response.statusCode();
            if (statusCode == 403 || statusCode != 200) {
                return null;
            }
            return response.body();
        } catch (HttpTimeoutException | IOException | InterruptedException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return null;
        }
    }

    public static BufferedImage grabScreen(int x, int y, int width, int height) throws AWTException {
        Robot robot = new Robot();
        return robot.createScreenCapture(new Rectangle(x, y, width, height));
    }
}
