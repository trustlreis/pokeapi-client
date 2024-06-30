package com.truslty.labs.pokeapi.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.truslty.labs.pokeapi.model.Pokemon;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PokeApiClient {

    private static final String DEFAULT_ENDPOINT = "https://pokeapi.co/api/v2";
    private final String endpoint;
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public PokeApiClient() {
        this(DEFAULT_ENDPOINT);
    }

    public PokeApiClient(String endpoint) {
        this.endpoint = endpoint;
        this.httpClient = HttpClient.newHttpClient();
        this.objectMapper = new ObjectMapper();
    }

    public Pokemon getPokemon(String name) throws IOException, InterruptedException {
        String url = String.format("%s/pokemon/%s", endpoint, name);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return objectMapper.readValue(response.body(), Pokemon.class);
    }
}
