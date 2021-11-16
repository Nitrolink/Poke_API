package com.Foundry.pokeGateway.pokemon;

import java.util.List;

public class PokemonForm {
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

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getForm_order() {
        return form_order;
    }

    public void setForm_order(int form_order) {
        this.form_order = form_order;
    }

    public boolean isIs_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public boolean isIs_battle_only() {
        return is_battle_only;
    }

    public void setIs_battle_only(boolean is_battle_only) {
        this.is_battle_only = is_battle_only;
    }

    public boolean isIs_mega() {
        return is_mega;
    }

    public void setIs_mega(boolean is_mega) {
        this.is_mega = is_mega;
    }

    public String getForm_name() {
        return form_name;
    }

    public void setForm_name(String form_name) {
        this.form_name = form_name;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public List<PokemonFormType> getTypes() {
        return types;
    }

    public void setTypes(List<PokemonFormType> types) {
        this.types = types;
    }

    private int id;
    private String name;
    private int order;
    private int form_order;
    private boolean is_default;
    private boolean is_battle_only;
    private boolean is_mega;
    private String form_name;
    private Pokemon pokemon;
    private List<PokemonFormType> types;

}
