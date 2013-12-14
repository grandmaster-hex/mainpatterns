package org.grandmasterhex.patterns.examples.adapter;

/**
 * Created by kvatashydze on 12/6/13.
 */
public class OrdinaryTurkey implements Turkey{

    @Override
    public void voice() {
        System.out.print("Voice Voice");
    }

    @Override
    public void fly() {
        System.out.print("I'm trying to fly!");
    }
}
