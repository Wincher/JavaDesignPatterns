package com.wincher.proxy.p1;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("RealSubject");
		
	}

}
