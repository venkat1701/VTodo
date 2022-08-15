package io.github.venkat1701.vtodo.request;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.*;
public class HttpSendRequest {


    @SneakyThrows
    public static String sendRequest() {
        HttpClient client = HttpClient.newBuilder().build();

        HttpRequest request = HttpRequest
                .newBuilder(URI.create("https://quotes15.p.rapidapi.com/quotes/random/?language_code=en"))
                .header("X-RapidAPI-Host", "quotes15.p.rapidapi.com")
                .header("X-RapidAPI-Key", "661fa8cfa5msh760bf94e75b6c13p11c42ajsnef40e40940c3")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        return response.body();
    }
}
