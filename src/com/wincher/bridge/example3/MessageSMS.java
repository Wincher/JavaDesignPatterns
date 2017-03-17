package com.wincher.bridge.example3;

/**
 * Created by Wincher on 2017/3/17.
 */
public class MessageSMS implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用系统内短消息的方法，发送消息" + message + "给" + toUser);
    }
}
