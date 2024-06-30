package com.truslty.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public record HeldItem(
    Item item, 
    @JsonProperty("version_details") List<VersionDetail> versionDetails
) {
}
