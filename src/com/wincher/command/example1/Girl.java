package com.wincher.command.example1;

/**
 * Created by Wincher on 2017/3/17.
 */
public class Girl {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void order(Boy boy) {
        Command c1 = new ShoppingCommand();
        Command c2 = new HugCommand();
        boy.addCommand(c1);
        boy.addCommand(c2);
        boy.executeCommands();
    }
}
