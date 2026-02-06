package spinbara.development.bot4life;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import spinbara.development.bot4life.Utils.IbInputSimulator;
import spinbara.development.bot4life.SettingsManager;
import spinbara.development.bot4life.config.Constants;
import spinbara.development.bot4life.security.AntiDebug;
import nu.pattern.OpenCV;

public class Bot4life {
    private static MainPanel mainPanel;
    private static int xMouse;
    private static int yMouse;

    public static synchronized void setMainPanel(MainPanel panel) {
        mainPanel = panel;
    }

    public static synchronized MainPanel getMainPanel() {
        return mainPanel;
    }

    public static void initializeForMainPanel(MainPanel panel) {
        if (panel == null) return;
        
        try {
            if (GlobalScreen.isNativeHookRegistered()) {
                GlobalScreen.addNativeKeyListener(panel);
            }
        } catch (Exception ex) {
        }
        
        checkLghubProcess();
        
        copyFiles();
        
        boolean simulatorLoaded = false;
        try {
            System.load("C:\\4lifebot\\bypass\\IbInputSimulator.dll");
            simulator = new IbInputSimulator();
            simulator.initialize(IbInputSimulator.SendType.LOGITECH_GHUB_NEW, 1, new String[0]);
            simulatorLoaded = true;
        } catch (UnsatisfiedLinkError | Exception e) {
        }
        
        if (!simulatorLoaded) {
            simulator = new DummySimulator();
        }
        
        if (MainPanel.webhookBox != null) MainPanel.webhookBox.setText(SettingsManager.get("webhook", ""));
        if (MainPanel.delayCheckBox != null) MainPanel.delayCheckBox.setSelected("on".equals(SettingsManager.get("delayBox", "off")));
        if (MainPanel.chanceSlider != null) MainPanel.chanceSlider.setValue(Integer.parseInt(SettingsManager.get("accuracy", "1000")));
        if (MainPanel.delaySlider != null) MainPanel.delaySlider.setValue(Integer.parseInt(SettingsManager.get("delay", "50")));
        if (MainPanel.mineEndDelay != null) MainPanel.mineEndDelay.setValue(Integer.parseInt(SettingsManager.get("mineenddelay", "260")));
        
        if (MainPanel.statusLabel != null)
            MainPanel.statusLabel.setText("<html><b><font color='white'>Status:</font></b> <font color='#e50000'>Wylaczone</font></html>");
        if (MainPanel.pauseLabel != null)
            MainPanel.pauseLabel.setText("<html><b><font color='white'>Pauza:</font></b> <font color='#FFFF00'>0.00s</font></html>");
        if (MainPanel.detectedLabel != null)
            MainPanel.detectedLabel.setText("<html><b><font color='white'>Wykryte:</font></b> <font color='#e50000'>BRAK</font></html>");
        
        String alltimeStr = StatisticManager.get("alltime", "0");
        long parsedTime = parseTimeFromFile(alltimeStr);
        Bot4life.allTime = System.currentTimeMillis() - parsedTime;
        
        Thread thread = new Thread(Bot4life::timeUpdate);
        thread.setDaemon(true);
        thread.start();
    }

    public static String formatMillis(long millis) {
        long seconds = millis / 1000L;
        long minutes = seconds / 60L;
        long hours = minutes / 60L;

        long remainingSeconds = seconds % 60L;
        long remainingMinutes = minutes % 60L;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }

    public static String formatTimeForFile(long millis) {
        if (millis < 1000) {
            return "0s";
        }
        
        long seconds = millis / 1000L;
        long minutes = seconds / 60L;
        long hours = minutes / 60L;
        long days = hours / 24L;
        
        long remainingSeconds = seconds % 60L;
        long remainingMinutes = minutes % 60L;
        long remainingHours = hours % 24L;
        
        StringBuilder sb = new StringBuilder();
        
        if (days > 0) {
            sb.append(days).append("d ");
        }
        if (remainingHours > 0 || days > 0) {
            sb.append(remainingHours).append("h ");
        }
        if (remainingMinutes > 0 || remainingHours > 0 || days > 0) {
            sb.append(remainingMinutes).append("m");
        } else if (remainingSeconds > 0) {
            sb.append(remainingSeconds).append("s");
        }
        
        return sb.toString().trim();
    }
    
    public static long parseTimeFromFile(String timeStr) {
        if (timeStr == null || timeStr.isEmpty() || timeStr.equals("alltime")) {
            return 0;
        }
        
        try {
            if (timeStr.matches("^\\d+$")) {
                return Long.parseLong(timeStr);
            }
            
            long totalMs = 0;
            timeStr = timeStr.trim();
            
            String[] parts = timeStr.split("\\s+");
            for (String part : parts) {
                if (part.endsWith("d")) {
                    long days = Long.parseLong(part.substring(0, part.length() - 1));
                    totalMs += days * 24 * 60 * 60 * 1000L;
                } else if (part.endsWith("h")) {
                    long hours = Long.parseLong(part.substring(0, part.length() - 1));
                    totalMs += hours * 60 * 60 * 1000L;
                } else if (part.endsWith("m")) {
                    long minutes = Long.parseLong(part.substring(0, part.length() - 1));
                    totalMs += minutes * 60 * 1000L;
                } else if (part.endsWith("s")) {
                    long seconds = Long.parseLong(part.substring(0, part.length() - 1));
                    totalMs += seconds * 1000L;
                }
            }
            
            return totalMs;
        } catch (Exception e) {
            return 0;
        }
    }

