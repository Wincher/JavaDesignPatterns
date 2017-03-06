package com.wincher.proxy.myDynamicProxy;

public class TankTimeProxy implements Moveable {

	private Moveable target;

	public TankTimeProxy(Moveable target) {
		super();
		this.target = target;
	}

	@Override
	public void move() {
		long start = System.currentTimeMillis();
		target.move();
		long end = System.currentTimeMillis();
		System.out.println("time used: " + (end - start));
	}

	@Override
	public void fly() {
		long start = System.currentTimeMillis();
		target.fly();
		long end = System.currentTimeMillis();
		System.out.println("time used: " + (end - start));
		
	}
}
