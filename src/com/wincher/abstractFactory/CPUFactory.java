package com.wincher.abstractFactory;

public class CPUFactory {
	public static CPU createCpu(int type){
		CPU cpu = null;
        if(type == 1){
            cpu = new IntelCpu(755);
        }else if(type == 2){
            cpu = new AmdCpu(938);
        }
        return cpu;
	}
}
