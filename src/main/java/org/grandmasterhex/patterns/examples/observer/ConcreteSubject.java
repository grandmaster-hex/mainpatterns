package org.grandmasterhex.patterns.examples.observer;

import java.util.ArrayList;

/**
 * Created by kvatashydze on 12/6/13.
 */
public class ConcreteSubject implements Subject{
    private ArrayList<Observer> observers;
    private int someData;
    private int anotherData;
    
    public ConcreteSubject(){
        this.observers = new ArrayList();
        
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0) observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i<observers.size(); i++){
            Observer observer = observers.get(i);
            observer.update(someData, anotherData);
        }
    }

    public void dataChanged(){
        notifyObservers();
    }

    public void setData(int someData, int anotherData){
        this.someData = someData;
        this.anotherData = anotherData;
        dataChanged();
    }
}
