package com.venia.decorator;

/**
 * Created by HOME on 21.12.2019.
 */
public class EncriptionDecorator extends DataSourceDecorator {
    public EncriptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        data =  "[EncriptionDecorator]" + data;
        super.writeData(data);
    }

    @Override
    public String readData() {
        return super.readData().concat("[DecriptionDecorator]");
    }
}
