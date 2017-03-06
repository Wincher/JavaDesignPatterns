package com.wincher.proxy.myDynamicProxy;

import java.lang.reflect.Method;

interface InvocationHandler {
	void invoke(Object o, Method m);
}
