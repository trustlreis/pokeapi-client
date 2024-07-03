package com.trustly.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Other(
    @JsonProperty("dream_world") DreamWorld dreamWorld, 
    Home home, 
    @JsonProperty("official-artwork") OfficialArtwork officialArtwork,
    Showdown showdown
) {
}
