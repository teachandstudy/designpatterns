package com.venia.abstractfactory;

/**
 * Created by HOME on 21.12.2019.
 */
public class MacFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
