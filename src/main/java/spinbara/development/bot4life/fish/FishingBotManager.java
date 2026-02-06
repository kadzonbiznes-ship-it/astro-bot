package spinbara.development.bot4life.fish;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import spinbara.development.bot4life.Bot4life;
import spinbara.development.bot4life.Utils.IbInputSimulator;

import javax.swing.SwingUtilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FishingBotManager implements NativeKeyListener {
    private static FishingBotManager instance;
    private FishingBot fishingBot;
    private boolean running = false;
    private static final Path LOG_PATH = Paths.get("C:\\Users\\waria\\Desktop\\update\\target\\logi.txt");
    private static final DateTimeFormatter LOG_FMT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private FishingBotManager() {
        try {
            if (!GlobalScreen.isNativeHookRegistered()) {
                GlobalScreen.registerNativeHook();
            }
            GlobalScreen.addNativeKeyListener(this);
        } catch (NativeHookException e) {
            System.err.println("Błąd rejestracji GlobalScreen: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static FishingBotManager getInstance() {
        if (instance == null) {
            instance = new FishingBotManager();
        }
        return instance;
    }

    public void start(IbInputSimulator simulator) {
        log("=== Uruchamianie bota rybaka ===");
        try {
            Files.createDirectories(LOG_PATH.getParent());
        } catch (IOException e) {
            System.err.println("Błąd tworzenia katalogu dla logów: " + e.getMessage());
        }
        
        FishingBotLoadingWindow loadingWindow = new FishingBotLoadingWindow();
        loadingWindow.updateStatus("Oczekiwanie na proces MTA: San Andreas...");
        
        Thread waitThread = new Thread(() -> {
            log("Rozpoczynam oczekiwanie na MTA: San Andreas...");
            int checkCount = 0;
            boolean mtaFound = false;
            
            while (!mtaFound) {
                checkCount++;
                
                boolean windowExists = WindowsUtil.doesWindowExist(WindowsUtil.MTA_WINDOW_NAME);
                
                boolean processExists = isMTASARunning();
                
                if (windowExists || processExists) {
                    mtaFound = true;
                    log("MTA: San Andreas znaleziony! (okno: " + windowExists + ", proces: " + processExists + ")");
                    break;
                }
                
                if (checkCount % 5 == 0) {
                    log("Sprawdzanie MTA... (sprawdzono " + checkCount + " razy, okno: " + windowExists + ", proces: " + processExists + ")");
                }
                
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    loadingWindow.hideAndDispose();
                    return;
                }
            }
            
            log("MTA: San Andreas znaleziony! Zamykam okno ładowania...");
            loadingWindow.updateStatus("MTA: San Andreas znaleziony!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            loadingWindow.hideAndDispose();
            log("Okno ładowania zamknięte. Inicjalizuję bota...");
            
            SwingUtilities.invokeLater(() -> {
                initializeBot(simulator);
            });
        });
        waitThread.setDaemon(true);
        waitThread.start();
    }
    
    private void initializeBot(IbInputSimulator simulator) {
        IbInputSimulator simToUse = simulator;
        if (simToUse == null) {
            log("Simulator jest NULL - próbuję zainicjalizować...");
            simToUse = initializeSimulator();
            if (simToUse == null) {
                log("BŁĄD: Nie udało się zainicjalizować simulatora! Nie można uruchomić bota.");
                return;
            }
        }
        
        log("Simulator status: OK");
        
        if (fishingBot == null) {
            try {
                fishingBot = new FishingBot(simToUse);
                fishingBot.setCallback(new FishingBot.FishingBotCallback() {
                    @Override
                    public void onStatusUpdate(String status) {
                        log(status);
                    }
                    
                    @Override
                    public void onError(String error) {
                        log("BŁĄD: " + error);
                    }
                });
                log("FishingBot utworzony pomyślnie");
            } catch (Exception e) {
                log("BŁĄD podczas tworzenia FishingBot: " + e.getMessage());
                e.printStackTrace();
                return;
            }
        } else {
            log("FishingBot już istnieje, używam istniejącego");
        }
        
        log("Bot rybaka gotowy (WYŁĄCZONY) - DEL: włącz/wyłącz, INSERT: wyjście");
        running = true;
    }

    private IbInputSimulator initializeSimulator() {
        try {
            log("Inicjalizacja IbInputSimulator...");
            if (Bot4life.simulator != null) {
                log("Używam istniejącego simulatora z Bot4life");
                return Bot4life.simulator;
            }
            
            try {
                java.nio.file.Paths.get("C:/4lifebot/bypass").toFile().mkdirs();
                System.load("C:\\4lifebot\\bypass\\IbInputSimulator.dll");
                log("DLL załadowane pomyślnie");
            } catch (UnsatisfiedLinkError e) {
                log("Nie można załadować DLL: " + e.getMessage());
                log("Używam fallback - spróbuję bez DLL");
            }
            
            IbInputSimulator sim = new IbInputSimulator();
            try {
                sim.initialize(IbInputSimulator.SendType.LOGITECH_GHUB_NEW, 1, new String[0]);
                log("Simulator zainicjalizowany (LOGITECH_GHUB_NEW)");
                Bot4life.simulator = sim;
                return sim;
            } catch (Exception e) {
                log("Błąd inicjalizacji simulatora: " + e.getMessage());
                try {
                    sim.initialize(IbInputSimulator.SendType.SEND_INPUT, 1, new String[0]);
                    log("Simulator zainicjalizowany (SEND_INPUT fallback)");
                    Bot4life.simulator = sim;
                    return sim;
                } catch (Exception e2) {
                    log("Błąd inicjalizacji z SEND_INPUT: " + e2.getMessage());
                    return null;
                }
            }
        } catch (Exception e) {
            log("BŁĄD podczas inicjalizacji simulatora: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public void stop() {
        log("Zatrzymywanie bota rybaka...");
        if (fishingBot != null) {
            fishingBot.stop();
        }
        running = false;
        log("Bot rybaka zatrzymany");
    }

    public void shutdown() {
        log("=== Zamykanie aplikacji ===");
        stop();
        try {
            if (GlobalScreen.isNativeHookRegistered()) {
                GlobalScreen.removeNativeKeyListener(this);
                GlobalScreen.unregisterNativeHook();
            }
        } catch (NativeHookException e) {
            log("Błąd podczas wyrejestrowania GlobalScreen: " + e.getMessage());
            e.printStackTrace();
        }
        System.exit(0);
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        int keyCode = e.getKeyCode();
        
        if (keyCode == NativeKeyEvent.VC_DELETE) {
            if (fishingBot == null) {
                log("DEL naciśnięty - bot nie istnieje, tworzę nowy...");
                IbInputSimulator simulator = Bot4life.simulator;
                if (simulator != null) {
                    start(simulator);
                } else {
                    log("BŁĄD: Simulator nie jest zainicjalizowany!");
                }
            } else {
                FishingBot.FishingBotStatus currentStatus = fishingBot.getStatus();
                log("DEL naciśnięty - aktualny status: " + currentStatus);
                if (currentStatus == FishingBot.FishingBotStatus.RUNNING) {
                    log("DEL naciśnięty - wyłączanie bota...");
                    fishingBot.stop();
                } else {
                    log("DEL naciśnięty - włączanie bota (status: " + currentStatus + ")...");
                    fishingBot.startFishing();
                }
            }
        }
        
        if (keyCode == NativeKeyEvent.VC_INSERT) {
            log("INSERT naciśnięty - zamykanie aplikacji...");
            shutdown();
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
    }

    private boolean isMTASARunning() {
        try {
            Process p = new ProcessBuilder("tasklist").redirectErrorStream(true).start();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String lower = line.toLowerCase();
                    if (lower.contains("gta_sa.exe") || lower.contains("mta.exe")) {
                        return true;
                    }
                }
            }
        } catch (IOException ignored) {}
        return false;
    }

    public void log(String message) {
        try {
            String line = "[" + LocalDateTime.now().format(LOG_FMT) + "] " + message + System.lineSeparator();
            Files.createDirectories(LOG_PATH.getParent());
            Files.writeString(LOG_PATH, line, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.print(line);
        } catch (Exception e) {
            System.err.println("Błąd zapisu do logu: " + e.getMessage());
        }
    }
}

