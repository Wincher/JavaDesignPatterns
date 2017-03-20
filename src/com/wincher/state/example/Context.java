package com.wincher.state.example;

/**
 * Created by Wincher on 2017/3/20.
 */
public class Context {
    private State state = null;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void push() {
        this.state.handlePush(this);
    }
    public void pull() {
        this.state.handlePull(this);
    }
}
