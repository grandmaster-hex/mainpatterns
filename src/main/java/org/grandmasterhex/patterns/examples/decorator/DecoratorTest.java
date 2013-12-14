package org.grandmasterhex.patterns.examples.decorator;

import java.io.*;

/**
 * Created by kvatashydze on 12/6/13.
 */
public class DecoratorTest {
    public static void main(String[] args) throws FileNotFoundException {
        Beverage beverage = new Espresso();
        display(beverage.getDescription(), beverage.cost());

        Beverage beverageWithMocha = new HomeBlend();
        beverageWithMocha = new Mocha(new Mocha(new Mocha(beverageWithMocha)));
        display(beverageWithMocha.getDescription(), beverageWithMocha.cost());
        InputStream a = new ByteArrayInputStream(new ByteArrayInputStream(new byte[]));
    }
    public static void display(String str, double cost){
        System.out.println(str+" "+cost+" uah\n");
    }
}
