package com.venia.abstractfactory;

/**
 * Created by HOME on 21.12.2019.
 */
public class MacCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Render: MacCheckBox->paint()");
    }
}
