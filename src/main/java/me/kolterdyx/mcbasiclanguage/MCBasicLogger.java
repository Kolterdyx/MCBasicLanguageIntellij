package me.kolterdyx.mcbasiclanguage;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class MCBasicLogger {

    public static void log(String message) {
        var uri = URI.create("http://localhost:5000/");
        var client = HttpClient.newHttpClient();
        var request = HttpRequest
                .newBuilder()
                .uri(uri)
                .version(HttpClient.Version.HTTP_2)
                .timeout(Duration.ofMinutes(1))
                .header("Content-Type", "text/plain")
                .POST(HttpRequest.BodyPublishers.ofString(message))
                .build();
        try {
            var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            System.out.println("[MCBasic] " + e);
        }
        System.out.println("[MCBasic] " + message);
    }

    public static void error(String message) {
        System.err.println("[MCBasic ERROR] " + message);
    }
}
