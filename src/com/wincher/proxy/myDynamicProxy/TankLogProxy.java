package com.wincher.proxy.myDynamicProxy;

public class TankLogProxy implements Moveable {

	private Moveable target;

	public TankLogProxy(Moveable target) {
		super();
		this.target = target;
	}

	@Override
	public void move() {
		System.out.println("start");
		target.move();
		long end = System.currentTimeMillis();
		System.out.println("end");
	}
}
