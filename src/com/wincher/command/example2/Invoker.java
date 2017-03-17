package com.wincher.command.example2;

/**
 * Created by Wincher on 2017/3/17.
 */
public class Invoker {
    private Command command = null;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
