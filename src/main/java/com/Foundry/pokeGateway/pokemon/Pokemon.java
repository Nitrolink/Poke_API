package com.Foundry.pokeGateway.pokemon;


import com.Foundry.pokeGateway.ResponseObject;

import java.util.List;

public class Pokemon extends ResponseObject {
    private int id;
    private String name;
    private boolean is_default;
    private List<PokemonAbility> abilities;
    private List<PokemonForm> forms;


}
