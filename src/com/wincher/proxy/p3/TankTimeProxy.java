package com.wincher.proxy.p3;

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
}
