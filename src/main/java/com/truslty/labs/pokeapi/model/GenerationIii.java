package com.truslty.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GenerationIii(
    Emerald emerald, 
    @JsonProperty("firered-leafgreen") FireredLeafgreen fireredLeafgreen,
    @JsonProperty("ruby-sapphire") RubySapphire rubySapphire
) {
}
