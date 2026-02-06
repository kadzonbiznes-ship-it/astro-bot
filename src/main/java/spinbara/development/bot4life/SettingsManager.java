package spinbara.development.bot4life;

import spinbara.development.bot4life.config.Constants;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class SettingsManager {

    public static void save(String key, String value) {
        try {
            File file = new File(Constants.SETTINGS_FILE);
            Map<String, String> settings = new LinkedHashMap<>();

            if (file.exists()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] parts = line.split(":", 2);
                        if (parts.length == 2) {
                            settings.put(parts[0].trim(), parts[1].trim().replaceAll("^\"|\"$", ""));
                        }
                    }
                }
            }

            settings.put(key, value);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (Map.Entry<String, String> entry : settings.entrySet()) {
                    writer.write(entry.getKey() + ": \"" + entry.getValue() + "\"");
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.err.println("Error saving settings: " + e.getMessage());
        }
    }

    public static String get(String key, String defaultValue) {
        try {
            File file = new File(Constants.SETTINGS_FILE);
            if (file.exists()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] parts = line.split(":", 2);
                        if (parts.length == 2 && parts[0].trim().equals(key)) {
                            return parts[1].trim().replaceAll("^\"|\"$", "");
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading settings: " + e.getMessage());
        }
        return defaultValue;
    }
}
