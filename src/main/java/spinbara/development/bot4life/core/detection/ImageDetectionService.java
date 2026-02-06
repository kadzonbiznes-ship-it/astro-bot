package spinbara.development.bot4life.core.detection;

import spinbara.development.bot4life.Bot4life;
import spinbara.development.bot4life.ImageUploader;
import spinbara.development.bot4life.MainPanel;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ExecutionException;

/**
 * Odpowiada za wysyłanie wycinków ekranu do serwera oraz fallbacki kolorystyczne.
 * Logika 1:1 przeniesiona z MainPanel (bez zmiany zachowań).
 */
public class ImageDetectionService {

    private final MainPanel mainPanel;

    public ImageDetectionService(MainPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public void captureAndDecide(int x, int y, int width, int height) throws InterruptedException {
        try {
            BufferedImage image = ImageUploader.grabScreen(x, y, width, height);
            String response = ImageUploader.sendImage(image);

            if (response != null && !response.trim().isEmpty()) {
                handleServerResponse(image, response);
                mainPanel.updateDetectedLabel();
            }
        } catch (InterruptedException ex) {
            throw ex;
        } catch (Exception ex) {
            if (ex instanceof IOException || ex instanceof ExecutionException) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    throw ie;
                }
            }
        }
    }

    private void handleServerResponse(BufferedImage image, String response) throws InterruptedException {
        if (response.contains("E")) {
            if (MainPanel.randomChanceStatic(mainPanel.getSkutecznosc())) {
                Bot4life.simulator.sendInput("e");
                MainPanel.appendDetected("<font color='#32CD32'>E </font>");
            } else {
                Bot4life.simulator.sendInput("q");
                MainPanel.appendDetected("<font color='#e50000'>Q </font>");
            }
        } else if (response.contains("Q")) {
            if (MainPanel.randomChanceStatic(mainPanel.getSkutecznosc())) {
                Bot4life.simulator.sendInput("q");
                MainPanel.appendDetected("<font color='#32CD32'>Q </font>");
            } else {
                Bot4life.simulator.sendInput("e");
                MainPanel.appendDetected("<font color='#e50000'>E </font>");
            }
        } else if (response.contains("Nie wykryto liter") || response.contains("nie wykryto liter") ||
                response.contains("brak liter") || response.contains("Brak liter")) {

            if (hasDarkBrownLetters(image)) {
                useDarkLetterFallback();
            } else {
                checkDarkLetterColors(image);
            }
        }
    }

    private void analyzeImageColors(BufferedImage image) {
        try {
            int width = image.getWidth();
            int height = image.getHeight();

            int centerX = width / 2;
            int centerY = height / 2;

            for (int y = centerY - 1; y <= centerY + 1; y++) {
                for (int x = centerX - 1; x <= centerX + 1; x++) {
                    if (x >= 0 && x < width && y >= 0 && y < height) {
                        Color color = new Color(image.getRGB(x, y));
                        int r = color.getRed();
                        int g = color.getGreen();
                        int b = color.getBlue();

                        boolean isDark = (r < 100 && g < 100 && b < 100);
                        boolean isGray = MainPanel.isGray(color);
                    }
                }
            }

            analyzeMostCommonColors(image);

        } catch (Exception ignored) {
        }
    }

    private void analyzeMostCommonColors(BufferedImage image) {
        try {
            int width = image.getWidth();
            int height = image.getHeight();

            java.util.Map<String, Integer> colorCount = new java.util.HashMap<>();

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    Color color = new Color(image.getRGB(x, y));
                    String colorKey = color.getRed() + "," + color.getGreen() + "," + color.getBlue();
                    colorCount.put(colorKey, colorCount.getOrDefault(colorKey, 0) + 1);
                }
            }

            colorCount.entrySet().stream()
                    .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                    .limit(5)
                    .forEach(entry -> {
                        String[] rgb = entry.getKey().split(",");
                        int r = Integer.parseInt(rgb[0]);
                        int g = Integer.parseInt(rgb[1]);
                        int b = Integer.parseInt(rgb[2]);
                        Color color = new Color(r, g, b);

                        boolean isDark = (r < 100 && g < 100 && b < 100);
                        boolean isGray = MainPanel.isGray(color);
                    });

        } catch (Exception ignored) {
        }
    }

    private void checkDarkLetterColors(BufferedImage image) {
        try {
            int width = image.getWidth();
            int height = image.getHeight();

            java.util.Map<String, Integer> allColors = new java.util.HashMap<>();

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    Color color = new Color(image.getRGB(x, y));
                    int r = color.getRed();
                    int g = color.getGreen();
                    int b = color.getBlue();

                    String colorKey = r + "," + g + "," + b;
                    allColors.put(colorKey, allColors.getOrDefault(colorKey, 0) + 1);
                }
            }

            allColors.entrySet().stream()
                    .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                    .forEach(entry -> {
                        String[] rgb = entry.getKey().split(",");
                        int r = Integer.parseInt(rgb[0]);
                        int g = Integer.parseInt(rgb[1]);
                        int b = Integer.parseInt(rgb[2]);

                        String colorType;
                        if (r < 120 && g < 120 && b < 120) {
                            colorType = "CIEMNY";
                        } else if (r > 200 && g > 200 && b > 200) {
                            colorType = "JASNY";
                        } else if (Math.abs(r - g) < 30 && Math.abs(g - b) < 30 && Math.abs(r - b) < 30) {
                            colorType = "SZARY";
                        } else {
                            colorType = "KOLOROWY";
                        }
                    });

        } catch (Exception ignored) {
        }
    }

    private boolean hasDarkBrownLetters(BufferedImage image) {
        try {
            int width = image.getWidth();
            int height = image.getHeight();
            int darkBrownPixels = 0;
            int totalPixels = width * height;

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    Color color = new Color(image.getRGB(x, y));
                    int r = color.getRed();
                    int g = color.getGreen();
                    int b = color.getBlue();

                    if (isDarkBrownColor(r, g, b)) {
                        darkBrownPixels++;
                    }
                }
            }

            boolean hasLetters = darkBrownPixels > 0;
            if (hasLetters) {
                double ignored = (double) darkBrownPixels / totalPixels * 100;
            }
            return hasLetters;

        } catch (Exception e) {
            return false;
        }
    }

    private boolean isDarkBrownColor(int r, int g, int b) {
        if (r >= 150 || g >= 150 || b >= 150) return false;
        if (r < g - 15 || r < b - 15) return false;

        int maxDiff = Math.max(Math.abs(r - g), Math.max(Math.abs(r - b), Math.abs(g - b)));
        if (maxDiff > 100) return false;

        if (r > 130 && g > 110 && b > 80) return false;

        if (r >= 50 && r <= 130 && g >= 20 && g <= 110 && b >= 10 && b <= 70) {
            return true;
        }

        if (r >= 40 && r <= 130 && g >= 40 && g <= 130 && b >= 40 && b <= 130) {
            int avgColor = (r + g + b) / 3;
            if (avgColor >= 50 && avgColor <= 120) {
                return true;
            }
        }

        if (r <= 90 && g <= 90 && b <= 90) {
            int avgColor = (r + g + b) / 3;
            if (avgColor >= 20 && avgColor <= 80) {
                return true;
            }
        }

        int avgColor = (r + g + b) / 3;
        if (avgColor >= 30 && avgColor <= 120) {
            return true;
        }

        return true;
    }

    private void useDarkLetterFallback() {
        boolean chooseE = new Random().nextBoolean();
        if (chooseE) {
            Bot4life.simulator.sendInput("e");
            MainPanel.appendDetected("<font color='#8B4513'>E? </font>");
        } else {
            Bot4life.simulator.sendInput("q");
            MainPanel.appendDetected("<font color='#8B4513'>Q? </font>");
        }
        mainPanel.updateDetectedLabel();
    }
}

