package com.wincher.proxy.proxyInvocationHandler;

public class UserServiceImpl implements Service {

	@Override
	public void add() {
		System.out.println("This is add service");
	}

	@Override
	public void delete() {
		System.out.println("This is delete service");
		
	}

}
