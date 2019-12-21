package com.venia.factory;

/**
 * Created by HOME on 21.12.2019.
 */
public class WebDialog extends Dialog {
    @Override
    Button createButton() {
        return new HtmlButton();
    }
}
