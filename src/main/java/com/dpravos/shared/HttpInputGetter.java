package com.dpravos.shared;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpInputGetter implements InputGetter {
    public String day(int day) {

        try {
            URI uri = new URI("https://adventofcode.com/2022/day/" + day + "/input");

            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(uri)
                    .header("Cookie", "session=53616c7465645f5fb6afe6ea99439dd7b7c1ccca50e43607906ed3ddb1473c54881ac978b2ca98426f73d096683c7d467c531d6832facea0f8010e1c6090163f")
                    .GET()
                    .build();
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            return response.body();
        } catch (IOException | InterruptedException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
