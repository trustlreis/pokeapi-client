package com.trustly.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GenerationV(
    @JsonProperty("black-white") BlackWhite blackWhite
) {
}
