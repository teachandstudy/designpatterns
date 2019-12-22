package com.venia.chainofresponsibilities;

/**
 * Created by HOME on 22.12.2019.
 */
abstract public class Logger {
    public static int ERR = 3;
    public static int NOTICE = 5;
    public static int DEBUG = 7;
    protected int mask;

    protected Logger next;

    public Logger setNext(Logger log) {
        next = log;
        return next;
    }

    public void message(String msg, int priority) {
        if (mask <= priority) {
            this.writeMsssage(msg);
        }
        if (next != null) {
            next.message(msg, priority);
        }
    }

    abstract protected void writeMsssage(String msg);
}


