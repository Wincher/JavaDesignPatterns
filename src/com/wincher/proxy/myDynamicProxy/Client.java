package com.wincher.proxy.myDynamicProxy;

import java.io.IOException;

public class Client {
	
	
	public static void main(String[] args) throws Exception {
		Tank t = new Tank();
		TimeInvocationHandler h = new TimeInvocationHandler(t);
		try {
			//Moveable m = (Moveable) Proxy.newProxyInstance(Moveable.class,h);
			Moveable m = (Moveable) h.getProxy(Moveable.class);
			m.move();
			m.fly();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void test1(String[] args) {
		Moveable m = new TankTimeProxy(new Tank());
		Moveable m2 = new TankLogProxy(m);
		m2.move();
		m2.fly();
	}
}
