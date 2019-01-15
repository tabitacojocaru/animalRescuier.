package org.fattrackit;

public class Animal extends Creatures {


    private String favoriteMusic;
    private String favoriteClothes;
    private String favoriteFood;
    private String favoriteRecreationalActivity;
    private int theLevelOfHealth;
    private int theLevelOfHunger;
    private int theLeverOfMood;

    Animal(String species,String name) {
        super(species, name);
    }

    public String getFavoriteMusic() {
        return favoriteMusic;
    }

    public void setFavoriteMusic(String favoriteMusic) {
        this.favoriteMusic = favoriteMusic;
    }

    public String getFavoriteClothes() {
        return favoriteClothes;
    }

    private void setFavoriteClothes(String favoriteClothes) {
        this.favoriteClothes = favoriteClothes;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteRecreationalActivity() {
        return favoriteRecreationalActivity;
    }

    public void setFavoriteRecreationalActivity(String favoriteRecreationalActivity) {
        this.favoriteRecreationalActivity = favoriteRecreationalActivity;
    }

    public int getTheLevelOfHealth() {
        return theLevelOfHealth;
    }

    public void setTheLevelOfHealth(int theLevelOfHealth) {
        this.theLevelOfHealth = theLevelOfHealth;
    }

    public int getTheLevelOfHunger() {
        return theLevelOfHunger;
    }

    public void setTheLevelOfHunger(int theLevelOfHunger) {
        this.theLevelOfHunger = theLevelOfHunger;
    }

    public int getTheLeverOfMood() {
        return theLeverOfMood;
    }

    public void setTheLeverOfMood(int theLeverOfMood) {
        this.theLeverOfMood = theLeverOfMood;
    }
}


