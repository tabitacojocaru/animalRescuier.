package org.fattrackit;

import java.util.concurrent.Callable;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        System.out.println("Hello World!");


        Animal animal = new Animal("Cat", "Lola");

        AnimalFood food = new AnimalFood("Whiskas");
        food.setFavoriteFood("Whiskas");

        Adopter adopter = new Adopter("Jhon");
        System.out.println("The cat's name is: " + animal.getName() + ", and she eat: " + food.getFavoriteFood() + ".");


        RecreationalActivity activity = new RecreationalActivity("Walk");

        System.out.println(adopter.getName() + " walks with " + animal.getName() + ".");


    }


}
