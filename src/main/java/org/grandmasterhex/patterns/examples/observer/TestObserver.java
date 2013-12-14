package org.grandmasterhex.patterns.examples.observer;

/**
 * Created by kvatashydze on 12/6/13.
 */
public class TestObserver {
    public static void main(String[] args){
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver(subject);
        subject.setData(2,3);
        subject.setData(3,4);
    }
}
