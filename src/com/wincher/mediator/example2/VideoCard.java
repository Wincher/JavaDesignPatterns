package com.wincher.mediator.example2;

/**
 * Created by Wincher on 2017/3/21.
 */
public class VideoCard extends Colleague {
    /**
     * 构造函数
     *
     * @param mediator
     */
    public VideoCard(Mediator mediator) {
        super(mediator);
    }
    /**
     * 显示视频数据
     */
    public void showData(String data){
        System.out.println("您正在观看的是：" + data);
    }

}
