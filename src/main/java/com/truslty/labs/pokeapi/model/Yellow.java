package com.truslty.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Yellow(
    @JsonProperty("back_default") String backDefault, 
    @JsonProperty("back_gray") String backGray,
    @JsonProperty("back_transparent") String backTransparent, 
    @JsonProperty("front_default") String frontDefault,
    @JsonProperty("front_gray") String frontGray, 
    @JsonProperty("front_transparent") String frontTransparent
) {
}
