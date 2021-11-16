package com.Foundry.pokeGateway.pokemon;

public class Type {
    private int id;
    private String name;

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

    public TypeRelations getDamage_relations() {
        return damage_relations;
    }

    public void setDamage_relations(TypeRelations damage_relations) {
        this.damage_relations = damage_relations;
    }

    private TypeRelations damage_relations;

}
