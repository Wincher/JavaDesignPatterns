package com.wincher.proxy.myDynamicProxy;

import java.io.IOException;

public class Client {
	
	
	public static void main(String[] args) throws Exception {
		Tank t = new Tank();
		
		try {
			Moveable m = (Moveable) Proxy.newProxyInstance(Moveable.class);
			m.move();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void test1(String[] args) {
		Moveable m = new TankTimeProxy(new Tank());
		Moveable m2 = new TankLogProxy(m);
		m2.move();
	}
}
