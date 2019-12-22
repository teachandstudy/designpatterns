package com.venia.chainofresponsibilities;

/**
 * Created by HOME on 22.12.2019.
 */
public class StderrLogger extends Logger{
    public StderrLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMsssage(String msg) {
        System.out.println("Sending to stderr: " + msg);
    }
}
