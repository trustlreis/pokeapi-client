package com.truslty.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GenerationV(
    @JsonProperty("black-white") BlackWhite blackWhite
) {
}
