package com.truslty.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GenerationI(
    @JsonProperty("red-blue") RedBlue redBlue, 
    Yellow yellow
) {
}
