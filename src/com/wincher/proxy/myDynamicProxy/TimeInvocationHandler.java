package com.wincher.proxy.myDynamicProxy;

import java.lang.reflect.Method;

public class TimeInvocationHandler implements InvocationHandler{

	private Object target;
	public TimeInvocationHandler(Object target) {
		super();
		this.target = target;
	}
	@Override
	public void invoke(Object o, Method m) {
		Long start = System.currentTimeMillis();
		System.out.println("StartTime:" + start);
		try {
			m.invoke(target);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Long end = System.currentTimeMillis();
		System.out.println("Time:" + (end - start));
	}

}
