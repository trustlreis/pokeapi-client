package com.truslty.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Emerald(
    @JsonProperty("front_default") String frontDefault, 
    @JsonProperty("front_shiny") String frontShiny
) {
}
