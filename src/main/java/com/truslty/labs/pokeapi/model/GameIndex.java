package com.truslty.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GameIndex(
    @JsonProperty("game_index") int gameIndex, 
    Version version
) {
}
