package com.wincher.command.example3;

/**
 * Created by Wincher on 2017/3/17.
 * 具体命令角色类
 */
public class PlayCommand implements Command {

    private AudioPlayer myAudio;

    public PlayCommand(AudioPlayer myAudio) {
        this.myAudio = myAudio;
    }

    @Override
    public void execute() {
        myAudio.play();
    }
}
