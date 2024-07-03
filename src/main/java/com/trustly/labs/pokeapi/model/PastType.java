package com.trustly.labs.pokeapi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PastType(
    @JsonProperty("generation") Generation generation,
    @JsonProperty("types") List<Type> types
) {
}
