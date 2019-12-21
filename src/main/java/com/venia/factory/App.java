package com.venia.factory;

/**
 * Created by HOME on 21.12.2019.
 */
public class App {
    public static void main(String [] args) {
        Dialog d1 = new WebDialog();
        Dialog d2 = new WindowDialog();

        d1.render();
        d2.render();
    }
}
