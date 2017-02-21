package com.wincher.strategy.test;

public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("10% sale!");
		return booksPrice * 0.9;
	}

}
