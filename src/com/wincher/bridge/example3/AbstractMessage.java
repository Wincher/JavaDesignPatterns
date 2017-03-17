package com.wincher.bridge.example3;

/**
 * Created by Wincher on 2017/3/17.
 */
public abstract class AbstractMessage {
    MessageImplementor impl;

    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }

    public void sendMessage(String message , String toUser){
        this.impl.send(message, toUser);
    }
}
