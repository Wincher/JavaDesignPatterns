package com.wincher.strategy.test;

public class AdvancedMemberStrategyStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("30% sale!");
		return booksPrice * 0.7;
	}

}
