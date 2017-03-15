package com.wincher.proxy.proxyInvocationHandler;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import sun.misc.ProxyGenerator;

public class ProxyTest {
    public static void main(String[] args) {
        Service service = new UserServiceImpl();
        MyInvocatioHandler handler = new MyInvocatioHandler(service);
        Service serviceProxy = (Service) handler.getProxy();
        serviceProxy.delete();
        serviceProxy.add();
    }

    public void test(String[] args) throws IOException {
		/*byte[] classFile = ProxyGenerator.generateProxyClass("com.sun.proxy.$Proxy.1",
				service.getClass().getInterfaces());
		FileOutputStream out;
		out = new FileOutputStream("com.sun.proxy.$Proxy.1.class");

		out.write(classFile);
		out.flush();
		out.close();*/
	}
}