    public static long allTime;
    public static IbInputSimulator simulator;

    private static void timeUpdate() {
        while (true) {
            try {
                if (MainPanel.alltimeLabel != null) {
                    MainPanel.alltimeLabel.setText("<html><font color='white'>Czas na bocie (ALL): " + formatMillis(System.currentTimeMillis() - allTime) + "</html>");
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        spinbara.development.bot4life.security.ProcessNameChanger.init();
        
        AntiDebug.init();
        
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {}

            MainPanel.runAppDirect(token -> {
                try {
                    Files.createDirectories(Paths.get(Constants.BOT_DIR));
                } catch (IOException e) {
                }

                SwingUtilities.invokeLater(() -> {
                    PanelGame panelGame = new PanelGame();
                    panelGame.setVisible(true);
                    panelGame.setLocationRelativeTo(null);
                });
            });
        });

        OpenCV.loadLocally();

        FlatLightLaf.setup();
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        UIManager.addPropertyChangeListener(evt -> {
            try {
                UIManager.setLookAndFeel(new FlatDarkLaf());
                if (mainPanel != null) {
                    SwingUtilities.updateComponentTreeUI(mainPanel);
                    mainPanel.repaint();
                }
            } catch (UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }
        });

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                try {
                    if (GlobalScreen.isNativeHookRegistered()) {
                        GlobalScreen.unregisterNativeHook();
                    } else {
                    }
                } catch (NativeHookException ex) {
                }

                if (MainPanel.webhookBox != null && MainPanel.webhookBox.getText().length() > 0) {
                    SettingsManager.save("webhook", MainPanel.webhookBox.getText());
                } else {
                    SettingsManager.save("webhook", "");
                }

                if (MainPanel.delayCheckBox != null && MainPanel.delayCheckBox.isSelected()) {
                    SettingsManager.save("delayBox", "on");
                } else {
                    SettingsManager.save("delayBox", "off");
                }

                if (MainPanel.chanceSlider != null) {
                    SettingsManager.save("accuracy", String.valueOf(MainPanel.chanceSlider.getValue()));
                }
                if (MainPanel.delaySlider != null) {
                    SettingsManager.save("delay", String.valueOf(MainPanel.delaySlider.getValue()));
                }
                if (MainPanel.mineEndDelay != null) {
                    SettingsManager.save("mineenddelay", String.valueOf(MainPanel.mineEndDelay.getValue()));
                }

                long totalTimeMs = System.currentTimeMillis() - allTime;
                String formattedTime = formatTimeForFile(totalTimeMs);
                StatisticManager.save("alltime", formattedTime);

                if (simulator != null) {
                    simulator.destroy();
                }
                
                AntiDebug.stop();
            } catch (Exception e) {
            }
        }));
    }

    public static void checkLghubProcess() {
        boolean isRunning = false;
        try {
            Process process = Runtime.getRuntime().exec("tasklist");
            Scanner scanner = new Scanner(process.getInputStream());
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.toLowerCase().contains("lghub_system_tray.exe")) {
                    isRunning = true;
                    break;
                }
            }
            scanner.close();
        } catch (IOException e) {
        }

        if (!isRunning) {
            int result = JOptionPane.showConfirmDialog(null,
                    "Logitech G Hub nie jest uruchomiony. Czy chcesz kontynuować?",
                    "Ostrzeżenie",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);

            if (result != JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }

    public static void copyFiles() {
        String targetDir = Constants.BYPASS_DIR;
        
        String[] filesToCopy = {
            "alt_logitech.ahk",
            "alt_run.ahk", 
            "e_logitech.ahk",
            "e_run.ahk",
            "IbInputSimulator.ahk",
            "q_logitech.ahk",
            "q_run.ahk",
            "IbInputSimulator.dll",
            "scripts/alt_logitech.ahk",
            "scripts/alt_run.ahk",
            "scripts/e_logitech.ahk",
            "scripts/e_run.ahk",
            "scripts/IbInputSimulator.ahk",
            "scripts/q_logitech.ahk",
            "scripts/q_run.ahk",
            "dll/IbInputSimulator.dll"
        };
        
        try {
            Files.createDirectories(Paths.get(targetDir));
            
            for (String resourcePath : filesToCopy) {
                try {
                    InputStream inputStream = Bot4life.class.getResourceAsStream("/" + resourcePath);
                    if (inputStream != null) {
                        String fileName = resourcePath.substring(resourcePath.lastIndexOf('/') + 1);
                        Path targetPath = Paths.get(targetDir, fileName);
                        Files.copy(inputStream, targetPath, StandardCopyOption.REPLACE_EXISTING);
                        inputStream.close();
                    } else {
                    }
                } catch (IOException e) {
                }
            }
        } catch (IOException e) {
        }
    }

    static class DummySimulator extends IbInputSimulator {
        public void sendLeftAlt() {}
        public void sendInput(String key) {}
        public void initialize(Object type, int i, String[] strings) {}
        public void destroy() {}
    }
}

