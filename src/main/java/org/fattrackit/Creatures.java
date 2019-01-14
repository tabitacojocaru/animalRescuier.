package org.fattrackit;

public class Creatures {
    private String species;
    private String race;
    private String name;
    private String color;
    private double age;
    private boolean fur;
    private boolean disease;

    Creatures(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}


