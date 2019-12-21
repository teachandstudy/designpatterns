package com.venia.decorator;

/**
 * Created by HOME on 21.12.2019.
 */
public class FileDataSource implements DataSource {
    private String file = "";
    @Override
    public void writeData(String data) {
        file = String.format("(((%s)))", data);
    }

    @Override
    public String readData() {
        return file;
    }
}
