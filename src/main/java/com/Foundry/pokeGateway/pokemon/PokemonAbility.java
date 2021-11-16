package com.Foundry.pokeGateway.pokemon;

public class PokemonAbility {
    private boolean is_hidden;
    private int slot;
    private Ability ablity;

    public boolean isIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public Ability getAblity() {
        return ablity;
    }

    public void setAblity(Ability ablity) {
        this.ablity = ablity;
    }
}
