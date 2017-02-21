package com.wincher.strategy.test;

import sun.applet.Main;

public class Client {
	public static void main(String[] args) {
		MemberStrategy strategy = new AdvancedMemberStrategyStrategy();
		Price price = new Price(strategy);
		price.quote(100);
	}
}
