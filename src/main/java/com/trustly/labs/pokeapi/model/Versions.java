package com.trustly.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Versions(
    @JsonProperty("generation-i") GenerationI generationI,
    @JsonProperty("generation-ii") GenerationIi generationIi,
    @JsonProperty("generation-iii") GenerationIii generationIii,
    @JsonProperty("generation-iv") GenerationIv generationIv,
    @JsonProperty("generation-v") GenerationV generationV,
    @JsonProperty("generation-vi") GenerationVi generationVi,
    @JsonProperty("generation-vii") GenerationVii generationVii,
    @JsonProperty("generation-viii") GenerationViii generationViii
) {
}
