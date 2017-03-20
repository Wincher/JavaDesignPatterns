package com.wincher.state.example;

/**
 * Created by Wincher on 2017/3/20.
 */
public class ConcreteStateRed implements State {

    @Override
    public void handlePush(Context context) {
        System.out.println(this.getColor());
        State state = new ConcreteStateYellow();
        context.setState(state);
        state.handlePush(context);
    }

    @Override
    public void handlePull(Context context) {
        System.out.println(this.getColor());
    }

    @Override
    public String getColor() {
        return "RED";
    }
}
