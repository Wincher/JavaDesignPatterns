package com.wincher.singleton;

public class HolderSingleton {
	private HolderSingleton() {
		System.out.println("new HolderSingleton......");
	}

	/**
	 * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例 没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
	 * 当getInstance方法第一次被调用的时候，它第一次读取SingletonHolder.instance，导致SingletonHolder类得到初始化；
	 * 而这个类在装载并被初始化的时候，会初始化它的静态域，从而创建Singleton的实例，
	 * 由于是静态的域，因此只会在虚拟机装载类的时候初始化一次，并由虚拟机来保证它的线程安全性。
	 * 这个模式的优势在于，getInstance方法并没有被同步，并且只是执行一个域的访问，因此延迟初始化并没有增加任何访问成本。
	 */
	private static class SingletonHolder {
		/**
		 * 静态初始化器，由JVM来保证线程安全
		 */
		private static HolderSingleton instance = new HolderSingleton();
	}

	public static HolderSingleton getInstance() {
		return SingletonHolder.instance;
	}
}
