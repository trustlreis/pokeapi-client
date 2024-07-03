package com.trustly.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PastAbility(
    @JsonProperty("ability") Ability ability,
    @JsonProperty("version_group") VersionGroup versionGroup
) {
}
