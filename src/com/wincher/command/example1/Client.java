package com.wincher.command.example1;

/**
 * Created by Wincher on 2017/3/17.
 */
public class Client {
    public static void main(String[] args) {
        Girl girl = new Girl();
        Boy boy = new Boy();
        girl.order(boy);
    }
}
