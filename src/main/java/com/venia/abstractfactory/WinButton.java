package com.venia.abstractfactory;

import com.venia.factory.*;

/**
 * Created by HOME on 21.12.2019.
 */
public class WinButton implements Button{

    @Override
    public void paint() {
        System.out.println("Render: WinButton->paint()");
    }
}
