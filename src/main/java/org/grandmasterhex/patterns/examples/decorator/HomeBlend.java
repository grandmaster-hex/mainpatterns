package org.grandmasterhex.patterns.examples.decorator;

/**
 * Created by kvatashydze on 12/6/13.
 */
public class HomeBlend extends Beverage {
    public HomeBlend(){
        description = "Home Blend Coffee";
    }
    @Override
    public double cost() {
        return 3;
    }
}
