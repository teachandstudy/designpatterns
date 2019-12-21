package com.venia.observer1;

/**
 * Created by HOME on 21.12.2019.
 */
public class CurrerntConditionDisplay implements Observer {

    private float temperature;
    private float humidity;
    private int pressure;

    @Override
    public void update(float temperature, float humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }

    private void display() {
        System.out.println(String.format("temperature: %s, humidity: %s, pressure: %s", this.temperature, this.humidity, this.pressure));
    }
}
