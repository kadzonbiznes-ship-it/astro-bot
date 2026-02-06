package spinbara.development.bot4life.core.monitoring;

import spinbara.development.bot4life.config.Constants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Sprawdza czy procesy MTA:SA są uruchomione (z prostym cache).
 */
public final class MtaSaProcessChecker {

    private long lastCheckTime;
    private boolean lastCheckResult;

    public boolean isRunning() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastCheckTime < Constants.CACHE_DURATION_MS) {
            return lastCheckResult;
        }

        boolean running = false;
        try {
            Process p = new ProcessBuilder("tasklist").redirectErrorStream(true).start();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String lower = line.toLowerCase();
                    if (lower.contains("gta_sa.exe") || lower.contains("mta.exe")) {
                        running = true;
                        break;
                    }
                }
            }
        } catch (IOException ignored) {
        }

        lastCheckTime = currentTime;
        lastCheckResult = running;
        return running;
    }
}

