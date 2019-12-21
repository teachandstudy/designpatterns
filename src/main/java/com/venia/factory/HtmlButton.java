package com.venia.factory;

/**
 * Created by HOME on 21.12.2019.
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("Render: HtmlButton->render");
    }

    @Override
    public void onClick() {
        System.out.println("Render: HtmlButton->onClick");
    }
}
