package com.venia.decorator;

/**
 * Created by HOME on 21.12.2019.
 */
public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        data = "[CompressionDecorator]" + data;
        super.writeData(data);
    }

    @Override
    public String readData() {
        return super.readData().concat("[DecompressionDecorator]");
    }
}
