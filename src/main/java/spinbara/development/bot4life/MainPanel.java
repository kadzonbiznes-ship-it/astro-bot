package spinbara.development.bot4life;

import ai.onnxruntime.OrtException;
import com.fazecast.jSerialComm.SerialPort;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spinbara.development.bot4life.Utils.DiscordWebhook;
import spinbara.development.bot4life.api.BotApiClient;
import spinbara.development.bot4life.config.Constants;
import spinbara.development.bot4life.core.bot.MiningService;
import spinbara.development.bot4life.core.detection.ImageDetectionService;
import spinbara.development.bot4life.core.monitoring.ConsoleLogEventListener;
import spinbara.development.bot4life.core.monitoring.ConsoleLogMonitor;
import spinbara.development.bot4life.core.monitoring.MtaSaProcessChecker;
import spinbara.development.bot4life.gui.components.LoadingSpinner;
import spinbara.development.bot4life.gui.components.borders.RoundedOutlineBorder;
import spinbara.development.bot4life.gui.components.buttons.GIconButton;
import spinbara.development.bot4life.gui.components.buttons.GTextButton;
import spinbara.development.bot4life.gui.components.panels.GPanel;
import spinbara.development.bot4life.gui.components.sliders.BlueSliderUI;
import spinbara.development.bot4life.gui.components.text.AutoFitTextArea;
import spinbara.development.bot4life.gui.components.toggles.ToggleSwitch;
import spinbara.development.bot4life.gui.notifications.AdminNotification;
import spinbara.development.bot4life.gui.notifications.FullBackpackNotification;
import spinbara.development.bot4life.gui.utils.GridPattern;
import spinbara.development.bot4life.utils.SoundService;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Arc2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.logging.Level;

public class MainPanel extends JFrame implements NativeKeyListener, ConsoleLogEventListener {

    private static final Logger log = LoggerFactory.getLogger(MainPanel.class);
    private final BotApiClient botApiClient = new BotApiClient(Constants.LOCAL_TOKEN);
    private final MtaSaProcessChecker mtaSaProcessChecker = new MtaSaProcessChecker();
    private final MiningService miningService = new MiningService(this);
    private final ImageDetectionService imageDetectionService = new ImageDetectionService(this);

    public static MainPanel instance;

    private GPanel navPanel;
    private GPanel layered;
    private GPanel settingsPanel;
    private GPanel userPanel;
    private GPanel homePanel;

    private JButton userSwitcher;
    private JButton homeSwitcher;
    private JButton closeButton;
    private JButton settingsSwitcher;
    private JButton discordButton;

    public static JSlider mineEndDelay;
    public static JLabel mineEndLabel;
    public static JSlider delaySlider;
    public static JLabel delayLabel;
    public static JSlider chanceSlider;
    public static JLabel chanceLabel;
    public static ToggleSwitch delaySwitch;
    public static JLabel delaySwitchLabel;
    public static JToggleButton delayCheckBox;
    private JButton selfDestructBtn;

    private JScrollPane scrollPane;
    public static AutoFitTextArea webhookBox;
    private JLabel labelWebhook;
    private JLabel labelStats;
    public static JLabel alltimeLabel;

    public static JLabel statusLabel;
    public static JLabel pauseLabel;
    public static JLabel detectedLabel;
    private ToggleSwitch toggleBox;
    private JLabel powerLabel;
    private JLabel imgLabel;


    private final Color bgTop = new Color(5, 6, 9);
    private final Color bgBottom = new Color(8, 9, 13);
    private final Color cardTop = new Color(12, 14, 20);
    private final Color cardBottom = new Color(10, 12, 18);
    private final Color accentA = new Color(100, 200, 255);
    private final Color accentB = new Color(138, 43, 226);
    private final Color accentGlow = new Color(100, 200, 255, 100);
    private final Color greenA = new Color(76, 217, 100);
    private final Color greenB = new Color(39, 174, 96);
    private final Color textColor = new Color(240, 245, 255);
    private final Color textSecondary = new Color(180, 190, 210);

    private final Font titleFont = new Font("Segoe UI", Font.BOLD, 16);
    private final Font normalFont = new Font("Segoe UI", Font.PLAIN, 13);

    private Point dragOffset;

    private static boolean fullKG = false;
    private static boolean canMine = true;
    private static boolean mining = false;
    private static boolean turned = false;
    private static int slot = 1;
    private static boolean backgroundMining = false;

    private static final String CONSOLE_LOG_PATH = Constants.CONSOLE_LOG_PATH;
    private static final String FULL_BACKPACK_MESSAGE = Constants.FULL_BACKPACK_MESSAGE;
    private final ConsoleLogMonitor consoleLogMonitor =
            new ConsoleLogMonitor(Paths.get(CONSOLE_LOG_PATH), FULL_BACKPACK_MESSAGE, ADMIN_NICKS);

    private static final String[] ADMIN_NICKS = {
            "ZbyK.gg", "Grzengol", ".franek", "XQward", "Greyna.gg", "bilu.", "japkooo.", "LuKi16", "Sheeker", "Argen",
            "Princessa*", "TheArasik.", "Wonder.", "Masellko", "Kubula", "Kozixon", "Linshi", "RIPSO", "PerkuleZ.",
            "NexiV.ogf", "K4fulsky*", "KubiN*", "Matie18", "vanos", "Wr77zeR*", "Byialy*", "Kurzi", "xDanielowsky",
            "Mefju4", "KavKa*", "PolakoVskY*", "EloBenc6969", "TeKMistrz", "BieQu", "Pavi", "Michalix*", "Verago.",
            "TrondoZPL*", "Bulis", "Nokiller", "ItsTobiasz", "pepsiak01", "Scarred", "Ulgi", "BlackSkorpio69",
            "concamatrix", "Sebastos.", "MoE", "Axidus*", "AcriZ", "kvmykk.ogf", "blaki", "Dani3lO", "Mibawek",
            "Patryk99", "Sheba", "Giendek", "juzekxd1337", "robi77", "wojtiTM", "borufka.", "klonek12391",
            "LoliCaretaker", "F4LL3S", "mxlk", "arbuz69", "RomekFarmaceuta"
    };

    public static final Point m1 = new Point(40, 890);
    public static final Point m2 = new Point(105, 890);
    public static final Point m3 = new Point(175, 890);

    public static boolean isFullKG() {
        return fullKG;
    }

    public static void setFullKG(boolean value) {
        fullKG = value;
    }

    public static void setCanMine(boolean value) {
        canMine = value;
    }

    public static void setMining(boolean value) {
        mining = value;
    }

    private Timer timer;
    private Timer statsTimer;
    private Timer pointsTimer;
    private long totalAllTimeMs = 0L;
    private long botStartTime = 0L;
    private double time = 0.0;
    private Thread asyncThread2;

    private int baudRate = 9600;
    private OutputStream outputStream2;
    private SerialPort serialPort;

    private int skutecznosc = 1000;


    public MainPanel() {
        this(false);
    }
    
