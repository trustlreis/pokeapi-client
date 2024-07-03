package com.trustly.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record OfficialArtwork(
    @JsonProperty("front_default") String frontDefault,
    @JsonProperty("front_shiny") String frontShiny
) {
}
