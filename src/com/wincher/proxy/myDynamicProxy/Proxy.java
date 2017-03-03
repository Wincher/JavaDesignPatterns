package com.wincher.proxy.myDynamicProxy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.util.Locale;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticListener;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class Proxy {

	public static Object newProxyInstance(Class infce) throws Exception {

		String rt = "\r\n";
		String src = "package com.wincher.proxy.myDynamicProxy;" + rt + "public class MyProxy implements "
				+ infce.getName() + " {" + rt + "	private Moveable target;" + rt
				+ "	public MyProxy(Moveable target) {" + rt + "		super();" + rt + "		this.target = target;" + rt
				+ "}" + rt + "@Override" + rt + "	public void move() {" + rt
				+ "		long start = System.currentTimeMillis();" + rt + "		target.move();" + rt
				+ "		long end = System.currentTimeMillis();" + rt
				+ "		System.out.println(\"time used: \" + (end - start));" + rt + "	}" + rt + "}";
		System.out.println(src);
		String fileName = System.getProperty("user.dir") + "/src/com/wincher/proxy/myDynamicProxy/MyProxy.java";
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();

		Moveable m = compileAndLoad(fileName);
		//Moveable m = compileAndLoad2();
		return m;
	}

	/**
	 * @param fileName
	 * @return 
	 * @author Wincher
	 * @
	 */
	private static Moveable compileAndLoad(String fileName)
			throws IOException, MalformedURLException, ClassNotFoundException, NoSuchMethodException,
			InstantiationException, IllegalAccessException, InvocationTargetException {
		// compile tips：javacompiler need runtime environment jdk，jre's result
		// is null
		// 获取JavaCompiler
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		// DiagnosticListener用于获取Diagnostic信息，Diagnostic信息包括：错误，警告和说明性信息
		MyDiagnosticListener diagnosticListener = new MyDiagnosticListener();
		// JavaFileManager:用于管理与工具有关的所有文件，这里的文件可以是内存数据，也可以是SOcket数据，而不仅仅是磁盘文件。
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(diagnosticListener, Locale.ENGLISH,
				Charset.forName("utf-8"));
		// JavaFileObjects: 是java源码文件(.java)和class文件(.class)的抽象
		// 编译任务
		Iterable<? extends JavaFileObject> units = fileMgr.getJavaFileObjects(fileName);
		CompilationTask t = compiler.getTask(null, fileMgr, diagnosticListener, null, null, units);
		Boolean result = t.call();
		System.out.println(result);
		fileMgr.close();

		// load into memory and create an instance
		URL[] urls = new URL[] { new URL("file:/" + System.getProperty("user.dir") + "/src") };
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("com.wincher.proxy.myDynamicProxy.MyProxy");

		Constructor ctr = c.getConstructor(Moveable.class);
		Moveable m = (Moveable) ctr.newInstance(new Tank());
		Moveable m2 = (Moveable) compileAndLoad2(fileName);
		return m;
	}

	/**
	 * 诊断信息监听器
	 */
	static class MyDiagnosticListener implements DiagnosticListener {
		@Override
		public void report(Diagnostic diagnostic) {
			System.out.println("Code->" + diagnostic.getCode());
			System.out.println("Column Number->" + diagnostic.getColumnNumber());
			System.out.println("End Position->" + diagnostic.getEndPosition());
			System.out.println("Kind->" + diagnostic.getKind());
			System.out.println("Line Number->" + diagnostic.getLineNumber());
			System.out.println("Message->" + diagnostic.getMessage(Locale.ENGLISH));
			System.out.println("Position->" + diagnostic.getPosition());
			System.out.println("Source" + diagnostic.getSource());
			System.out.println("Start Position->" + diagnostic.getStartPosition());
			System.out.println("\n");
		}

	}

	/**
	 * @param fileName
	 * @return
	 */
	private static Object compileAndLoad2(String fileName) throws MalformedURLException, ClassNotFoundException,
			NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

		// 执行编译方法
		int compilationResult = compiler.run(null, null, null, fileName);
		// 返回0表示编译成功
		if (compilationResult == 0) {
			System.out.println("success");
			URL[] urls = new URL[] { new URL("file:/" + System.getProperty("user.dir") + "/src") };
			URLClassLoader ul = new URLClassLoader(urls);
			Class c = ul.loadClass("com.wincher.proxy.myDynamicProxy.MyProxy");

			Constructor ctr = c.getConstructor(Moveable.class);
			Moveable m = (Moveable) ctr.newInstance(new Tank());
			return m;
		} else {
			System.out.println("fail");
			return null;
		}
	}
}