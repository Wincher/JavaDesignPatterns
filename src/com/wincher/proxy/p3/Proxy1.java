package com.wincher.proxy.p3;
public class Proxy1 implements Moveable {
	private Moveable target;
	public Proxy1(Moveable target) {
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