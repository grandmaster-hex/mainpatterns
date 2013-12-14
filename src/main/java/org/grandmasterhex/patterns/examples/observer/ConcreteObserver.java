package org.grandmasterhex.patterns.examples.observer;

/**
 * Created by kvatashydze on 12/6/13.
 */
public class ConcreteObserver implements Observer{
    public int someData;
    public int anotherData;
    Subject data;
    ConcreteObserver(Subject data){
        this.data = data;
        data.registerObserver(this);
    }
    @Override
    public void update(int someData, int anotherData) {
        this.someData = someData;
        this.anotherData = anotherData;
        display();
    }
    public void display(){
        System.out.print("Concrete Observer: "+someData + " :"+anotherData);
    }
}
