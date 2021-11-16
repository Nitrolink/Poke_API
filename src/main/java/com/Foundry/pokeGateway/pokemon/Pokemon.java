package com.Foundry.pokeGateway.pokemon;


import com.Foundry.pokeGateway.ResponseObject;

import java.util.List;

public class Pokemon extends ResponseObject {
    private int id;
    private String name;

    private boolean is_default;
    private List<PokemonAbility> abilities;
    private List<NamedAPIResource> forms;
    private List<PokemonType> types;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIs_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public List<PokemonAbility> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<PokemonAbility> abilities) {
        this.abilities = abilities;
    }

    public List<NamedAPIResource> getForms() {
        return forms;
    }

    public void setForms(List<NamedAPIResource> forms) {
        this.forms = forms;
    }

    public List<PokemonType> getTypes() {
        return types;
    }

    public void setTypes(List<PokemonType> types) {
        this.types = types;
    }
}
