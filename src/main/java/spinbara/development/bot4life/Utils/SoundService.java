package spinbara.development.bot4life.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

/**
 * Prosta obsługa dźwięków (Clip). Zawiera fallback do legacy PlaySound, jeśli istnieje.
 */
public final class SoundService {

    private static final Logger log = LoggerFactory.getLogger(SoundService.class);

    private SoundService() {}

    public static void play(String soundFile) {
        try {
            File soundFileObj = resolveSoundFile(soundFile);
            if (soundFileObj == null) {
                return;
            }

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFileObj);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            new Thread(() -> {
                try {
                    Thread.sleep(clip.getMicrosecondLength() / 1000);
                    clip.close();
                    audioInputStream.close();
                } catch (Exception ignored) {
                }
            }).start();
        } catch (Exception e) {
            tryLegacyPlaySound(soundFile);
        }
    }

    private static void tryLegacyPlaySound(String soundFile) {
        try {
            Class<?> playSoundClass = Class.forName("spinbara.development.bot4life.Utils.PlaySound");
            java.lang.reflect.Method playSoundMethod = playSoundClass.getMethod("playSound", String.class);
            playSoundMethod.invoke(null, soundFile);
        } catch (Exception ex) {
            log.debug("Legacy PlaySound unavailable", ex);
        }
    }

    private static File resolveSoundFile(String soundFile) {
        String[] possiblePaths = {
                soundFile,
                "images/" + soundFile,
                "sounds/" + soundFile,
                System.getProperty("user.dir") + "/" + soundFile,
                System.getProperty("user.dir") + "/images/" + soundFile,
                System.getProperty("user.dir") + "/sounds/" + soundFile,
                "C:\\Users\\waria\\Desktop\\Bot4life\\src\\main\\resources\\images\\" + soundFile
        };

        for (String path : possiblePaths) {
            File testFile = new File(path);
            if (testFile.exists()) {
                return testFile;
            }
        }
        return null;
    }
}

