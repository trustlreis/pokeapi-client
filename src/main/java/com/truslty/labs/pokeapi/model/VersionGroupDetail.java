package com.truslty.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record VersionGroupDetail(
    @JsonProperty("level_learned_at") int levelLearnedAt, 
    @JsonProperty("version_group") VersionGroup versionGroup, 
    @JsonProperty("move_learn_method") MoveLearnMethod moveLearnMethod
) {
}
