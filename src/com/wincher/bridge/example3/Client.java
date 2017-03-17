package com.wincher.bridge.example3;

/**
 * Created by Wincher on 2017/3/17.
 */
public class Client {
    public static void main(String[] args) {
        MessageImplementor impl = new MessageEmail();
        AbstractMessage message = new CommonMessage(impl);
        message.sendMessage("加班","CTO");

        impl = new MessageSMS();
        message = new UrgencyMessage(impl);
        message.sendMessage("hurry up","CFO");
    }
}
