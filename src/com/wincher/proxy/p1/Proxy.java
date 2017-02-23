package com.wincher.proxy.p1;

public class Proxy implements Subject {

	private Subject subject;

	public Proxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void request() {
		System.out.println("begin");
		subject.request();
		System.out.println("end");

	}

}
