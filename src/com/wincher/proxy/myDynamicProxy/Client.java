package com.wincher.proxy.myDynamicProxy;

import java.io.IOException;

public class Client {
	
	
	public static void main(String[] args) throws Exception {
		Tank1 t = new Tank1();
		
		try {
			Moveable m = (Moveable) Proxy.newProxyInstance(Moveable.class);
			m.move();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void test1(String[] args) {
		Moveable m = new TankTimeProxy(new Tank1());
		Moveable m2 = new TankLogProxy(m);
		m2.move();
	}
}
