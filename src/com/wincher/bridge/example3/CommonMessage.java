package com.wincher.bridge.example3;

import com.sun.xml.internal.ws.resources.SenderMessages;

/**
 * Created by Wincher on 2017/3/17.
 */
public class CommonMessage extends AbstractMessage{

    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);
    }
}
