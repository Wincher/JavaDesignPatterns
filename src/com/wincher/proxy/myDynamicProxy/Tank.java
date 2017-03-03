package com.wincher.proxy.myDynamicProxy;

import java.util.Random;

public class Tank implements Moveable {

	@Override
	public void move() {
		System.out.println("Tank moving...");
		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
