package com.Foundry.pokeGateway.pokemon;

public class PokemonFormType {
    private int slot;

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public NamedAPIResource getType() {
        return type;
    }

    public void setType(NamedAPIResource type) {
        this.type = type;
    }

    private NamedAPIResource type;
}
