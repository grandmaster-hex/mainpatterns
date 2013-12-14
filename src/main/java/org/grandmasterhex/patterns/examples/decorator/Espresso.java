package org.grandmasterhex.patterns.examples.decorator;

/**
 * Created by kvatashydze on 12/6/13.
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }

    public double cost(){
        return 2;
    }
}
