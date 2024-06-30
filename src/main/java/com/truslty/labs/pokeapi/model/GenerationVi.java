package com.truslty.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GenerationVi(
    @JsonProperty("omegaruby-alphasapphire") OmegarubyAlphasapphire omegarubyAlphasapphire,
    @JsonProperty("x-y") XY xy
) {
}
