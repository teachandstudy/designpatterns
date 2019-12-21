package com.venia.observer1;

/**
 * Created by HOME on 21.12.2019.
 */
public interface Observer {
    void update(float temperature, float humidity, int pressure);
}
