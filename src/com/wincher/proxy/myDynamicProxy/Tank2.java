package com.wincher.proxy.myDynamicProxy;

public class Tank2 extends Tank1 {

	@Override
	public void move() {

		long start = System.currentTimeMillis();
		super.move();

		long end = System.currentTimeMillis();
		System.out.println("time used: " + (end - start));
	}
}
