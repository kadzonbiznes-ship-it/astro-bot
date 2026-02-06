package me.spinbara.server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;

public class BasicHttpServer {

    private static final long LICENSE_REFRESH_INTERVAL = 60000L;
    private static final long USAGE_REFRESH_INTERVAL = 30000L;

    private final JSONArray licenses = new JSONArray();
    private final JSONArray licenseUsage = new JSONArray();

    public static void main(String[] args) throws IOException {
        new BasicHttpServer();
    }

    public BasicHttpServer() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/checkLicense", new CheckLicenseHandler());
        server.setExecutor((Executor) null);
        server.start();

        startLicenseLoader();
        startLicenseUsageLoader();
    }

    private void startLicenseLoader() {
        new Timer(true).scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    File licensesFile = new File(getServerDirectory(), "licenses.json");
                    JSONArray loadedLicenses = new JSONArray();
                    if (licensesFile.exists() && licensesFile.length() > 0) {
                        String content = Files.readString(licensesFile.toPath(), StandardCharsets.UTF_8);
                        loadedLicenses = content.isBlank() ? new JSONArray() : new JSONArray(content);
                    } else {
                        System.err.println("Ostrzeżenie: Plik licenses.json nie istnieje lub jest pusty");
                    }

                    synchronized (licenses) {
                        licenses.clear();
                        for (int i = 0; i < loadedLicenses.length(); i++) {
                            licenses.put(loadedLicenses.getJSONObject(i));
                        }
                    }
                } catch (Exception e) {
                    System.err.println("Błąd podczas ładowania licencji: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }, 0L, LICENSE_REFRESH_INTERVAL);
    }

    private void startLicenseUsageLoader() {
        new Timer(true).scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    File usageFile = new File(getServerDirectory(), "license_usage.json");
                    JSONArray loadedUsage = new JSONArray();
                    if (usageFile.exists()) {
                        loadedUsage = new JSONArray(Files.readString(usageFile.toPath(), StandardCharsets.UTF_8));
                    } else {
                        Files.write(usageFile.toPath(), "[]".getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
                    }

                    synchronized (licenseUsage) {
                        licenseUsage.clear();
                        for (int i = 0; i < loadedUsage.length(); i++) {
                            licenseUsage.put(loadedUsage.getJSONObject(i));
                        }
                    }
                } catch (Exception e) {
                    System.err.println("Błąd podczas odświeżania użycia licencji: " + e.getMessage());
                }
            }
        }, 0L, USAGE_REFRESH_INTERVAL);
    }

    private File getServerDirectory() throws Exception {
        return new File(BasicHttpServer.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile();
    }

    private static Map<String, String> parseQuery(String rawQuery) {
        Map<String, String> map = new HashMap<>();
        if (rawQuery != null && !rawQuery.isEmpty()) {
            String[] pairs = rawQuery.split("&");
            for (String pair : pairs) {
                int idx = pair.indexOf('=');
                String key = idx > 0 ? urlDecode(pair.substring(0, idx)) : urlDecode(pair);
                String val = idx > 0 && pair.length() > idx + 1 ? urlDecode(pair.substring(idx + 1)) : "";
                map.put(key, val);
            }
        }
        return map;
    }

    private static String urlDecode(String s) {
        return URLDecoder.decode(s, StandardCharsets.UTF_8);
    }

    class CheckLicenseHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) {
            try {
                if (!"POST".equalsIgnoreCase(exchange.getRequestMethod())) {
                    sendEmptyResponse(exchange, 405);
                    return;
                }

                String body = new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8);
                if (body.isEmpty()) {
                    sendEmptyResponse(exchange, 403);
                    return;
                }

                JSONObject requestData = parseRequestBody(body);
                String licenseKey = requestData.getString("license");
                String hardwareId = requestData.optString("hardware", "unknown");

                if (!isLicenseValid(licenseKey)) {
                    sendEmptyResponse(exchange, 403);
                    return;
                }

                boolean licenseUsed;
                boolean hardwareMatch;
                JSONObject usageRecord = null;

                synchronized (licenseUsage) {
                    licenseUsed = false;
                    hardwareMatch = false;
                    for (int i = 0; i < licenseUsage.length(); i++) {
                        JSONObject usage = licenseUsage.getJSONObject(i);
                        if (usage.getString("license").equals(licenseKey)) {
                            licenseUsed = true;
                            if (usage.getString("hardware").equals(hardwareId)) {
                                hardwareMatch = true;
                                usageRecord = usage;
                            }
                            break;
                        }
                    }

                    if (licenseUsed && !hardwareMatch) {
                        JSONObject json = new JSONObject();
                        json.put("error", "License already used on different computer");
                        json.put("valid", "no");
                        sendJsonResponse(exchange, 403, json);
                        return;
                    }

                    long now = System.currentTimeMillis();
                    if (!licenseUsed) {
                        usageRecord = new JSONObject();
                        usageRecord.put("license", licenseKey);
                        usageRecord.put("hardware", hardwareId);
                        usageRecord.put("firstUsed", now);
                        usageRecord.put("lastUsed", now);
                        licenseUsage.put(usageRecord);
                    } else {
                        usageRecord.put("lastUsed", now);
                    }
                    saveLicenseUsage();
                }

                JSONObject jsonResponse = new JSONObject();
                jsonResponse.put("valid", "yes");
                jsonResponse.put("expires", "9999-99-99");
                sendJsonResponse(exchange, 200, jsonResponse);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private JSONObject parseRequestBody(String body) {
            try {
                return new JSONObject(body);
            } catch (Exception e) {
                JSONObject json = new JSONObject();
                json.put("license", body);
                json.put("hardware", "legacy_client");
                return json;
            }
        }

        private boolean isLicenseValid(String licenseKey) {
            synchronized (licenses) {
                for (int i = 0; i < licenses.length(); i++) {
                    JSONObject lic = licenses.getJSONObject(i);
                    if (lic.has("key") && lic.getString("key").equals(licenseKey)) {
                        if (!lic.has("expires")) return true;
                        try {
                            LocalDate expirationDate = LocalDate.parse(lic.getString("expires"), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                            return !LocalDate.now().isAfter(expirationDate);
                        } catch (DateTimeParseException e) {
                            System.err.println("Błąd parsowania daty wygaśnięcia dla licencji: " + licenseKey + " - " + e.getMessage());
                        }
                    }
                }
            }
            return false;
        }

        private void sendJsonResponse(HttpExchange exchange, int status, JSONObject json) throws IOException {
            byte[] bytes = json.toString().getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().add("Content-Type", "application/json; charset=utf-8");
            exchange.sendResponseHeaders(status, bytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(bytes);
            }
            exchange.close();
        }

        private void sendEmptyResponse(HttpExchange exchange, int status) throws IOException {
            exchange.sendResponseHeaders(status, 0);
            exchange.close();
        }

        private void saveLicenseUsage() {
            try {
                File usageFile = new File(getServerDirectory(), "license_usage.json");
                synchronized (licenseUsage) {
                    Files.write(usageFile.toPath(), licenseUsage.toString().getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
                }
            } catch (Exception e) {
                System.err.println("Błąd podczas zapisywania użycia licencji: " + e.getMessage());
            }
        }
    }
}
