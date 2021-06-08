package com.eduardosoares.serviceStatistics;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.springframework.stereotype.Component;

@Component
public class ServiceStatistics {

    public double avg(String values) {

        String[] numbers = values.split(",");

        return requestSum(values) / numbers.length;
    }

    public static int requestSum(String numbers) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().GET()
                .uri(URI.create("http://host.docker.internal:8080/math/sum?values=" + numbers)).build();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return (int) Double.parseDouble(response.body());
    }
}