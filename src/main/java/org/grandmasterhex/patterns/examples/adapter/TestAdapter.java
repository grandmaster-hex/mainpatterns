package org.grandmasterhex.patterns.examples.adapter;

/**
 * Created by kvatashydze on 12/6/13.
 */
public class TestAdapter
{
    public static void main(String[] args){
        Duck duck = new OrdinaryDuck();

        Turkey turkey = new OrdinaryTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.print("\nTurkey: ");
        turkey.voice();
        turkey.fly();

        System.out.print("\nDuck: ");
        duck.quack();
        duck.fly();

        System.out.print("\nTurkeyAdapter: ");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
