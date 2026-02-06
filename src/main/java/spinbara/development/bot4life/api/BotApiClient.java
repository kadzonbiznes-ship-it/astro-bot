package spinbara.development.bot4life.api;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spinbara.development.bot4life.config.Constants;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Objects;

/**
 * Klient API dla punktów i aktywności bota.
 */
public final class BotApiClient {

    private static final Logger log = LoggerFactory.getLogger(BotApiClient.class);

    private final HttpClient client;
    private final Gson gson;
    private final String pointsApiUrl;
    private final String activityApiUrl;
    private final String license;

    public BotApiClient(String license) {
        this(
                HttpClient.newBuilder()
                        .version(HttpClient.Version.HTTP_1_1)
                        .connectTimeout(Duration.ofSeconds(5))
                        .build(),
                new Gson(),
                Constants.POINTS_API_URL,
                Constants.ACTIVITY_API_URL,
                license
        );
    }

    public BotApiClient(HttpClient client, Gson gson, String pointsApiUrl, String activityApiUrl, String license) {
        this.client = Objects.requireNonNull(client, "client");
        this.gson = Objects.requireNonNull(gson, "gson");
        this.pointsApiUrl = Objects.requireNonNull(pointsApiUrl, "pointsApiUrl");
        this.activityApiUrl = Objects.requireNonNull(activityApiUrl, "activityApiUrl");
        this.license = Objects.requireNonNull(license, "license");
    }

    public void sendPointsUpdateAsync(int minutes) {
        if (minutes <= 0) {
            return;
        }
        Thread t = new Thread(() -> sendPointsUpdate(minutes));
        t.setDaemon(true);
        t.setName("BotApiClient-Points");
        t.start();
    }

    public void sendActivityAsync(String action) {
        if (action == null || action.isBlank()) {
            return;
        }
        Thread t = new Thread(() -> sendActivity(action));
        t.setDaemon(true);
        t.setName("BotApiClient-Activity");
        t.start();
    }

    private void sendPointsUpdate(int minutes) {
        try {
            PointsUpdateRequest requestData = new PointsUpdateRequest(license, minutes);
            String jsonBody = gson.toJson(requestData);
            byte[] jsonBytes = jsonBody.getBytes(java.nio.charset.StandardCharsets.UTF_8);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(pointsApiUrl))
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .header("User-Agent", "AstroBot-Java/1.0")
                    .version(HttpClient.Version.HTTP_1_1)
                    .POST(HttpRequest.BodyPublishers.ofByteArray(jsonBytes))
                    .timeout(Duration.ofSeconds(10))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                log.warn("Non-OK response from points API: {}", response.statusCode());
            }
        } catch (Exception e) {
            log.warn("Failed to send points update", e);
        }
    }

    private void sendActivity(String action) {
        try {
            BotActivityRequest requestData = new BotActivityRequest(license, action);
            String jsonBody = gson.toJson(requestData);
            byte[] jsonBytes = jsonBody.getBytes(java.nio.charset.StandardCharsets.UTF_8);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(activityApiUrl))
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .header("User-Agent", "AstroBot-Java/1.0")
                    .version(HttpClient.Version.HTTP_1_1)
                    .POST(HttpRequest.BodyPublishers.ofByteArray(jsonBytes))
                    .timeout(Duration.ofSeconds(10))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                log.warn("Non-OK response from activity API: {}", response.statusCode());
            }
        } catch (Exception e) {
            log.warn("Failed to send bot activity: {}", action, e);
        }
    }
}

