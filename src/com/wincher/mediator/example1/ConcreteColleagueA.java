package com.wincher.mediator.example1;

/**
 * Created by Wincher on 2017/3/21.
 */
public class ConcreteColleagueA extends Colleague {
    /**
     * 构造函数
     *
     * @param mediator
     */
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }
    /**
     * 示意方法，执行某些操作
     */
    public void operation(){
        //在需要跟其他同事通信的时候，通知调停者对象
        getMediator().changed(this);
    }
}
