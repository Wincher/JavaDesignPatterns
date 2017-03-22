package com.wincher.builder.example2;

/**
 * Created by Wincher on 2017/3/22.
 */
public class GoodbyeBuilder extends Builder {

    public GoodbyeBuilder(){
        msg = new WelcomeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setBody("欢送内容");
    }

    @Override
    public void buildBody() {
        msg.setSubject("欢送标题");
    }
}
