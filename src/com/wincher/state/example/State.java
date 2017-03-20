package com.wincher.state.example;

/**
 * Created by Wincher on 2017/3/20.
 */
public interface State {
    void handlePush(Context context);
    void handlePull(Context context);
    String getColor();

}
