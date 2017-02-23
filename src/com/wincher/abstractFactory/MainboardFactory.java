package com.wincher.abstractFactory;

public class MainboardFactory {
	public static Mainboard createMainboard(int type){
        Mainboard mainboard = null;
        if(type == 1){
            mainboard = new IntelMainboard(755);
        }else if(type == 2){
            mainboard = new AMDMainboard(938);
        }
        return mainboard;
    }
}
