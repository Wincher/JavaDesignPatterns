package com.wincher.chainOfResponsibility.example2;

/**
 * Created by Wincher on 2017/3/15.
 */
public abstract class Handler {
    protected Handler successor;
    abstract String handleFeeRequest(String user, double fee);

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public Handler getSuccessor() {
        return successor;
    }

}
