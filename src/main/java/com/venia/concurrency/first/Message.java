package com.venia.concurrency.first;

/**
 * Created by HOME on 22.12.2019.
 */
public class Message {
    private String msg;

    public Message(String str){
        this.msg=str;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String str) {
        this.msg=str;
    }

}