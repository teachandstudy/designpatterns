package com.venia.abstractfactory;

/**
 * Created by HOME on 21.12.2019.
 */
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Render: MacButton->paint()");
    }
}
