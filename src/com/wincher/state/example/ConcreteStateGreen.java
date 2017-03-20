package com.wincher.state.example;

/**
 * Created by Wincher on 2017/3/20.
 */
public class ConcreteStateGreen implements State {
    @Override
    public void handlePush(Context context) {
        System.out.println(this.getColor());
    }

    @Override
    public void handlePull(Context context) {
        System.out.print(this.getColor());

        State state = new ConcreteStateYellow();
        context.setState(state);
        state.handlePull(context);
    }

    @Override
    public String getColor() {
        return "GREEN";
    }
}
