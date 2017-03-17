package com.wincher.command.example1;

/**
 * Created by Wincher on 2017/3/17.
 */
public class ShoppingCommand extends Command {
    @Override
    void execute() {
        System.out.println("market");
    }

    @Override
    void unDo() {
        System.out.println("undo market");
    }
}
