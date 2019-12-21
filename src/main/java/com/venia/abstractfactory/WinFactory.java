package com.venia.abstractfactory;

/**
 * Created by HOME on 21.12.2019.
 */
public class WinFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
