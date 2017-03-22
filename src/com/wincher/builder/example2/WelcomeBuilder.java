package com.wincher.builder.example2;

/**
 * Created by Wincher on 2017/3/22.
 */
public class WelcomeBuilder extends Builder {

    public WelcomeBuilder(){
        msg = new WelcomeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setBody("欢迎内容");
    }

    @Override
    public void buildBody() {
        msg.setSubject("欢迎标题");
    }
}
