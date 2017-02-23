package com.wincher.proxy.p2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

final class $proxy1 extends Proxy implements Service {

	public $proxy1(InvocationHandler invocationhandler) {
		super(invocationhandler);
	}

	public final boolean equals(Object obj) {
		try {
			return ((Boolean) super.h.invoke(this, m1, new Object[] { obj })).booleanValue();
		} catch (Error _ex) {
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
		return false;
	}

	public final String toString() {
		try {
			return (String) super.h.invoke(this, m2, null);
		} catch (Error _ex) {
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
		return null;
	}

	public final void add() {
		try {
			super.h.invoke(this, m3, null);
			return;
		} catch (Error _ex) {
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
	}

	public final int hashCode() {
		try {
			return ((Integer) super.h.invoke(this, m0, null)).intValue();
		} catch (Error _ex) {
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
		return 0;
	}

	private static Method m1;
	private static Method m2;
	private static Method m3;
	private static Method m0;

	static {
		try {
			m1 = Class.forName("java.lang.Object").getMethod("equals",
					new Class[] { Class.forName("java.lang.Object") });
			m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
			m3 = Class.forName("zzzzzz.Service").getMethod("add", new Class[0]);
			m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
		} catch (NoSuchMethodException nosuchmethodexception) {
			throw new NoSuchMethodError(nosuchmethodexception.getMessage());
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
}