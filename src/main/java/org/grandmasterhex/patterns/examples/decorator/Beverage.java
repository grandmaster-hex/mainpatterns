package org.grandmasterhex.patterns.examples.decorator;

/**
 * Created by kvatashydze on 12/6/13.
 */
public abstract class Beverage {
    String description = "Unknown Drink!";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
