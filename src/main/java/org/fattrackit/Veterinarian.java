package org.fattrackit;

public class Veterinarian extends Humans {

    private double theAmountOfMoneyAvailable;
    private String specialization;
    private float workhours;
    private boolean availability;

    Veterinarian veterinarian = new Veterinarian("Thomas");


    Veterinarian(String name) {
        super(name);
    }

    public double getTheAmountOfMoneyAvailable() {
        return theAmountOfMoneyAvailable;
    }

    public void setTheAmountOfMoneyAvailable(double theAmountOfMoneyAvailable) {
        this.theAmountOfMoneyAvailable = theAmountOfMoneyAvailable;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public float getWorkhours() {
        return workhours;
    }

    public void setWorkhours(float workhours) {
        this.workhours = workhours;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
