package com.truslty.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Silver(
    @JsonProperty("back_default") String backDefault, 
    @JsonProperty("back_shiny") String backShiny,
    @JsonProperty("front_default") String frontDefault, 
    @JsonProperty("front_shiny") String frontShiny,
    @JsonProperty("front_transparent") String frontTransparent
) {
}
