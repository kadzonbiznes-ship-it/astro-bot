package spinbara.development.bot4life.fish;

import com.sun.jna.platform.win32.WinDef;
import spinbara.development.bot4life.Utils.IbInputSimulator;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FishingBot {
    protected static final long FISHING_BAR_TIMEOUT_MS = 15000L;
    protected final IbInputSimulator hidSimulator;
    protected Resolution resolution;
    protected ResolutionScaler scaler;
    protected Sizes sizes;
    protected Thread fishingThread;
    private ScreenHelper screenHelper;
    private boolean disabled = true;
    private boolean forceStopping = false;
    private FishingBotStatus status = FishingBotStatus.STOPPED;
    private FishingBotCallback callback;

    public enum FishingBotStatus {
        STOPPED, RUNNING, STOPPING
    }

    public interface FishingBotCallback {
        void onStatusUpdate(String status);
        void onError(String error);
    }

    public FishingBot(IbInputSimulator hidSimulator) {
        this.hidSimulator = hidSimulator;
    }

    public void setCallback(FishingBotCallback callback) {
        this.callback = callback;
    }

    private boolean initializeResolution() {
        return initializeResolution(5, 500);
    }
    
    private boolean initializeResolution(int maxRetries, long retryDelayMs) {
        for (int attempt = 1; attempt <= maxRetries; attempt++) {
            WinDef.RECT windowResolutionByTitle = WindowsUtil.getWindowResolutionByTitle("MTA: San Andreas");
            if (windowResolutionByTitle != null) {
                int targetWidth = windowResolutionByTitle.right - windowResolutionByTitle.left;
                int targetHeight = windowResolutionByTitle.bottom - windowResolutionByTitle.top;
                
                if (targetWidth < 1280 || targetHeight < 720) {
                    if (callback != null) {
                        callback.onError("Rozdzielczość okna jest zbyt mała (min. 1280x720, znaleziono: " + targetWidth + "x" + targetHeight + ")");
                    }
                    return false;
                }

                this.resolution = new Resolution(targetWidth, targetHeight);
                this.scaler = new ResolutionScaler(2560, 1440, targetWidth, targetHeight, false);
                this.sizes = new Sizes(this.scaler, this.resolution);
                this.screenHelper = new ScreenHelper(this);
                
                if (callback != null) {
                    callback.onStatusUpdate("Rozdzielczość zainicjalizowana: " + targetWidth + "x" + targetHeight);
                }
                return true;
            }
            
            if (attempt < maxRetries) {
                if (callback != null) {
                    callback.onStatusUpdate("Próba " + attempt + "/" + maxRetries + " - oczekiwanie na okno MTA...");
                }
                try {
                    Thread.sleep(retryDelayMs);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
        }
        
        if (callback != null) {
            callback.onError("Nie znaleziono okna MTA: San Andreas po " + maxRetries + " próbach");
        }
        return false;
    }

    public BufferedImage getLowerBarImage(Robot robot) {
        Rectangle screenRect = new Rectangle(0, this.resolution.getHeight() - this.sizes.getDarkBarSize(), 
            this.resolution.getWidth(), this.sizes.getDarkBarSize());
        return robot.createScreenCapture(screenRect);
    }

    public void startFishing() {
        if (fishingThread != null && fishingThread.isAlive()) {
            if (this.disabled) {
                this.disabled = false;
                this.forceStopping = false;
                this.setStatus(FishingBotStatus.RUNNING);
                if (callback != null) {
                    callback.onStatusUpdate("Bot włączony (wątek już działa)");
                }
            }
            return;
        }

        if (resolution == null || scaler == null || sizes == null) {
            if (callback != null) {
                callback.onStatusUpdate("Inicjalizacja rozdzielczości...");
            }
            if (!initializeResolution(10, 500)) {
                if (callback != null) {
                    callback.onError("Nie można zainicjalizować rozdzielczości - upewnij się, że MTA: San Andreas jest uruchomione");
                }
                return;
            }
        }

        this.disabled = false;
        this.forceStopping = false;
        this.fishingThread = new Thread(() -> {
            try {
                Random random = new Random();
                block2: while (true) {
                    if (!WindowsUtil.isMtaSanAndreasFocused()) {
                        Thread.sleep(100L);
                        updateStatus("Oczekiwanie na fokus MTA...");
                        continue;
                    }
                    if (this.disabled) {
                        this.forceStopping = false;
                        updateStatus("Zatrzymano");
                        this.setStatus(FishingBotStatus.STOPPED);
                        Thread.sleep(100L);
                        continue;
                    }
                    if (this.forceStopping) {
                        this.forceStopping = false;
                        this.disabled = true;
                        updateStatus("Wymuszone zatrzymanie");
                        if (this.hidSimulator.isMousePressed()) {
                            this.hidSimulator.mouseRelease(1);
                        }
                        this.setStatus(FishingBotStatus.STOPPED);
                        continue;
                    }
                    this.hidSimulator.mouseRelease(1);
                    Thread.sleep(100L);
                    int pressTime = random.nextInt(30, 48);
                    this.hidSimulator.mousePress(1);
                    Thread.sleep(pressTime);
                    this.hidSimulator.mouseRelease(1);
                    Robot robot = new Robot();
                    updateStatus("Oczekiwanie na pasek...");
                    long startTime = System.currentTimeMillis();
                    while (this.screenHelper.getFishingColor(this.getLowerBarImage(robot)) == FishingColor.UNDEFINED || 
                           !this.screenHelper.isBlackCorners(robot)) {
                        if (this.forceStopping) {
                            this.forceStopping = false;
                            this.disabled = true;
                            updateStatus("Wymuszone zatrzymanie");
                            if (this.hidSimulator.isMousePressed()) {
                                this.hidSimulator.mouseRelease(1);
                            }
                            this.setStatus(FishingBotStatus.STOPPED);
                            continue block2;
                        }
                        Thread.sleep(100L);
                        long elapsed = System.currentTimeMillis() - startTime;
                        if (elapsed >= FISHING_BAR_TIMEOUT_MS) {
                            updateStatus("Timeout: Pasek nie pojawił się");
                            continue block2;
                        }
                    }
                    updateStatus("Pasek wykryty - rozpoczęto łowienie");
                    Thread.sleep(1700 + ThreadLocalRandom.current().nextInt(200));
                    this.hidSimulator.mousePress(1);
                    updateStatus("Łowienie...");
                    do {
                        int millis;
                        if (this.forceStopping) {
                            this.forceStopping = false;
                            this.disabled = true;
                            updateStatus("Wymuszone zatrzymanie");
                            if (this.hidSimulator.isMousePressed()) {
                                this.hidSimulator.mouseRelease(1);
                            }
                            this.setStatus(FishingBotStatus.STOPPED);
                            continue block2;
                        }
                        Thread.sleep(20L);
                        BufferedImage lowerBar = this.getLowerBarImage(robot);
                        FishingColor fishingColor = this.screenHelper.getFishingColor(lowerBar);
                        updateStatus("Kolor: " + fishingColor.toString());
                        if (fishingColor == FishingColor.GRAY) {
                            if (this.hidSimulator.isMousePressed()) continue;
                            this.hidSimulator.mousePress(1);
                            updateStatus("Wciśnięto przycisk");
                            continue;
                        }
                        if (fishingColor == FishingColor.GREEN) {
                            if (!(ThreadLocalRandom.current().nextDouble() < 5.0E-4)) continue;
                            Thread.sleep(30 + ThreadLocalRandom.current().nextInt(15));
                            millis = 50 + ThreadLocalRandom.current().nextInt(120);
                            this.hidSimulator.mouseRelease(1);
                            Thread.sleep(millis);
                            updateStatus("Zwolniono przycisk");
                            continue;
                        }
                        if (fishingColor != FishingColor.RED) continue;
                        if (ThreadLocalRandom.current().nextDouble() < 0.1) {
                            millis = 140 + ThreadLocalRandom.current().nextInt(140);
                            Thread.sleep(millis);
                            this.hidSimulator.mouseRelease(1);
                            updateStatus("Zwolniono przycisk");
                            Thread.sleep(40 + ThreadLocalRandom.current().nextInt(60));
                            continue;
                        }
                        if (this.screenHelper.getFishingState(lowerBar) == FishingState.LINE_BREAK) {
                            if (!this.hidSimulator.isMousePressed()) continue;
                            millis = 115 + ThreadLocalRandom.current().nextInt(100);
                            Thread.sleep(millis);
                            this.hidSimulator.mouseRelease(1);
                            updateStatus("Zwolniono przycisk (zerwanie)");
                            Thread.sleep(40 + ThreadLocalRandom.current().nextInt(60));
                            continue;
                        }
                        if (this.hidSimulator.isMousePressed()) continue;
                        this.hidSimulator.mousePress(1);
                        updateStatus("Wciśnięto przycisk");
                    } while (this.screenHelper.isBlackCorners(robot));
                    updateStatus("Zakończono łowienie");
                    if (this.forceStopping) {
                        updateStatus("Wymuszone zatrzymanie");
                        this.forceStopping = false;
                        this.disabled = true;
                        if (this.hidSimulator.isMousePressed()) {
                            this.hidSimulator.mouseRelease(1);
                        }
                        this.setStatus(FishingBotStatus.STOPPED);
                        continue;
                    }
                    if (this.status == FishingBotStatus.STOPPING) {
                        this.disabled = true;
                        this.setStatus(FishingBotStatus.STOPPED);
                    }
                    Thread.sleep(750 + ThreadLocalRandom.current().nextInt(400));
                }
            } catch (Exception e) {
                updateStatus("Błąd: " + e.getMessage());
                if (callback != null) {
                    callback.onError("Błąd podczas łowienia: " + e.getMessage());
                }
                e.printStackTrace();
            }
        });
        this.fishingThread.start();
        this.setStatus(FishingBotStatus.RUNNING);
    }

    public void stop() {
        this.forceStopping = true;
        this.setStatus(FishingBotStatus.STOPPED);
    }

    public void pause() {
        this.disabled = true;
        this.forceStopping = false;
        this.setStatus(FishingBotStatus.STOPPING);
    }

    public void resume() {
        if (this.forceStopping) {
            return;
        }
        this.disabled = false;
        this.setStatus(FishingBotStatus.RUNNING);
    }

    private void updateStatus(String status) {
        if (callback != null) {
            callback.onStatusUpdate(status);
        }
    }

    public void setStatus(FishingBotStatus status) {
        this.status = status;
    }

    public FishingBotStatus getStatus() {
        return status;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public ResolutionScaler getScaler() {
        return scaler;
    }

    public Sizes getSizes() {
        return sizes;
    }
}


