package com.wincher.command.example3;

/**
 * Created by Wincher on 2017/3/17.
 * 接收者角色，由录音机类扮演
 */
public class AudioPlayer {
    public void play() {
        System.out.println("paly...");
    }

    public void rewind() {
        System.out.println("rewind...");
    }

    public void stop() {
        System.out.println("stop...");
    }
}
