package com.venia.decorator;

/**
 * Created by HOME on 21.12.2019.
 */
public interface DataSource {
    void writeData(String data);
    String readData();
}
