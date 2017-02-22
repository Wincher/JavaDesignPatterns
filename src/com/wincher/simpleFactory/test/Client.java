package com.wincher.simpleFactory.test;

public class Client {
	public static void main(String[] args) {
		String loginType = "passcode";
		String name = "name";
		String password = "pasword";
		Login login = LoginManager.factory(loginType);
		boolean bool = login.verify(name, password);
		if (bool) {
			/**
			 * 业务逻辑
			 */
		} else {
			/**
			 * 业务逻辑
			 */
		}
	}
}
