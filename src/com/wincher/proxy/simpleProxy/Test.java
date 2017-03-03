package com.wincher.proxy.simpleProxy;

public class Test {
	public static void main(String[] args) {
		RealSubject rs = new RealSubject();
		Proxy p = new Proxy(rs);
		p.request();
	}
}
