package com.venia.observer1;

/**
 * Created by HOME on 21.12.2019.
 */
public interface Observable {
    public void registerObserver(Observer o);
    public void unregisterObserver(Observer o);
    public void notifyObservers();
    public void setMeasurements(float temperature, float humidity, int pressure);
}
