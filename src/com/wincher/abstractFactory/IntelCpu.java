package com.wincher.abstractFactory;

public class IntelCpu implements CPU {

	/**
     * CPU的针脚数
     */
    private int pins = 0;
    public  IntelCpu(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {
        System.out.println("Intel CPU的针脚数：" + pins);
    }

}
