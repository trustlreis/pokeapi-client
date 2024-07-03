package com.trustly.labs.pokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public record Pokemon(
    int id,
    String name,
    @JsonProperty("base_experience") int baseExperience,
    int height,
    int weight,
    @JsonProperty("is_default") boolean isDefault,
    int order,
    List<Ability> abilities,
    @JsonProperty("past_abilities") List<PastAbility> pastAbilities,
    List<Form> forms,
    @JsonProperty("game_indices") List<GameIndex> gameIndices,
    @JsonProperty("held_items") List<HeldItem> heldItems,
    @JsonProperty("location_area_encounters") String locationAreaEncounters,
    List<Move> moves,
    Species species,
    Sprites sprites,
    List<Stat> stats,
    List<Type> types,
    @JsonProperty("past_types") List<PastType> pastTypes,
    Cries cries
) {
}
