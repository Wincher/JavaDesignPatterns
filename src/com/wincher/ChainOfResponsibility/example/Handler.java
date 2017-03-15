package com.wincher.ChainOfResponsibility.example;

/**
 * Created by Wincher on 2017/3/15.
 */
public abstract class Handler {
    protected Handler successor;
    abstract void handlerRequest();

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public Handler getSuccessor() {
        return successor;
    }
}
