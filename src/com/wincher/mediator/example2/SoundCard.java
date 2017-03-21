package com.wincher.mediator.example2;

/**
 * Created by Wincher on 2017/3/21.
 */
public class SoundCard extends Colleague {
    /**
     * 构造函数
     *
     * @param mediator
     */
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 按照声频数据发出声音
     */
    public void soundData(String data){
        System.out.println("画外音：" + data);
    }
}
