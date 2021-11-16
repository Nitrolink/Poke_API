package com.Foundry.pokeGateway.pokemon;

public class VerboseEffect {
    private String effect;
    private String short_effect;
    private Language language;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getShort_effect() {
        return short_effect;
    }

    public void setShort_effect(String short_effect) {
        this.short_effect = short_effect;
    }
}
