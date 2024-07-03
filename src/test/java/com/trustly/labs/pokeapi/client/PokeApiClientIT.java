package com.trustly.labs.pokeapi.client;

import org.junit.jupiter.api.Test;

import com.trustly.labs.pokeapi.model.*;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

class PokeApiClientIT {

    @Test
    void testGetPokemonIntegration() throws IOException, InterruptedException {
        PokeApiClient client = new PokeApiClient("https://pokeapi.co/api/v2");
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
