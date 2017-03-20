package com.wincher.state.example;

/**
 * Created by Wincher on 2017/3/20.
 */
public class ConcreteStateYellow implements State {
    @Override
    public void handlePush(Context context) {
        System.out.println(this.getColor());
        State state = new ConcreteStateGreen();
        context.setState(state);
        state.handlePush(context);
    }

    @Override
    public void handlePull(Context context) {
        System.out.print(this.getColor());

        State state = new ConcreteStateRed();
        context.setState(state);
        state.handlePull(context);
    }

    @Override
    public String getColor() {
        return "YELLOW";
    }
}
