package com.wincher.proxy.p2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import sun.misc.ProxyGenerator;

public class ProxyTest {
	public static void main(String[] args) throws IOException {
		Service service = new UserServiceImpl();
		MyInvocatioHandler handler = new MyInvocatioHandler(service);
		Service serviceProxy = (Service) handler.getProxy();
		serviceProxy.delete();
		serviceProxy.add();

		/*byte[] classFile = ProxyGenerator.generateProxyClass("com.sun.proxy.$Proxy.1",
				service.getClass().getInterfaces());
		FileOutputStream out;
		out = new FileOutputStream("com.sun.proxy.$Proxy.1.class");

		out.write(classFile);
		out.flush();
		out.close();*/
	}
}
