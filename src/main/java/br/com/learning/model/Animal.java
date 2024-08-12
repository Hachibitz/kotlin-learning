package br.com.learning.model;

public class Animal {

    private String name;
    private String species;
    private Integer weight;

    public Animal(String name, String species, Integer weight) {
        this.name = name;
        this.species = species;
        this.weight = weight;
    }

    public String show() {
        return name + " is a " + species + " and weights " + weight + " kg";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
