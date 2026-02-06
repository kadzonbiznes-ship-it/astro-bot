package spinbara.development.bot4life.core.bot;

import spinbara.development.bot4life.Bot4life;
import spinbara.development.bot4life.MainPanel;

import java.awt.*;

/**
 * Odpowiada za pętlę kopania (mining loop) w MTA:SA.
 * Nie zmienia logiki biznesowej – jedynie wynosi ją poza MainPanel.
 */
public class MiningService {

    private final MainPanel mainPanel;

    public MiningService(MainPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public void performAsyncStartMine() {
        MainPanel.setFullKG(false);
        MainPanel.setCanMine(true);
        MainPanel.setMining(true);

        mainPanel.sendBotActivityFromService("Zalogowano do bota");

        Thread asyncThread = new Thread(this::startMine);
        asyncThread.setName("MiningLoop");
        asyncThread.start();
    }

    private void startMine() {
        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        while (mainPanel.isToggleSelected() && !MainPanel.isFullKG()) {
            try {
                Bot4life.simulator.sendLeftAlt();
                while (true) {
                    if (!mainPanel.isToggleSelected() || MainPanel.isFullKG()) break;
                    try {
                        Color color = robot.getPixelColor(43, 894);
                        Color color1 = robot.getPixelColor(42, 925);
                        Color color2 = robot.getPixelColor(67, 903);
                        Color color3 = robot.getPixelColor(75, 945);

                        if (MainPanel.isGray(color)
                                || MainPanel.isGray(color1)
                                || MainPanel.isGray(color2)
                                || MainPanel.isGray(color3)) {
                            break;
                        }
                        Thread.sleep(35);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    } catch (Exception e) {
                        break;
                    }
                }

                if (MainPanel.isFullKG()) {
                    break;
                }

                try {
                    mainPanel.captureAndDecide(MainPanel.m1.x, MainPanel.m1.y, 70, 70);
                } catch (Exception ignored) {
                }

                if (MainPanel.isFullKG()) {
                    break;
                }

                try {
                    mainPanel.captureAndDecide(MainPanel.m2.x, MainPanel.m2.y, 70, 70);
                } catch (Exception ignored) {
                }

                if (MainPanel.isFullKG()) {
                    break;
                }

                try {
                    mainPanel.captureAndDecide(MainPanel.m3.x, MainPanel.m3.y, 70, 70);
                } catch (Exception ignored) {
                }

                MainPanel.clearDetectedBuffer();

                if (MainPanel.isFullKG()) {
                    break;
                }

                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            } catch (Exception ignored) {
            }
        }
    }
}

package spinbara.development.bot4life.core.bot;

import spinbara.development.bot4life.Bot4life;
import spinbara.development.bot4life.MainPanel;

import java.awt.*;

/**
 * Odpowiada za pętlę kopania (mining loop) w MTA:SA.
 * Nie zmienia logiki biznesowej – jedynie wynosi ją poza MainPanel.
 */
public class MiningService {

    private final MainPanel mainPanel;

    public MiningService(MainPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public void performAsyncStartMine() {
        MainPanel.setFullKG(false);
        MainPanel.setCanMine(true);
        MainPanel.setMining(true);

        mainPanel.sendBotActivityFromService("Zalogowano do bota");

        Thread asyncThread = new Thread(this::startMine);
        asyncThread.setName("MiningLoop");
        asyncThread.start();
    }

    private void startMine() {
        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        while (mainPanel.isToggleSelected() && !MainPanel.isFullKG()) {
            try {
                Bot4life.simulator.sendLeftAlt();
                while (true) {
                    if (!mainPanel.isToggleSelected() || MainPanel.isFullKG()) break;
                    try {
                        Color color = robot.getPixelColor(43, 894);
                        Color color1 = robot.getPixelColor(42, 925);
                        Color color2 = robot.getPixelColor(67, 903);
                        Color color3 = robot.getPixelColor(75, 945);

                        if (MainPanel.isGray(color)
                                || MainPanel.isGray(color1)
                                || MainPanel.isGray(color2)
                                || MainPanel.isGray(color3)) {
                            break;
                        }
                        Thread.sleep(35);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    } catch (Exception e) {
                        break;
                    }
                }

                if (MainPanel.isFullKG()) {
                    break;
                }

                try {
                    mainPanel.captureAndDecide(MainPanel.m1.x, MainPanel.m1.y, 70, 70);
                } catch (Exception ignored) {
                }

                if (MainPanel.isFullKG()) {
                    break;
                }

                try {
                    mainPanel.captureAndDecide(MainPanel.m2.x, MainPanel.m2.y, 70, 70);
                } catch (Exception ignored) {
                }

                if (MainPanel.isFullKG()) {
                    break;
                }

                try {
                    mainPanel.captureAndDecide(MainPanel.m3.x, MainPanel.m3.y, 70, 70);
                } catch (Exception ignored) {
                }

                MainPanel.clearDetectedBuffer();

                if (MainPanel.isFullKG()) {
                    break;
                }

                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            } catch (Exception ignored) {
            }
        }
    }
}

