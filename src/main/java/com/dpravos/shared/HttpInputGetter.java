package com.dpravos.shared;

import io.github.cdimascio.dotenv.Dotenv;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpInputGetter implements InputGetter {

    @Override
    public Input day(int day) {

        try {
            URI uri = new URI("https://adventofcode.com/2022/day/" + day + "/input");

            Dotenv dotenv = Dotenv.load();

            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(uri)
                    .header("Cookie", "session=" + dotenv.get("SESSION_TOKEN"))
                    .GET()
                    .build();
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            return new Input(response.body());
        } catch (IOException | InterruptedException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
