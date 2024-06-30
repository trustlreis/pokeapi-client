package com.truslty.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record DreamWorld(
    @JsonProperty("front_default") String frontDefault, 
    @JsonProperty("front_female") String frontFemale
) {
}
