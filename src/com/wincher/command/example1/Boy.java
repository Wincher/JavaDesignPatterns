package com.wincher.command.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Wincher on 2017/3/17.
 */
public class Boy {
    private String name;
    private List<Command> commands = new ArrayList<Command>();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void pursue(Girl mm){

    }

    public void doSomething() {

    }

    public void addCommand(Command c) {
        commands.add(c);
    }

    public void executeCommands() {
        for (Command c : commands) {
            c.execute();
        }
    }

    public void undoCommands(){

    }
}
