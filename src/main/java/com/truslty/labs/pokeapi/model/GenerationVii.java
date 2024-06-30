package com.truslty.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GenerationVii(
    Icons icons, 
    @JsonProperty("ultra-sun-ultra-moon") UltraSunUltraMoon ultraSunUltraMoon
) {
}
