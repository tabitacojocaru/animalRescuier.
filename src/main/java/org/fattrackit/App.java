package org.fattrackit;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
                Animal firstAnimal = new Animal();
        firstAnimal.name = "Lola";
        firstAnimal.age = 1;
        firstAnimal.favoriteClothes = "overall";
        firstAnimal.favoriteRecreationalActivity = "toWalk";
        firstAnimal.favoriteFood = "Whiskas";
        firstAnimal.theAmountOfMoneyAvailable = 20;
        firstAnimal.favoriteMusic = "Clasic";


                Adopter adopter = new Adopter();
        adopter.name = "Jessy";
        adopter.theAmountOfMoneyAvailable = 120;


                AnimalFood animalFood = new AnimalFood();
        animalFood.name = "Whiskas";
        animalFood.favoriteFood = "Whiskas";
        animalFood.amount = 3;
        animalFood.availability = true;
        animalFood.price = 13;


                 RecreationalActivity recreatinalActivity = new RecreationalActivity();
        recreatinalActivity.favoriteRecreationalActivity = "toWalk";
        recreatinalActivity.name = "toWalk";
        recreatinalActivity.time = 1;


                Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Jhon";
        veterinarian.specialization = "general";
        veterinarian.availability = true;
        veterinarian.theAmountOfMoneyAvailable = 2500;










    }




}
