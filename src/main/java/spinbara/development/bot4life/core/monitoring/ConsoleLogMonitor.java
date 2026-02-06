package spinbara.development.bot4life.core.monitoring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Monitoruje plik `console.log` MTA:SA i emituje zdarzenia (Observer).
 */
public final class ConsoleLogMonitor {

    private static final Logger log = LoggerFactory.getLogger(ConsoleLogMonitor.class);

    private final Path logPath;
    private final String fullBackpackMessage;
    private final String[] adminNicks;
    private final List<ConsoleLogEventListener> listeners = new CopyOnWriteArrayList<>();

    private final AtomicBoolean running = new AtomicBoolean(false);
    private Thread thread;
    private long lastPosition;

    public ConsoleLogMonitor(Path logPath, String fullBackpackMessage, String[] adminNicks) {
        this.logPath = logPath;
        this.fullBackpackMessage = fullBackpackMessage;
        this.adminNicks = adminNicks;
    }

    public void addListener(ConsoleLogEventListener listener) {
        if (listener != null) {
            listeners.add(listener);
        }
    }

    public void removeListener(ConsoleLogEventListener listener) {
        listeners.remove(listener);
    }

    public boolean isRunning() {
        return running.get();
    }

    public synchronized void start() {
        if (thread != null && thread.isAlive()) {
            return;
        }

        running.set(true);
        thread = new Thread(this::runLoop);
        thread.setDaemon(true);
        thread.setName("ConsoleLogMonitor");
        thread.start();
    }

    public synchronized void stop() {
        running.set(false);
        if (thread != null && thread.isAlive()) {
            thread.interrupt();
        }
    }

    private void runLoop() {
        try {
            if (!Files.exists(logPath)) {
                return;
            }

            lastPosition = Files.size(logPath);

            while (running.get() && !Thread.currentThread().isInterrupted()) {
                try {
                    if (Files.exists(logPath)) {
                        long currentSize = Files.size(logPath);
                        if (currentSize > lastPosition) {
                            processNewLines(currentSize);
                        }
                    }

                    if (running.get()) {
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                } catch (Exception e) {
                    log.warn("Console log monitor error", e);
                    if (running.get()) {
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ie) {
                            Thread.currentThread().interrupt();
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.warn("Console log monitor failed to start", e);
        }
    }

    private void processNewLines(long currentSize) throws Exception {
        try (RandomAccessFile raf = new RandomAccessFile(logPath.toFile(), "r")) {
            raf.seek(lastPosition);

            String line;
            while ((line = raf.readLine()) != null) {
                if (line == null || line.trim().isEmpty()) {
                    continue;
                }

                if (isFullBackpackLine(line)) {
                    for (ConsoleLogEventListener l : listeners) {
                        l.onFullBackpack();
                    }
                    break;
                }

                if (shouldScanAdmins(line)) {
                    for (String adminNick : adminNicks) {
                        if (line.contains(adminNick)) {
                            for (ConsoleLogEventListener l : listeners) {
                                l.onAdminDetected(adminNick);
                            }
                            break;
                        }
                    }
                }
            }
        } finally {
            lastPosition = currentSize;
        }
    }

    private boolean isFullBackpackLine(String line) {
        return line.contains("Nie możesz nosić") ||
                line.contains("więcej węgla") ||
                line.contains("oddaj go do wagonu") ||
                line.contains("Nie moÅ¼esz nosiÄ") ||
                line.contains("wiÄcej wÄgla") ||
                line.contains("oddaj go do wagonu") ||
                (fullBackpackMessage != null && line.contains(fullBackpackMessage));
    }

    private boolean shouldScanAdmins(String line) {
        return !line.contains(">>") && !line.contains("GO>") && !line.contains("G>") && !line.contains("GP>") &&
                !line.contains("otrzyma") && !line.contains("ostrze") && !line.contains("powód") &&
                !line.contains("powód: powód:") && !line.contains("został wyciszony") &&
                !line.contains("został zbanowany") && !line.contains("zbanowany przez") &&
                !line.contains("wyciszony przez") && !line.contains("porzucił walizkę") && !line.contains("Moderator") &&
                !line.contains("otrzymaĹ") && !line.contains("ostrzeĹ") && !line.contains("powĂłd") &&
                !line.contains("zostaĹ") && !line.contains("wyciszony") && !line.contains("zbanowany") &&
                !line.contains("porzuciĹ") && !line.contains("walizkÄ") && !line.contains("Moderator") && !line.contains("podpowiedĹş") &&
                !line.contains("Sweepery") && !line.contains("BK") && !line.contains("dni") &&
                !line.contains("kara") && !line.contains("omyĹ") && !line.contains("omyłkowa") &&
                !line.contains("Poprzednia") && !line.contains("pieniÄ") && !line.contains("pieniądze") &&
                !line.contains("wyrzucony") && !line.contains("wyrzucona") && !line.contains("wyrzucony/a") &&
                !line.contains("wyrzucona/a") && !line.contains("Prowokacje") &&
                !line.contains("> >") && !line.contains("/tpev") && !line.contains("zaprasza na licytacj") &&
                !line.contains("Domu Aukcyjnym") && !line.contains("Montgomery") && !line.contains("Start o godzinie");
    }
}

