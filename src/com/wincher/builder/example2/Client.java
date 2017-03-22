package com.wincher.builder.example2;

/**
 * Created by Wincher on 2017/3/22.
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);
        director.construct("toAddress@126.com", "fromAddress@126.com");
    }
}
