package com.venia.factory;

/**
 * Created by HOME on 21.12.2019.
 */
public class WindowButton implements Button{
    @Override
    public void render() {
        System.out.println("Render: WindowButton->render");
    }

    @Override
    public void onClick() {
        System.out.println("Render: WindowButton->onClick");
    }
}
