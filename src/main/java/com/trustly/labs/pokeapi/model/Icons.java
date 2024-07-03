package com.trustly.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Icons(
    @JsonProperty("front_default") String frontDefault, 
    @JsonProperty("front_female") String frontFemale
) {
}
