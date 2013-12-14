package org.grandmasterhex.patterns.examples.decorator;

/**
 * Created by kvatashydze on 12/6/13.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        return 10+beverage.cost();
    }
}
