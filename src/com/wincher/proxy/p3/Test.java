package com.wincher.proxy.p3;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class Test {
	public static void main(String[] args) {
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		System.out.println(compiler);
	}
}
