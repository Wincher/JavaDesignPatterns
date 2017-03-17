package com.wincher.chainOfResponsibility.example;

/**
 * Created by Wincher on 2017/3/15.
 */
public class ConcreteHandler extends Handler {
    @Override
    void handlerRequest() {
        if ( null != getSuccessor()){
            System.out.println("pass request");
            getSuccessor().handlerRequest();
        } else {
            System.out.println("deal request");
        }
    }
}