    public MainPanel(boolean skipMTACheck) {
        instance = this;
        Bot4life.setMainPanel(this);
        consoleLogMonitor.addListener(this);
        GPanel.setDraggingSupplier(() -> MainPanel.instance != null && MainPanel.instance.isDragging);

        setTitle("ASTRO-BOT");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setAlwaysOnTop(true);
        setBackground(new Color(0, 0, 0, 0));

        System.setProperty("awt.useSystemAAFontSettings", "on");
        System.setProperty("swing.aatext", "true");

        setVisible(true);
        setLocationRelativeTo(null);
        
        SwingUtilities.invokeLater(() -> {
            if (skipMTACheck) {
                initComponents();
                pack();
                setWindowPositionLeftCenter();
                revalidate();
                repaint();
            } else if (!isMTASARunning()) {
                showLoadingScreen();
                pack();
                setWindowPositionLeftCenter();
                SwingUtilities.invokeLater(() -> {
                    revalidate();
                    repaint();
                });
                waitForMTASA();
            } else {
                initComponents();
                pack();
                setWindowPositionLeftCenter();
                revalidate();
                repaint();
                
                SwingUtilities.invokeLater(() -> {
                    try {
                        Bot4life.initializeForMainPanel(this);
                    } catch (Exception ex) {
                    }
                });
            }
        });
        
        skutecznosc = 1000;
        baudRate = 9600;
    }
    
    private boolean isDragging = false;
    private long lastDragUpdate = 0;
    private BufferedImage windowCache = null;
    
    private void setWindowPositionLeftCenter() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int windowWidth = getWidth();
        int windowHeight = getHeight();
        
        int x = 0;
        int y = (screenSize.height - windowHeight) / 2;
        
