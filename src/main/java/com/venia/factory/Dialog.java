package com.venia.factory;

/**
 * Created by HOME on 21.12.2019.
 */
public abstract class Dialog {
    public void render() {
        Button button = createButton();
        button.render();
        button.onClick();
    }
    abstract Button createButton();
}
