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
                    .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1" + userId))
                    .header("Accept", "application/json")
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return gson.fromJson(response.body(), User.class);

        } catch (Exception e) {
            // Instead of throwing, just return null or a default object
            return null;
        }
    }
}

//public class Api {
//    public User fetchUserById(int userId) throws Exception {
//        // Make API call
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1" + userId))
//                .build();
//
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//        String json = response.body();
//
//        // Parse JSON
//        Gson gson = new Gson();
//        User user = gson.fromJson(json, User.class);
//
//        return user;
//    }
//}
