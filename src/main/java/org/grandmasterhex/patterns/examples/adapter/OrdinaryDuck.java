package org.grandmasterhex.patterns.examples.adapter;

/**
 * Created by kvatashydze on 12/6/13.
 */
public class OrdinaryDuck implements Duck{
    public void quack(){
        System.out.print("Quack");
    }
    public void fly(){
        System.out.print("I'm flying");
    }
}
