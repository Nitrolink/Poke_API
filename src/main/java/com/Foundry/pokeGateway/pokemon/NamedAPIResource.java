package com.Foundry.pokeGateway.pokemon;

public class NamedAPIResource {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String name;
    String url;
}