        setLocation(x, y);
    }

    private void onToggleAction() {
        boolean isSelected = toggleBox.isSelected();
        setKV(powerLabel, "Włączone:", isSelected ? colorized("✅", new Color(50, 205, 50)) : colorized("❌", new Color(229, 0, 0)));
        fullKG = false;
        canMine = true;

        if (asyncThread2 != null && asyncThread2.isAlive()) {
            asyncThread2.interrupt();
        }
        if (isSelected) {
            startTimer(5.5);
            statusLabel.setText("<html><b><font color='white'>Status:</font></b> <font color='#FFFF00'>Ladowanie</font></html>");
            startStats();
            startPointsTracking();
            startConsoleLogMonitoring();
        } else {
            stopTimer();
            stopConsoleLogMonitoring();
            stopPointsTracking();
            turned = false;
            mining = false;
            slot = 1;
            detected = "";
            detectedLabel.setText("<html><b><font color='white'>Wykryte:</font></b> <font color='#32CD32'>" + detected + "</font></html>");
            statusLabel.setText("<html><b><font color='white'>Status:</font></b> <font color='#e50000'>Wylaczone</font></html>");
            stopStats();
            
            new Thread(() -> {
                try {
                    Thread.sleep(500);
                    sendBotActivity("Wylogowano z bota");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }).start();
        }
    }

    public static boolean isGray(Color color) {
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        int maxDiff = Math.max(Math.abs(r - g), Math.max(Math.abs(r - b), Math.abs(g - b)));

        return maxDiff <= 15 && r >= 90 && r <= 180 && g >= 90 && g <= 180 && b >= 90 && b <= 180;
    }

    public void performAsyncStartMine() {
        miningService.performAsyncStartMine();
    }

    private void startTimer(double startSeconds) {
        this.time = startSeconds;
        this.timer = new Timer(10, e -> {
            if (time >= 0.0) {
                pauseLabel.setText(String.format("<html><b><font color='white'>Pauza:</font></b> <font color='#FFFF00'>%.2fs</font></html>", time));
                time -= 0.01;
                if (time <= 0.0) {
                    stopTimer();
                    if (!turned) {
                        statusLabel.setText("<html><b><font color='white'>Status:</font></b> <font color='#32CD32'>Wlaczone</font></html>");
                        turned = true;
                        performAsyncStartMine();
                        setKV(powerLabel, "Włączone:", colorized("✅", new Color(50, 205, 50)));
                    }
                }
            }
        });
        this.timer.start();
    }

    private void stopTimer() {
        if (this.timer != null) this.timer.stop();
        pauseLabel.setText("<html><b><font color='white'>Pauza:</font></b> <font color='#FFFF00'>0.00s</font></html>");
        if (!turned) {
            statusLabel.setText("<html><b><font color='white'>Status:</font></b> <font color='#e50000'>Wylaczone</font></html>");
            setKV(powerLabel, "Włączone:", colorized("❌", new Color(229, 0, 0)));
        }
        stopStats();
    }

    private void startStats() {
        if (statsTimer != null && statsTimer.isRunning()) return;
        statsTimer = new Timer(1000, e -> updateStatsLabels());
        statsTimer.start();
    }

    private void stopStats() {
        if (statsTimer != null) {
            statsTimer.stop();
            statsTimer = null;
        }
    }

    private void updateStatsLabels() {
        setKV(alltimeLabel, "Czas na bocie (SESJA):", formatDuration(totalAllTimeMs));
    }

    private void startPointsTracking() {
        if (pointsTimer != null && pointsTimer.isRunning()) return;
        botStartTime = System.currentTimeMillis();
        
        pointsTimer = new Timer(60000, e -> sendPointsUpdate());
        pointsTimer.start();
    }

    private void stopPointsTracking() {
        if (pointsTimer != null) {
            sendPointsUpdate(true);
            pointsTimer.stop();
            pointsTimer = null;
            botStartTime = 0;
        }
    }

    private void sendPointsUpdate() {
        sendPointsUpdate(false);
    }

    private void sendPointsUpdate(boolean isStopping) {
        if (botStartTime == 0) {
            return;
        }

        long currentTime = System.currentTimeMillis();
        long elapsedMs = currentTime - botStartTime;
        int minutes = (int) (elapsedMs / (1000 * 60));
        
        if (minutes <= 0) {
            return;
        }

        if (!isStopping) {
            botStartTime = currentTime;
        }
        botApiClient.sendPointsUpdateAsync(minutes);
    }

    private void sendBotActivity(String action) {
        botApiClient.sendActivityAsync(action);
    }

    private String formatDuration(long ms) {
        long totalSec = ms / 1000;
        long h = totalSec / 3600;
        long m = (totalSec % 3600) / 60;
        return h + "h " + m + "m";
    }

    private void tapBurst(String key, int times, int gapMs) {
        for (int i = 0; i < times; i++) {
            Bot4life.simulator.sendInput(key);
            if (i < times - 1) {
                try {
                    if (gapMs > 0) Thread.sleep(gapMs);
                } catch (InterruptedException ignored) {}
            }
        }
    }


    public void captureAndDecide(int x, int y, int width, int height) throws InterruptedException {
        imageDetectionService.captureAndDecide(x, y, width, height);
    }

    private void checkFull() throws IOException {
        try {
            BufferedImage image2 = ImageUploader.grabScreen(0, 0, 1920, 1080);
            int[] rgb = getPixelColor(image2, 1124, 76);
            if (rgb != null && rgb[0] <= 220) {
                BufferedImage image = ImageUploader.grabScreen(835, 10, 50, 50);
                if (ImageUploader.compareWithPrevious(image, 0.8)) {
                    fullKG = true;
                } else if (fullKG) {
                    fullKG = false;
                }
            } else if (!mining && !canMine) {
                ImageUploader.previousImage = null;
            }
        } catch (AWTException ex) {
            log.error("Failed to check full backpack status", ex);
        }
    }

    private void startConsoleLogMonitoring() {
        consoleLogMonitor.start();
    }

    private void stopConsoleLogMonitoring() {
        consoleLogMonitor.stop();
    }

    @Override
    public void onFullBackpack() {
        handleFullBackpack();
    }

    @Override
    public void onAdminDetected(String adminNick) {
        handleAdminDetected(adminNick);
    }

    private void handleFullBackpack() {
        fullKG = true;
        canMine = false;
        mining = false;

        SoundService.play(Constants.SOUND_FULL_BACKPACK);

        showFullBackpackNotification();

        if (webhookBox.getText().length() > 0) {
            try {
                spinbara.development.bot4life.Utils.DiscordWebhook webhook = new DiscordWebhook(webhookBox.getText());
                webhook.setTts(false);
                webhook.setAvatarUrl("https://img.icons8.com/?size=48&id=12051&format=png");
                webhook.setUsername("Alert System");
                webhook.addEmbed(new DiscordWebhook.EmbedObject()
                        .setTitle("Ostrzeżenie: Osiągnięto limit węgla!")
                        .setDescription("Limit węgla został osiągnięty. Proszę podjąć odpowiednie działania.")
                        .setColor(Color.RED)
                        .setFooter("System Alert", "https://img.icons8.com/?size=48&id=12051&format=png"));
                webhook.execute();
            } catch (Exception e) {
            }
        }

        SwingUtilities.invokeLater(() -> {
            statusLabel.setText("<html><b><font color='white'>Status:</font></b> <font color='#FF6B35'>Pełny plecak!</font></html>");
        });

        SwingUtilities.invokeLater(() -> {
            if (toggleBox != null) {
                toggleBox.setSelected(false);
            }

            stopTimer();
            stopStats();
            stopConsoleLogMonitoring();

            fullKG = false;
            canMine = true;
            mining = false;
            turned = false;
            slot = 1;
            detected = "";

            statusLabel.setText("<html><b><font color='white'>Status:</font></b> <font color='#e50000'>Wylaczone</font></html>");
            detectedLabel.setText("<html><b><font color='white'>Wykryte:</font></b> <font color='#32CD32'>" + detected + "</font></html>");

            if (powerLabel != null) {
                setKV(powerLabel, "Włączone:", colorized("❌", new Color(229, 0, 0)));
            }
        });
    }

    private void showFullBackpackNotification() {
        SwingUtilities.invokeLater(() -> {
            FullBackpackNotification notification = new FullBackpackNotification();
            notification.showNotification();
        });
    }

    private void handleAdminDetected(String adminNick) {
        

        fullKG = true;
        canMine = false;
        mining = false;

        SoundService.play(Constants.SOUND_ADMIN);

        showAdminNotification(adminNick);

        SwingUtilities.invokeLater(() -> {
            statusLabel.setText("<html><b><font color='white'>Status:</font></b> <font color='#FF0000'>Admin na kopalni!</font></html>");
        });

        new Thread(() -> {
            try {
                Thread.sleep(30000);

                if (toggleBox.isSelected()) {
                    SwingUtilities.invokeLater(() -> {
                        fullKG = false;
                        canMine = true;
                        statusLabel.setText("<html><b><font color='white'>Status:</font></b> <font color='#32CD32'>Wlaczone</font></html>");
                    });
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }

    private void showAdminNotification(String adminNick) {
        SwingUtilities.invokeLater(() -> {
            AdminNotification notification = new AdminNotification(adminNick);
            notification.showNotification();
        });
    }

    public static int[] getPixelColor(BufferedImage image, int x, int y) {
        try {
            if (x < 0 || y < 0 || x >= image.getWidth() || y >= image.getHeight())
                throw new IllegalArgumentException("Poza granicami obrazu");
            int rgb = image.getRGB(x, y);
            return new int[]{(rgb >> 16) & 0xFF, (rgb >> 8) & 0xFF, rgb & 0xFF};
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean randomChanceStatic(int value) {
        int max = 1000;
        if (value >= max) return true;
        return (new Random().nextInt(max) + 1) <= value;
    }

    public static double convertToPercentage(int value) {
        return value / 10.0;
    }

    public int getSkutecznosc() {
        return this.skutecznosc;
    }

    public boolean isToggleSelected() {
        return toggleBox != null && toggleBox.isSelected();
    }

    public static void appendDetected(String html) {
        detected += html;
    }

    public static void clearDetectedBuffer() {
        detected = "";
    }

    public void updateDetectedLabel() {
        if (detectedLabel != null) {
            detectedLabel.setText("<html><b><font color='white'>Wykryte:</font></b> <font color='#32CD32'>" + detected + "</font></html>");
        }
    }

    public void sendBotActivityFromService(String action) {
        sendBotActivity(action);
    }

    private static void sendCommand(OutputStream outputStream, char command) throws IOException {
        outputStream.write(command);
        outputStream.flush();
    }

    private static String getResponse(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int bytesRead = inputStream.read(buffer);
        if (bytesRead > 0) return new String(buffer, 0, bytesRead);
        return "Brak odpowiedzi.";
    }

    private void wyslijArduino(char t) {
        try {
            sendCommand(this.outputStream2, t);
        } catch (IOException ex) {
            log.error("Failed to send command to Arduino", ex);
        }
    }

    private void chanceSliderStateChanged(ChangeEvent e) {
        int value = chanceSlider.getValue();
        this.skutecznosc = value;
        setKV(chanceLabel, "Skuteczność:", String.format("%.1f%%", convertToPercentage(value)));
    }

    private void delaySliderStateChanged(ChangeEvent e) {
        int value = delaySlider.getValue();
        setKV(delayLabel, "Delay pomiędzy kliknięciami:", value + " ms");
    }

    private void mineEndDelayStateChanged(ChangeEvent e) {
        int value = mineEndDelay.getValue();
        setKV(mineEndLabel, "Delay po skończeniu kopania:", value + " ms");
    }

    private boolean isDelayDisabled() {
        return delaySwitch.isSelected();
    }

    private void showCard(String name) {
        CardLayout cl = (CardLayout) layered.getLayout();
        cl.show(layered, name);
        if ("settings".equals(name)) {
            applySettingsLockedState();
        }
    }

    private void setComponentEnabledRecursively(Component component, boolean enabled) {
        if (component == selfDestructBtn) return;
        component.setEnabled(enabled);
        if (component instanceof Container) {
            for (Component child : ((Container) component).getComponents()) {
                setComponentEnabledRecursively(child, enabled);
            }
        }
    }

    private void applySettingsLockedState() {
        if (settingsPanel != null) {
            if (delaySlider != null) delaySlider.setEnabled(true);
            if (mineEndDelay != null) mineEndDelay.setEnabled(true);
            if (chanceSlider != null) chanceSlider.setEnabled(true);
            if (delaySwitch != null) delaySwitch.setEnabled(true);
        }
        if (selfDestructBtn != null) {
            selfDestructBtn.setEnabled(true);
            selfDestructBtn.setToolTipText("Działa zawsze");
        }
    }

    private JLabel title(String text) {
        JLabel l = new JLabel(text) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                g2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
                super.paintComponent(g2);
                g2.dispose();
            }
        };
        l.setForeground(textColor);
        l.setFont(titleFont);
        return l;
    }

    private JLabel kvLabel(String key, String value) {
        JLabel l = new JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                g2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
                super.paintComponent(g2);
                g2.dispose();
            }
        };
        l.setForeground(textColor);
        l.setFont(normalFont);
        setKV(l, key, value);
        return l;
    }

    private void setKV(JLabel label, String k, String v) {
        label.setText(String.format("<html><b><font color='white'>%s</font></b> <font color='#AAB0B9'>%s</font></html>", k, v));
    }


    private boolean checkIfClickWasCorrect() {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private String colorized(String text, Color c) {
        return String.format("<font color='#%02x%02x%02x'>%s</font>", c.getRed(), c.getGreen(), c.getBlue(), text);
    }

    private void styleSlider(JSlider s) {
        s.setOpaque(false);
        s.setUI(new BlueSliderUI(s, accentA, accentB));
        s.setPaintTicks(false);
        s.setPaintLabels(false);
        s.setFocusable(false);
    }

    private void fitWebhookToUserPanel() {
        webhookBox.autofit(scrollPane);
    }

    static void draw_grid_pattern(Graphics2D g2, int w, int h, RoundRectangle2D clip) {
        GridPattern.draw(g2, w, h, clip);
    }

    private void initComponents() {
        setPreferredSize(new Dimension(360, 270));
        setContentPane(new JPanel() {
            private float pulseGlow = 0.5f;
            private boolean pulseDir = true;
            private Timer pulseTimer;
            private BufferedImage doubleBuffer;
            
            {
                setOpaque(false);
                setDoubleBuffered(true);
                pulseTimer = new Timer(60, e -> {
                    if (isDragging) {
                        return;
                    }
                    
                    if (pulseDir) {
                        pulseGlow += 0.02f;
                        if (pulseGlow >= 0.8f) pulseDir = false;
                    } else {
                        pulseGlow -= 0.02f;
                        if (pulseGlow <= 0.5f) pulseDir = true;
                    }
                    repaint();
                });
                pulseTimer.start();
            }

            @Override
            public void paint(Graphics g) {
                if (doubleBuffer == null || 
                    doubleBuffer.getWidth() != getWidth() || 
                    doubleBuffer.getHeight() != getHeight()) {
                    doubleBuffer = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
                }
                
                Graphics2D g2 = doubleBuffer.createGraphics();
                paintComponent(g2);
                paintChildren(g2);
                g2.dispose();
                
                g.drawImage(doubleBuffer, 0, 0, null);
            }

            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                if (!isDragging) {
                    g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                } else {
                    g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
                }
                
                int w = getWidth(), h = getHeight(), r = 24;
                RoundRectangle2D rr = new RoundRectangle2D.Float(0, 0, w, h, r * 2, r * 2);
                if (isDragging) {
                    g2.setColor(bgTop);
                    g2.fillRect(0, 0, w, h);
                    g2.dispose();
                    return;
                } else {
                    for (int i = 6; i >= 1; i--) {
                        g2.setColor(new Color(0, 0, 0, 50 - i * 6));
                        g2.fillRoundRect(i, i, w - 2 * i, h - 2 * i, r * 2, r * 2);
                    }
                    GradientPaint gp = new GradientPaint(0, 0, bgTop, 0, h, bgBottom);
                    g2.setPaint(gp);
                    g2.fill(rr);
                    draw_grid_pattern(g2, w, h, rr);
                    g2.setStroke(new BasicStroke(2.5f));
                    g2.setColor(new Color(100, 200, 255, (int)(pulseGlow * 150)));
                    g2.draw(rr);
                    g2.setComposite(AlphaComposite.SrcOver.derive(0.3f));
                    g2.setColor(new Color(100, 200, 255, (int)(pulseGlow * 100)));
                    g2.setStroke(new BasicStroke(4f));
                    g2.drawRoundRect(-2, -2, w + 4, h + 4, (r + 2) * 2, (r + 2) * 2);
                    g2.setComposite(AlphaComposite.SrcOver);
                    g2.setColor(new Color(255, 255, 255, 30));
                    g2.setStroke(new BasicStroke(1f));
                    RoundRectangle2D inner = new RoundRectangle2D.Float(1, 1, w - 2, h - 2, (r - 1) * 2, (r - 1) * 2);
                    g2.draw(inner);
                }
                
                g2.dispose();
                super.paintComponent(g);
            }
        });
        getContentPane().setLayout(new BorderLayout());

        navPanel = new GPanel(cardTop, cardBottom, 18);
        navPanel.setPreferredSize(new Dimension(74, 270));
        navPanel.setBorder(new EmptyBorder(8, 8, 8, 8));
        navPanel.setDoubleBuffered(true);

        ImageIcon homeIcon = loadIcon("home.png", 24, 24);
        ImageIcon userIcon = loadIcon("user.png", 24, 24);
        ImageIcon cogIcon = loadIcon("cog.png", 24, 24);
        ImageIcon closeIcon = loadIcon("close.png", 20, 20);
        ImageIcon discordIcon = loadIcon("discord.png", 24, 24);

        homeSwitcher = new GIconButton(homeIcon, accentA, accentB);
        userSwitcher = new GIconButton(userIcon, accentA, accentB);
        settingsSwitcher = new GIconButton(cogIcon, accentA, accentB);
        closeButton = new GIconButton(closeIcon, new Color(255, 77, 77), new Color(200, 30, 30));
        discordButton = new GIconButton(discordIcon, accentA, accentB);

        ((GIconButton) discordButton).setToolTipText("Discord");
        ((GIconButton) homeSwitcher).setToolTipText("Home");
        ((GIconButton) userSwitcher).setToolTipText("User");
        ((GIconButton) settingsSwitcher).setToolTipText("Settings");
        ((GIconButton) closeButton).setToolTipText("Close");

        discordButton.addActionListener(e -> openLink("https://discord.gg/rUujGqbUeU"));

        JPanel navContent = new JPanel();
        navContent.setOpaque(false);
        navContent.setLayout(new BorderLayout());
        Box navButtons = Box.createVerticalBox();
        navButtons.setOpaque(false);
        navButtons.add(centerWrap(homeSwitcher));
        navButtons.add(Box.createVerticalStrut(6));
        navButtons.add(centerWrap(userSwitcher));
        navButtons.add(Box.createVerticalStrut(6));
        navButtons.add(centerWrap(settingsSwitcher));
        navButtons.add(Box.createVerticalStrut(6));
        navButtons.add(centerWrap(closeButton));
        navContent.add(navButtons, BorderLayout.NORTH);
        JPanel bottomBox = new JPanel(new GridBagLayout());
        bottomBox.setOpaque(false);
        bottomBox.add(discordButton);
        navContent.add(bottomBox, BorderLayout.SOUTH);
        navPanel.setLayout(new BorderLayout());
        navPanel.add(navContent, BorderLayout.CENTER);

        layered = new GPanel(new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), 18);
        layered.setLayout(new CardLayout());
        layered.setDoubleBuffered(true);

        settingsPanel = new GPanel(cardTop, cardBottom, 14);
        settingsPanel.setBorder(new EmptyBorder(8, 8, 8, 8));
        settingsPanel.setDoubleBuffered(true);

        mineEndDelay = new JSlider(190, 500, 260);
        styleSlider(mineEndDelay);
        mineEndLabel = kvLabel("Delay po skończeniu kopania:", "260 ms");
        mineEndDelay.addChangeListener(this::mineEndDelayStateChanged);
        delaySlider = new JSlider(1, 150, 50);
        styleSlider(delaySlider);
        delayLabel = kvLabel("Delay pomiędzy kliknięciami:", "50 ms");
        delaySlider.addChangeListener(this::delaySliderStateChanged);
        chanceSlider = new JSlider(1, 1000, 1000);
        styleSlider(chanceSlider);
        chanceLabel = kvLabel("Skuteczność:", "100.0%");
        chanceSlider.addChangeListener(this::chanceSliderStateChanged);

        delaySwitch = new ToggleSwitch(false, greenA, greenB);
        delaySwitchLabel = kvLabel("Opóźnienie:", "włączone");
        delaySwitch.addActionListener(e -> setKV(delaySwitchLabel, "Opóźnienie:", delaySwitch.isSelected() ? "wyłączone" : "włączone"));
        delayCheckBox = delaySwitch;
        JLabel disableDelayTitle = new JLabel("Wyłącz opóźnienie");
        disableDelayTitle.setForeground(textColor);
        disableDelayTitle.setFont(normalFont);

        selfDestructBtn = new GTextButton("Self Destruct", accentA, accentB);
        selfDestructBtn.addActionListener(e -> confirmAndSelfDestruct());

        GroupLayout sl = new GroupLayout(settingsPanel);
        settingsPanel.setLayout(sl);
        sl.setAutoCreateGaps(true);
        sl.setAutoCreateContainerGaps(true);
        sl.setHorizontalGroup(sl.createParallelGroup()
                .addGroup(sl.createSequentialGroup().addComponent(disableDelayTitle).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(delaySwitch, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                .addComponent(delaySwitchLabel)
                .addComponent(chanceLabel)
                .addComponent(chanceSlider)
                .addComponent(delayLabel)
                .addComponent(delaySlider)
                .addComponent(mineEndLabel)
                .addComponent(mineEndDelay)
                .addGroup(sl.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(selfDestructBtn, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
        );
        sl.setVerticalGroup(sl.createSequentialGroup()
                .addGroup(sl.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(disableDelayTitle).addComponent(delaySwitch, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
                .addComponent(delaySwitchLabel)
                .addComponent(chanceLabel)
                .addComponent(chanceSlider)
                .addComponent(delayLabel)
                .addComponent(delaySlider)
                .addComponent(mineEndLabel)
                .addComponent(mineEndDelay)
                .addGap(10)
                .addComponent(selfDestructBtn, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        );

        userPanel = new GPanel(cardTop, cardBottom, 14);
        userPanel.setBorder(new EmptyBorder(8, 8, 8, 8));
        userPanel.setDoubleBuffered(true);
        scrollPane = new JScrollPane();
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(new EmptyBorder(4, 4, 4, 4));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getVerticalScrollBar().setOpaque(false);
        scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(6, Integer.MAX_VALUE));
        scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            private JButton zero() {
                JButton b = new JButton();
                b.setPreferredSize(new Dimension(0, 0));
                b.setMinimumSize(new Dimension(0, 0));
                b.setMaximumSize(new Dimension(0, 0));
                b.setFocusable(false);
                b.setBorderPainted(false);
                b.setContentAreaFilled(false);
                return b;
            }
            @Override
            protected JButton createDecreaseButton(int orientation) { return zero(); }
            @Override
            protected JButton createIncreaseButton(int orientation) { return zero(); }
            @Override
            protected void paintThumb(Graphics g, JComponent c, Rectangle r) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                g2.setComposite(AlphaComposite.SrcOver.derive(0.3f));
                g2.setColor(new Color(100, 200, 255, 100));
                g2.fillRoundRect(r.x - 1, r.y + 1, r.width + 2, r.height - 2, 8, 8);
                g2.setComposite(AlphaComposite.SrcOver);
                GradientPaint gp = new GradientPaint(r.x, r.y, accentA, r.x + r.width, r.y + r.height, accentB);
                g2.setPaint(gp);
                g2.fillRoundRect(r.x + 1, r.y + 2, r.width - 2, r.height - 4, 8, 8);
                g2.setColor(new Color(255, 255, 255, 80));
                g2.setStroke(new BasicStroke(1f));
                g2.drawRoundRect(r.x + 1, r.y + 2, r.width - 2, r.height - 4, 8, 8);
                
                g2.dispose();
            }
            @Override
            protected void paintTrack(Graphics g, JComponent c, Rectangle r) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                g2.setColor(new Color(40, 44, 52));
                g2.fillRoundRect(r.x, r.y, r.width, r.height, 8, 8);
                g2.dispose();
            }
        });
        webhookBox = new AutoFitTextArea(22, 16);
        webhookBox.setWrapStyleWord(true);
        webhookBox.setLineWrap(true);
        webhookBox.setOpaque(true);
        webhookBox.setForeground(Color.WHITE);
        webhookBox.setBackground(new Color(50, 54, 62));
        webhookBox.setEditable(true);
        webhookBox.setEnabled(true);
        webhookBox.setFocusable(true);
        webhookBox.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        webhookBox.setCaretColor(Color.WHITE);
        webhookBox.setBorder(BorderFactory.createCompoundBorder(new RoundedOutlineBorder(10, new Color(255, 255, 255, 70), 1.5f), new EmptyBorder(10, 10, 10, 10)));
        webhookBox.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                webhookBox.autofit(scrollPane);
            }

            public void removeUpdate(DocumentEvent e) {
                webhookBox.autofit(scrollPane);
            }

            public void changedUpdate(DocumentEvent e) {
                webhookBox.autofit(scrollPane);
            }
        });
        webhookBox.setText("");
        SwingUtilities.invokeLater(this::fitWebhookToUserPanel);
        scrollPane.setBorder(BorderFactory.createCompoundBorder(
                new RoundedOutlineBorder(10, new Color(255, 255, 255, 90), 1.2f),
                new EmptyBorder(2, 2, 2, 2)));
        webhookBox.setBorder(new EmptyBorder(8, 10, 8, 10));
        scrollPane.setViewportView(webhookBox);
        labelWebhook = title("WEBHOOK");
        labelStats = title("STATYSTYKI");
        alltimeLabel = kvLabel("Czas na bocie (ALL):", "0h 0m");

        GroupLayout userPanelLayout = new GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
                userPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(userPanelLayout.createSequentialGroup()
                                .addContainerGap().addGroup(userPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(scrollPane, -2, 0, 32767)
                                        .addComponent(this.labelWebhook, -1, -1, 32767)
                                        .addComponent(this.labelStats, GroupLayout.Alignment.TRAILING, -1, -1, 32767)
                                        .addComponent(MainPanel.alltimeLabel, -1, -1, 32767))
                                .addContainerGap())
        );
        userPanelLayout.setVerticalGroup(
                userPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(userPanelLayout.createSequentialGroup()
                                .addContainerGap().addComponent(this.labelWebhook)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane, -2, 56, -2)
                                .addGap(18, 18, 18).addComponent(this.labelStats)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MainPanel.alltimeLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addContainerGap(87, 32767)));

        homePanel = new GPanel(cardTop, cardBottom, 14);
        homePanel.setBorder(new EmptyBorder(8, 8, 8, 8));
        homePanel.setDoubleBuffered(true);
        statusLabel = kvLabel("Status:", colorized("Wyłączone", new Color(229, 0, 0)));
        pauseLabel = kvLabel("Pauza:", "0.00 s");
        detectedLabel = kvLabel("Wykryte:", "");
        toggleBox = new ToggleSwitch(false, greenA, greenB);
        powerLabel = kvLabel("Włączone:", colorized("❌", new Color(229, 0, 0)));
        imgLabel = new JLabel();

        GroupLayout hl = new GroupLayout(homePanel);
        homePanel.setLayout(hl);
        hl.setAutoCreateGaps(true);
        hl.setAutoCreateContainerGaps(true);
        hl.setHorizontalGroup(hl.createParallelGroup().addGroup(hl.createSequentialGroup().addComponent(toggleBox, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(powerLabel)).addComponent(statusLabel).addComponent(pauseLabel).addComponent(detectedLabel));
        hl.setVerticalGroup(hl.createSequentialGroup().addGroup(hl.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(toggleBox, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE).addComponent(powerLabel)).addComponent(statusLabel).addComponent(pauseLabel).addComponent(detectedLabel));

        layered.add(homePanel, "home");
        layered.add(userPanel, "user");
        layered.add(settingsPanel, "settings");
        JPanel content = (JPanel) getContentPane();
        JPanel center = new JPanel(new BorderLayout());
        center.setOpaque(false);
        center.add(layered, BorderLayout.CENTER);
        center.setBorder(new EmptyBorder(8, 8, 8, 8));
        content.add(navPanel, BorderLayout.WEST);
        content.add(center, BorderLayout.CENTER);
        homeSwitcher.addActionListener(e -> showCard("home"));
        userSwitcher.addActionListener(e -> showCard("user"));
        settingsSwitcher.addActionListener(e -> showCard("settings"));
        closeButton.addActionListener(e -> System.exit(0));
        applySettingsLockedState();
        toggleBox.addActionListener(e -> onToggleAction());
        chanceSlider.addChangeListener(this::chanceSliderStateChanged);
        delaySlider.addChangeListener(this::delaySliderStateChanged);
        mineEndDelay.addChangeListener(this::mineEndDelayStateChanged);
    }


    private JPanel centerWrap(JComponent c) {
        JPanel p = new JPanel(new GridBagLayout());
        p.setOpaque(false);
        p.add(c);
        return p;
    }

    private void openLink(String url) {
        try {
            Desktop.getDesktop().browse(URI.create(url));
        } catch (IOException ex) { /* ignore */ }
    }

    private void confirmAndSelfDestruct() {
        try {
            stopTimer();
            stopStats();

            Path currentDir = Paths.get(System.getProperty("user.dir")).toAbsolutePath();
            
            long currentPid = ProcessHandle.current().pid();
            String tempDir = System.getenv("TEMP");
            if (tempDir == null) {
                tempDir = System.getProperty("java.io.tmpdir");
            }
            
            Path deleteScript = Paths.get(tempDir, "selfdestruct_" + System.currentTimeMillis() + ".bat");
            StringBuilder script = new StringBuilder();
            script.append("@echo off\n");
            script.append("timeout /t 2 /nobreak >nul\n");
            script.append(":wait\n");
            script.append("tasklist /FI \"PID eq ").append(currentPid).append("\" 2>NUL | find /I /N \"").append(currentPid).append("\">NUL\n");
            script.append("if \"%ERRORLEVEL%\"==\"0\" (\n");
            script.append("    timeout /t 1 /nobreak >nul\n");
            script.append("    goto wait\n");
            script.append(")\n\n");
            
            String currentDirPath = currentDir.toString().replace("\\", "\\\\");
            
            script.append("if exist \"").append(currentDirPath).append("\\astro-bot.exe\" (\n");
            script.append("    del /F /Q \"").append(currentDirPath).append("\\astro-bot.exe\" >nul 2>&1\n");
            script.append(")\n\n");
            
            script.append("if exist \"").append(currentDirPath).append("\\Bot4life-1.jar\" (\n");
            script.append("    del /F /Q \"").append(currentDirPath).append("\\Bot4life-1.jar\" >nul 2>&1\n");
            script.append(")\n\n");
            
            script.append("if exist \"").append(currentDirPath).append("\\JNativeHook.x86_64.dll\" (\n");
            script.append("    del /F /Q \"").append(currentDirPath).append("\\JNativeHook.x86_64.dll\" >nul 2>&1\n");
            script.append(")\n\n");
            
            script.append("if exist \"C:\\4lifebot\" (\n");
            script.append("    rd /S /Q \"C:\\4lifebot\" >nul 2>&1\n");
            script.append(")\n\n");
            
            script.append("del /F /Q \"").append(deleteScript.toString().replace("\\", "\\\\")).append("\" >nul 2>&1\n");
            script.append("exit\n");
            
            Files.write(deleteScript, script.toString().getBytes(StandardCharsets.UTF_8));
            
            ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "start", "/min", "\"\"", deleteScript.toString());
            pb.start();
            
            System.exit(0);
        } catch (Throwable ignored) {
            System.exit(0);
        }
    }

    private static ImageIcon loadIcon(String name, int w, int h) {
        try {
            java.net.URL url = MainPanel.class.getResource("/images/" + name);
            if (url == null) url = ClassLoader.getSystemResource("images/" + name);
            if (url == null) {
                File f1 = new File("src/main/resources/images/" + name);
                if (f1.exists()) {
                    return new ImageIcon(f1.getAbsolutePath());
                }
                return null;
            }
            return new ImageIcon(url);
        } catch (Exception e) {
            return null;
        }
    }

    private static String detected = "";

    private double generateRandomNumber() {
        return (new Random().nextInt(50) + 10) / 100.0;
    }

    public static void runAppDirect(Consumer<String> token) {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GlobalScreen.class.getPackage().getName());
        logger.setLevel(Level.OFF);
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            log.error("Failed to register native hook: {}", ex.getMessage(), ex);
            System.exit(1);
        }
        token.accept(spinbara.development.bot4life.config.Constants.LOCAL_TOKEN);
    }

    boolean uiHidden = true;

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        if (e.getKeyCode() == NativeKeyEvent.VC_INSERT) {
            SwingUtilities.invokeLater(() -> {
                if (isVisible()) {
                    setVisible(false);
                } else {
                    setVisible(true);
                }
            });
        } else if (e.getKeyCode() == NativeKeyEvent.VC_DELETE) {
            SwingUtilities.invokeLater(() -> {
                if (toggleBox != null) {
                    boolean newState = !toggleBox.isSelected();
                    toggleBox.setSelected(newState);
                    SwingUtilities.invokeLater(() -> {
                        onToggleAction();
                    });
                }
            });
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {}

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {}

    private static ImageIcon loadLogoScaled(String name, int w, int h) {
        try {
            java.net.URL url = MainPanel.class.getResource("/images/" + name);
            if (url == null) url = ClassLoader.getSystemResource("images/" + name);
            if (url == null) {
                File f1 = new File("src/main/resources/images/" + name);
                if (f1.exists()) url = f1.toURI().toURL();
            }
            if (url == null) return null;
            Image img = ImageIO.read(url);
            Image scaled = img.getScaledInstance(w, h, Image.SCALE_SMOOTH);
            return new ImageIcon(scaled);
        } catch (Exception ex) {
            return null;
        }
    }

    private static JButton flatWinBtn(String text) {
        final JButton btn = new JButton(text) {
            @Override protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                int w = getWidth(), h = getHeight();
                if (getModel().isRollover()) {
                    g2.setColor(new Color(100, 100, 100, 24));
                    g2.fillRoundRect(1, 1, w - 2, h - 2, 8, 8);
                }
                super.paintComponent(g2);
                g2.dispose();
            }
        };
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(false);
        btn.setForeground(new Color(230, 235, 240));
        btn.setFont(new Font("Segoe UI", Font.BOLD, 12));
        btn.setPreferredSize(new Dimension(28, 22));
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn.addMouseListener(new MouseAdapter() {
            @Override public void mouseEntered(MouseEvent e) { btn.repaint(); }
            @Override public void mouseExited(MouseEvent e) { btn.repaint(); }
            @Override public void mousePressed(MouseEvent e) { btn.repaint(); }
            @Override public void mouseReleased(MouseEvent e) { btn.repaint(); }
        });
        return btn;
    }

    private static JButton iconWinBtn(ImageIcon icon) {
        JButton btn = new JButton(icon);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(false);
        btn.setOpaque(false);
        btn.setPreferredSize(new Dimension(28, 22));
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn.addMouseListener(new MouseAdapter() {
            @Override public void mouseEntered(MouseEvent e) { btn.repaint(); }
            @Override public void mouseExited(MouseEvent e) { btn.repaint(); }
            @Override public void mousePressed(MouseEvent e) { btn.repaint(); }
            @Override public void mouseReleased(MouseEvent e) { btn.repaint(); }
        });
        return btn;
    }

    static class VerificationOverlay extends JComponent {
        private final LoadingSpinner spinner;
        private final JLabel caption;
        private final JPanel box;

        public VerificationOverlay(LoadingSpinner spinner, String text) {
            this.spinner = spinner;
            setLayout(new GridBagLayout());
            setOpaque(false);

            box = new JPanel();
            box.setOpaque(false);
            box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));

            LoadingSpinner big = new LoadingSpinner(56, new Color(0, 180, 255), new Color(94, 91, 255));
            big.setAlignmentX(Component.CENTER_ALIGNMENT);
            caption = new JLabel(text);
            caption.setForeground(new Color(230, 230, 235));
            caption.setAlignmentX(Component.CENTER_ALIGNMENT);
            caption.setBorder(new EmptyBorder(10, 0, 0, 0));

            box.add(big);
            box.add(caption);

            GridBagConstraints gc = new GridBagConstraints();
            gc.gridx = 0; gc.gridy = 0; gc.anchor = GridBagConstraints.CENTER;
            add(box, gc);

            putClientProperty("spinner", big);
        }

        public void showOverlay(boolean show) {
            setVisible(show);
            LoadingSpinner big = (LoadingSpinner) getClientProperty("spinner");
            if (show) {
                big.start();
            } else {
                big.stop();
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setComposite(AlphaComposite.SrcOver.derive(0.55f));
            g2.setColor(new Color(10, 10, 14));
            g2.fillRect(0, 0, getWidth(), getHeight());
            g2.dispose();
        }
    }

    public static boolean isLogitechGhubInstalled() {
        try {
            String programFiles = System.getenv("ProgramFiles");
            String programFilesX86 = System.getenv("ProgramFiles(x86)");
            File f1 = new File(programFiles + "\\LGHUB");
            File f2 = new File(programFilesX86 + "\\LGHUB");
            File f3 = new File("C:/Program Files/LGHUB");
            File f4 = new File("C:/Program Files (x86)/LGHUB");
            return f1.exists() || f2.exists() || f3.exists() || f4.exists();
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isLogitechGhubRunning() {
        try {
            Process p = new ProcessBuilder("tasklist").redirectErrorStream(true).start();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String lower = line.toLowerCase();
                    if (lower.contains("lghub.exe") || lower.contains("lghub_agent.exe") || lower.contains("lghub_updater.exe")) {
                        return true;
                    }
                }
            }
        } catch (IOException ignored) {}
        return false;
    }

    public static void showGhubNotInstalledDialog() {
        JDialog dialog = buildBlockingModalDialog("ASTRO-BOT", "Nie masz pobranego Logitech G HUB.",
                "Kliknij przycisk poniżej, aby pobrać, i odpal na nowo.", true);
        dialog.setVisible(true);
    }

    public static void showGhubNotRunningDialog() {
        JDialog dialog = buildBlockingModalDialog("ASTRO-BOT", "Logitech G HUB nie jest uruchomiony.",
                "Włącz Logitech G HUB i uruchom ponownie program.", false);
        dialog.setVisible(true);
    }

    private static JDialog buildBlockingModalDialog(String title, String line1, String line2, boolean withDownload) {
        JDialog frame = new JDialog((Frame) null, true);
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Color bgTopLocal = new Color(5, 6, 9);
        Color bgBottomLocal = new Color(8, 9, 13);
        Color cardTopLocal = new Color(12, 14, 20);
        Color cardBottomLocal = new Color(10, 12, 18);
        Color textColorLocal = new Color(236, 240, 243);

        GPanel root = new GPanel(bgTopLocal, bgBottomLocal, 24);
        root.setLayout(new BorderLayout());
        root.setBorder(new EmptyBorder(16, 16, 16, 16));

        JPanel titleBar = new JPanel(new BorderLayout());
        titleBar.setOpaque(false);
        titleBar.setBorder(new EmptyBorder(8, 0, 0, 0));
        
        JLabel titleLbl = new JLabel(title, SwingConstants.CENTER);
        titleLbl.setForeground(new Color(240, 245, 255));
        titleLbl.setFont(new Font("Segoe UI", Font.BOLD, 16));
        
        JPanel centerTitle = new JPanel(new BorderLayout());
        centerTitle.setOpaque(false);
        centerTitle.setBorder(new EmptyBorder(0, 0, 0, 0));
        centerTitle.add(titleLbl, BorderLayout.CENTER);
        titleBar.add(centerTitle, BorderLayout.CENTER);

        JButton closeBtn = iconWinBtn(new ImageIcon(MainPanel.class.getResource("/images/close.png")));
        closeBtn.addActionListener(e -> System.exit(0));
        JPanel winBtns = new JPanel(new FlowLayout(FlowLayout.TRAILING, 0, 0));
        winBtns.setOpaque(false);
        winBtns.add(closeBtn);
        titleBar.add(winBtns, BorderLayout.EAST);

        final Point[] dragOffsetRef = {null};
        MouseAdapter dragger = new MouseAdapter() {
            @Override public void mousePressed(MouseEvent e) { dragOffsetRef[0] = e.getPoint(); }
            @Override public void mouseDragged(MouseEvent e) {
                Point p = e.getLocationOnScreen();
                frame.setLocation(p.x - dragOffsetRef[0].x - 8, p.y - dragOffsetRef[0].y - 8);
            }
        };
        titleBar.addMouseListener(dragger);
        titleBar.addMouseMotionListener(dragger);

        GPanel center = new GPanel(cardTopLocal, cardBottomLocal, 18);
        center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));
        center.setBorder(new EmptyBorder(20, 24, 24, 24));

        JLabel l1 = new JLabel(line1);
        l1.setForeground(textColorLocal);
        l1.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel l2 = new JLabel(line2);
        l2.setForeground(new Color(180, 185, 195));
        l2.setAlignmentX(Component.CENTER_ALIGNMENT);
        center.add(l1);
        center.add(Box.createVerticalStrut(8));
        center.add(l2);
        center.add(Box.createVerticalStrut(14));

        if (withDownload) {
            GTextButton dl = new GTextButton("POBIERZ", new Color(0, 180, 255), new Color(94, 91, 255));
            dl.setAlignmentX(Component.CENTER_ALIGNMENT);
            dl.addActionListener(e -> {
                try {
                    Desktop.getDesktop().browse(URI.create("https://www.logitechg.com/pl-pl/innovation/g-hub.html"));
                } catch (IOException ignored) {}
                System.exit(0);
            });
            center.add(dl);
        } else {
            GTextButton close = new GTextButton("ZAMKNIJ", new Color(200, 80, 80), new Color(170, 50, 50));
            close.setAlignmentX(Component.CENTER_ALIGNMENT);
            close.addActionListener(e -> System.exit(0));
            center.add(close);
        }

        root.add(titleBar, BorderLayout.NORTH);
        root.add(center, BorderLayout.CENTER);
        frame.setContentPane(root);
        frame.pack();
        frame.setSize(new Dimension(420, center.getPreferredSize().height + 60));
        frame.setLocationRelativeTo(null);
        return frame;
    }

    private boolean isMTASARunning() {
        return mtaSaProcessChecker.isRunning();
    }

    private void showLoadingScreen() {
        setSize(400, 300);
        setResizable(false);
        SwingUtilities.invokeLater(() -> {
            pack();
            setLocationRelativeTo(null);
        });

        getContentPane().removeAll();

        JPanel mainPanel = new JPanel() {
            private BufferedImage doubleBuffer;
            
            @Override
            public void paint(Graphics g) {
                if (doubleBuffer == null || 
                    doubleBuffer.getWidth() != getWidth() || 
                    doubleBuffer.getHeight() != getHeight()) {
                    doubleBuffer = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
                }
                
                Graphics2D g2 = doubleBuffer.createGraphics();
                paintComponent(g2);
                paintChildren(g2);
                g2.dispose();
                
                g.drawImage(doubleBuffer, 0, 0, null);
            }

            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                
                int w = getWidth(), h = getHeight(), r = 24;
                RoundRectangle2D rr = new RoundRectangle2D.Float(0, 0, w, h, r * 2, r * 2);
                
                for (int i = 4; i >= 1; i--) {
                    g2.setColor(new Color(0, 0, 0, 30 - i * 5));
                    g2.fillRoundRect(i, i, w - 2 * i, h - 2 * i, r * 2, r * 2);
                }
                
                GradientPaint gp = new GradientPaint(0, 0, bgTop, 0, h, bgBottom);
                g2.setPaint(gp);
                g2.fill(rr);
                
                draw_grid_pattern(g2, w, h, rr);
                
                g2.setColor(new Color(255, 255, 255, 20));
                g2.setStroke(new BasicStroke(1f));
                RoundRectangle2D inner = new RoundRectangle2D.Float(1, 1, w - 2, h - 2, (r - 1) * 2, (r - 1) * 2);
                g2.draw(inner);
                
                g2.dispose();
            }
        };
        mainPanel.setOpaque(false);
        mainPanel.setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel();
        centerPanel.setOpaque(false);
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBorder(new EmptyBorder(50, 50, 50, 50));

        JLabel titleLabel = new JLabel("ASTRO-BOT", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(textColor);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel loadingLabel = new JLabel("Oczekiwanie na proces MTA:SA", SwingConstants.CENTER);
        loadingLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        loadingLabel.setForeground(new Color(180, 180, 180));
        loadingLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        LoadingSpinner spinner = new LoadingSpinner(40, accentA, accentB);
        spinner.setAlignmentX(Component.CENTER_ALIGNMENT);

        SwingUtilities.invokeLater(() -> spinner.start());

        centerPanel.add(Box.createVerticalGlue());
        centerPanel.add(titleLabel);
        centerPanel.add(Box.createVerticalStrut(20));
        centerPanel.add(loadingLabel);
        centerPanel.add(Box.createVerticalStrut(30));
        centerPanel.add(spinner);
        centerPanel.add(Box.createVerticalGlue());

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        setContentPane(mainPanel);
        setVisible(true);
    }

    private void waitForMTASA() {
        Thread waitThread = new Thread(() -> {
            while (!isMTASARunning()) {
                try {
                    Thread.sleep(Constants.MTA_CHECK_INTERVAL_MS);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            SwingUtilities.invokeLater(() -> {
                try {
                    getContentPane().removeAll();
                    initComponents();
                    pack();
                    setWindowPositionLeftCenter();
                    revalidate();
                    repaint();
                    try {
                        Bot4life.initializeForMainPanel(MainPanel.this);
                    } catch (Exception ex) {
                    }
                    SwingUtilities.invokeLater(() -> {
                        if (toggleBox != null && statusLabel != null) {
                            startMTASAMonitoring();
                        } else {
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        });
        waitThread.setDaemon(true);
        waitThread.start();
    }

    private void startMTASAMonitoring() {
        Thread monitorThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(Constants.MTA_MONITOR_INTERVAL_MS);

                    if (!isMTASARunning()) {
                        SwingUtilities.invokeLater(() -> {
                            stopTimer();
                            stopStats();
                            stopConsoleLogMonitoring();
                            System.exit(0);
                        });
                        break;
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                } catch (Exception e) {
                }
            }
        });
        monitorThread.setDaemon(true);
        monitorThread.setName("MTASAMonitor");
        monitorThread.start();
    }


}
