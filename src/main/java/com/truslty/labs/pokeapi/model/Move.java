package com.truslty.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public record Move(
    MoveDetail move, 
    @JsonProperty("version_group_details") List<VersionGroupDetail> versionGroupDetails
) {
}
