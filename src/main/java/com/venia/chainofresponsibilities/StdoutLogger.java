package com.venia.chainofresponsibilities;

/**
 * Created by HOME on 22.12.2019.
 */
public class StdoutLogger extends Logger {

    public StdoutLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMsssage(String msg) {
        System.out.println("Writing to stdout: " + msg);
    }
}
