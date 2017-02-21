package com.wincher.strategy.test;

public class PrimaryMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("no sale!");
		return booksPrice;
	}

}
