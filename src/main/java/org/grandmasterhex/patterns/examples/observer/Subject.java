package org.grandmasterhex.patterns.examples.observer;

/**
 * Created by kvatashydze on 12/6/13.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
