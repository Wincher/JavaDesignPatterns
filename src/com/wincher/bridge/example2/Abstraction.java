package com.wincher.bridge.example2;

/**
 * Created by Wincher on 2017/3/17.
 */
public abstract class Abstraction {
    protected Implementor impl;

    public Abstraction(Implementor impl) {
        this.impl = impl;
    }

    void operation() {
        impl.operationImpl();
    }
}
