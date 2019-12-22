package com.venia.chainofresponsibilities;

/**
 * Created by HOME on 22.12.2019.
 */
public class EmailLogger extends Logger {

    public EmailLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMsssage(String msg) {
        System.out.println("Sending via email: " + msg);
    }
}
