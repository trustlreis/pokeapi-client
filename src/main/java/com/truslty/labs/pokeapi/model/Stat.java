package com.truslty.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Stat(
    @JsonProperty("base_stat") int baseStat, 
    int effort, 
    StatDetail stat
) {
}
