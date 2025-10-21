package org.example;

import java.net.http.*;
import java.net.URI;
import com.google.gson.Gson;

public class Api {
    private final HttpClient client = HttpClient.newHttpClient();
    private final Gson gson = new Gson();

    public User fetchUserById(int userId) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://jsonplaceholder.typicode.com/posts/" + userId))
                    .header("Accept", "application/json")
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return gson.fromJson(response.body(), User.class);

        } catch (Exception e) {
            return null;
        }
    }
}
