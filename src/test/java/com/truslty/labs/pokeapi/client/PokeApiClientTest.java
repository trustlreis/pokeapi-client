package com.truslty.labs.pokeapi.client;

import com.truslty.labs.pokeapi.model.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PokeApiClientTest {

    @Test
    void testGetPokemonWithMock() throws IOException, InterruptedException {
        PokeApiClient client = Mockito.spy(new PokeApiClient("https://pokeapi.co/api/v2"));
        doReturn(new Pokemon(
                132,
                "ditto",
                101,
                3,
                40,
                true,
                1,
                Collections.emptyList(),
                Collections.emptyList(),
                Collections.emptyList(),
                Collections.emptyList(),
                Collections.emptyList(),
                "",
                Collections.emptyList(),
                new Species("species-name", "species-url"),
                new Sprites("back_default", "back_female", "back_shiny", "back_shiny_female",
                        "front_default", "front_female", "front_shiny", "front_shiny_female",
                        new Other(new DreamWorld("front_default", "front_female"),
                                new Home("front_default", "front_female", "front_shiny", "front_shiny_female"),
                                new OfficialArtwork("front_default", "front_shiny"),
                                new Showdown("front_default", "front_female", "front_shiny", "front_shiny_female", 
                                             "back_default", "back_female", "back_shiny", "back_shiny_female")),
                        new Versions(
                                new GenerationI(new RedBlue("back_default", "back_gray", "back_transparent", "front_default", "front_gray", "front_transparent"),
                                        new Yellow("back_default", "back_gray", "back_transparent", "front_default", "front_gray", "front_transparent")),
                                new GenerationIi(new Crystal("back_default", "back_shiny", "back_shiny_transparent", "back_transparent", "front_default", "front_shiny", "front_shiny_transparent", "front_transparent"),
                                        new Gold("back_default", "back_shiny", "front_default", "front_shiny", "front_transparent"),
                                        new Silver("back_default", "back_shiny", "front_default", "front_shiny", "front_transparent")),
                                new GenerationIii(new Emerald("front_default", "front_shiny"),
                                        new FireredLeafgreen("back_default", "back_shiny", "front_default", "front_shiny"),
                                        new RubySapphire("back_default", "back_shiny", "front_default", "front_shiny")),
                                new GenerationIv(new DiamondPearl("back_default", "back_female", "back_shiny", "back_shiny_female", "front_default", "front_female", "front_shiny", "front_shiny_female"),
                                        new HeartgoldSoulsilver("back_default", "back_female", "back_shiny", "back_shiny_female", "front_default", "front_female", "front_shiny", "front_shiny_female"),
                                        new Platinum("back_default", "back_female", "back_shiny", "back_shiny_female", "front_default", "front_female", "front_shiny", "front_shiny_female")),
                                new GenerationV(new BlackWhite(new Animated("back_default", "back_female", "back_shiny", "back_shiny_female", "front_default", "front_female", "front_shiny", "front_shiny_female"),
                                        "back_default", "back_female", "back_shiny", "back_shiny_female", "front_default", "front_female", "front_shiny", "front_shiny_female")),
                                new GenerationVi(new OmegarubyAlphasapphire("front_default", "front_female", "front_shiny", "front_shiny_female"),
                                        new XY("front_default", "front_female", "front_shiny", "front_shiny_female")),
                                new GenerationVii(new Icons("front_default", "front_female"),
                                        new UltraSunUltraMoon("front_default", "front_female", "front_shiny", "front_shiny_female")),
                                new GenerationViii(new Icons("front_default", "front_female"))
                        )
                ),
                Collections.emptyList(),
                Collections.emptyList(),
                Collections.emptyList(),
                new Cries("latest-url", "legacy-url")
        )).when(client).getPokemon("ditto");

        Pokemon pokemon = client.getPokemon("ditto");

        assertNotNull(pokemon);
        assertEquals("ditto", pokemon.name());
    }
}
