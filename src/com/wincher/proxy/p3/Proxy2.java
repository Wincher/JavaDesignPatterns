package com.wincher.proxy.p3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;


public class Proxy2 {

	public static Object newProxyInstance() throws Exception {
		
		String rt = "\r\n";
		String src = "package com.wincher.proxy.p3;" + rt +
		"public class Proxy1 implements Moveable {" + rt +
		"	private Moveable target;" +  rt +
		"	public Proxy1(Moveable target) {" + rt +
		"		super();" + rt +
		"		this.target = target;" + rt +
		"}" +  rt +
		"@Override" +  rt +
		"	public void move() {" + rt + 
		"		long start = System.currentTimeMillis();" + rt +
		"		target.move();" + rt +
		"		long end = System.currentTimeMillis();" + rt +
		"		System.out.println(\"time used: \" + (end - start));" + rt + 
		"	}" + rt +
		"}";
		System.out.println(src);
		String fileName = System.getProperty("user.dir") + "/src/com/wincher/proxy/p3/proxy1.java";
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file);
		fw.write(src);
		fw.flush();
		fw.close();
		
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		
        // 执行编译方法
        int compilationResult = compiler.run(null, null, null, fileName);
        // 返回0表示编译成功
        if (compilationResult == 0) {
            System.out.println("success");
            URL[] urls = new URL[] {new URL("file:/" + System.getProperty("user.dir") + "/src")};
    		URLClassLoader ul = new URLClassLoader(urls);
    		Class c = ul.loadClass("com.wincher.proxy.p3.Proxy1");
    		
    		Constructor ctr = c.getConstructor(Moveable.class);
    		Moveable m = (Moveable) ctr.newInstance(new Tank());
    		return m;
        } else {
        	System.out.println("fail");
    		return null;
        }
	}
}