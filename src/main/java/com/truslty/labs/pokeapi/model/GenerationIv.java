package com.truslty.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GenerationIv(
    @JsonProperty("diamond-pearl") DiamondPearl diamondPearl, 
    @JsonProperty("heartgold-soulsilver") HeartgoldSoulsilver heartgoldSoulsilver,
    Platinum platinum
) {
}
