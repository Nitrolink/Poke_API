package com.Foundry.pokeGateway.pokemon;

public class PokemonType {
    private int slot;
    private NamedAPIResource type;

    public NamedAPIResource getType() {
        return type;
    }

    public void setType(NamedAPIResource type) {
        this.type = type;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}
