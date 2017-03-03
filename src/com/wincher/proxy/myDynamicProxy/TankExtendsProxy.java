package com.wincher.proxy.myDynamicProxy;

public class TankExtendsProxy extends Tank {

	@Override
	public void move() {

		long start = System.currentTimeMillis();
		super.move();

		long end = System.currentTimeMillis();
		System.out.println("time used: " + (end - start));
	}
}
