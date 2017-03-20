package com.wincher.state.example;

/**
 * Created by Wincher on 2017/3/20.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateRed());
        System.out.println("PUSH...");
        context.push();
        System.out.println("PULL...");
        context.pull();
    }
}
