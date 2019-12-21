package com.venia.observer1;

/**
 * Created by HOME on 21.12.2019.
 */
public class App {
    public static void main(String [] args) {
        Observable observable = new WeatherData();
        Observer observer1 = new CurrerntConditionDisplay();
        Observer observer2 = new CurrerntConditionDisplay();

        observable.registerObserver(observer1);
        observable.registerObserver(observer2);

        observable.setMeasurements(12.1f, 34.5f, 760);
        observable.setMeasurements(55.1f, 45.5f, 751);
    }
}
