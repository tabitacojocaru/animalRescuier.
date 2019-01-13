package org.fattrackit;

public class Adopter extends Humans {

    float theAmountOfMoneyAvailable;


    public Adopter(String name) {
        super(name);
    }

    public Adopter() {
        super("Jhon");
    }

    public static void feed(String nameOfAnimal, String favoriteFood){
        System.out.println("Adopter feed the cat: "+  nameOfAnimal +  " with " + favoriteFood);

    }
    public static void walk(String nameOfAdopter, String nameOfRecreationalActivity, String nameOfCat){
        System.out.println(nameOfAdopter + " go "+ nameOfRecreationalActivity+" with "+nameOfCat);
    }




}

