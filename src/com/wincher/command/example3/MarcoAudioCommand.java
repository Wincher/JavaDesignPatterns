package com.wincher.command.example3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wincher on 2017/3/17.
 */
public class MarcoAudioCommand implements MarcoCommand {

    private List<Command> commandList = new ArrayList<Command>();

    @Override
    public void execute() {
        for(Command cmd : commandList){
            cmd.execute();
        }
    }

    @Override
    public void add(Command cmd) {
        commandList.add(cmd);
    }

    @Override
    public void remove(Command cmd) {
        commandList.remove(cmd);
    }
}
