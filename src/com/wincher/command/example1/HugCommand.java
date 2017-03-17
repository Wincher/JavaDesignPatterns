package com.wincher.command.example1;

/**
 * Created by Wincher on 2017/3/17.
 */
public class HugCommand extends Command {
    @Override
    void execute() {
        System.out.println("hug");
    }

    @Override
    void unDo() {
        System.out.println("open your hug");
    }
}
