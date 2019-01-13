package org.fattrackit;

public class Veterinarian extends Humans{

    public double theAmountOfMoneyAvailable;
    String specialization;
    float workhours;
    boolean availability;

    public Veterinarian(String name) {
        super(name);
    }

    public Veterinarian() {
        super();
    }
}
