package com.truslty.labs.pokeapi.client;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.truslty.labs.pokeapi.model.Pokemon;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PokeApiClientWireMockCT {

    private static WireMockServer wireMockServer;

    @BeforeAll
    static void setup() {
        wireMockServer = new WireMockServer(WireMockConfiguration.wireMockConfig().port(8080));
        wireMockServer.start();
        WireMock.configureFor("localhost", 8080);

        // Load the JSON response from the resource file using ClassLoader
        String dittoJson;
        try {
            dittoJson = new String(Files.readAllBytes(Paths.get(
                    PokeApiClientWireMockCT.class.getClassLoader().getResource("ditto.json").toURI())), StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load ditto.json", e);
        }

        stubFor(get(urlEqualTo("/api/v2/pokemon/ditto"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "application/json")
                        .withBody(dittoJson)));
    }

    @AfterAll
    static void teardown() {
        wireMockServer.stop();
    }

    @Test
    void testGetPokemonWithWireMock() throws IOException, InterruptedException {
        PokeApiClient client = new PokeApiClient("http://localhost:8080/api/v2");
        Pokemon pokemon = client.getPokemon("ditto");

        assertNotNull(pokemon);
        assertEquals(132, pokemon.id());
        assertEquals("ditto", pokemon.name());
        assertEquals(101, pokemon.baseExperience());
        assertEquals(3, pokemon.height());
        assertEquals(40, pokemon.weight());
        assertTrue(pokemon.isDefault());
        assertEquals(214, pokemon.order());
        assertNotNull(pokemon.abilities());
        assertNotNull(pokemon.pastAbilities());
        assertNotNull(pokemon.forms());
        assertNotNull(pokemon.gameIndices());
        assertNotNull(pokemon.heldItems());
        assertNotNull(pokemon.locationAreaEncounters());
        assertNotNull(pokemon.moves());
        assertNotNull(pokemon.species());
        assertNotNull(pokemon.sprites());
        assertNotNull(pokemon.stats());
        assertNotNull(pokemon.types());
        assertNotNull(pokemon.pastTypes());
        assertNotNull(pokemon.cries());
    }
}
