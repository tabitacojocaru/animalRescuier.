package org.fattrackit;

import java.time.LocalDateTime;

public class AnimalFood {
    String name;
    String favoriteFood;
    float price;
    float amount;
    boolean availability;
    LocalDateTime expiryDate;

    public AnimalFood(String name) {
        this.name = name;
    }

    public AnimalFood() {

    }
}
