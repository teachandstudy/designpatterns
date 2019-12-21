package com.venia.factory;

/**
 * Created by HOME on 21.12.2019.
 */
public class WindowDialog extends Dialog{
    @Override
    Button createButton() {
        return new WindowButton();
    }
}
