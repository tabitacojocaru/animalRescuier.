package org.fattrackit;

public class Veterinarian extends Humans {

    public double theAmountOfMoneyAvailable;
    String specialization;
    float workhours;
    boolean availability;

    Veterinarian veterinarian = new Veterinarian("Thomas");


    Veterinarian(String name) {
        super(name);
    }
}
