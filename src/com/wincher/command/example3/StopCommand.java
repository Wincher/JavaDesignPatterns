package com.wincher.command.example3;

/**
 * Created by Wincher on 2017/3/17.
 * 具体命令角色类
 */
public class StopCommand implements Command{

    private AudioPlayer myAudio;

    public StopCommand(AudioPlayer myAudio) {
        this.myAudio = myAudio;
    }

    @Override
    public void execute() {
        myAudio.stop();
    }
}
