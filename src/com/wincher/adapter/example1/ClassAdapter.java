package com.wincher.adapter.example1;

/**
 * Created by Wincher on 2017/3/22.
 */
public class ClassAdapter extends Adaptee implements Target {
    /**
     * 由于源类Adaptee没有方法sampleOperation2()
     * 因此适配器补充上这个方法
     */
    @Override
    public void sampleOperation2() {
    }
}
