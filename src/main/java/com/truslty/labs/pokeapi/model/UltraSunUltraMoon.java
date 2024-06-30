package com.truslty.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UltraSunUltraMoon(
    @JsonProperty("front_default") String frontDefault, 
    @JsonProperty("front_female") String frontFemale,
    @JsonProperty("front_shiny") String frontShiny, 
    @JsonProperty("front_shiny_female") String frontShinyFemale
) {
}
