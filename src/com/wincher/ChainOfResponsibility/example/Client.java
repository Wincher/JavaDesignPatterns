package com.wincher.ChainOfResponsibility.example;

/**
 * Created by Wincher on 2017/3/15.
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        handler1.handlerRequest();
    }
}
