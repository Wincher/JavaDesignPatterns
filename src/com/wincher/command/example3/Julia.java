package com.wincher.command.example3;

/**
 * Created by Wincher on 2017/3/17.
 * 客户端角色，由茱丽小女孩扮演
 */
public class Julia {
    public static void main(String[] args) {
        //创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();
        //创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);
        //创建请求者对象
        KeyBoard keyBoard = new KeyBoard();
        keyBoard.setPlayCommand(playCommand);
        keyBoard.setRewindCommand(rewindCommand);
        keyBoard.setStopCommand(stopCommand);
        //测试
        keyBoard.play();
        keyBoard.rewind();
        keyBoard.stop();
        keyBoard.play();
        keyBoard.stop();

        MarcoCommand marco = new MarcoAudioCommand();

        marco.add(playCommand);
        marco.add(rewindCommand);
        marco.add(stopCommand);
        marco.execute();
    }
}
