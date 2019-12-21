package com.venia.decorator;

/**
 * Created by HOME on 21.12.2019.
 */
public class Application {
    public static void main(String [] args) {
        DataSourceDecorator dataSourceDecorator = new CompressionDecorator(
                new EncriptionDecorator(
                        new FileDataSource()
                )
        );

        dataSourceDecorator.writeData("Hello world");

        System.out.println("----------------------");
        System.out.println(dataSourceDecorator.readData());
    }
}
