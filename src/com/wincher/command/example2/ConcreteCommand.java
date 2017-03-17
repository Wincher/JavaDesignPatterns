package com.wincher.command.example2;


/**
 * Created by Wincher on 2017/3/17.
 */
public class ConcreteCommand implements Command {

    private Receiver receiver = null;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
