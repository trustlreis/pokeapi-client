package com.truslty.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Ability(
    @JsonProperty("is_hidden") boolean isHidden, 
    int slot, 
    AbilityDetail ability
) {
}
