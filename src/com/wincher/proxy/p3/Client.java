package com.wincher.proxy.p3;

import java.io.IOException;

public class Client {
	
	
	public static void main(String[] args) throws Exception {
		Tank t = new Tank();
		
		try {
			Moveable m = (Moveable) Proxy.newProxyInstance();
			m.move();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test1(String[] args) {
		Moveable m = new TankTimeProxy(new Tank());
		Moveable m2 = new TankLogProxy(m);
		m2.move();
	}
}
