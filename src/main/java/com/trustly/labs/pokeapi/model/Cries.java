package com.trustly.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Cries(
    @JsonProperty("latest") String latest,
    @JsonProperty("legacy") String legacy
) {
}
