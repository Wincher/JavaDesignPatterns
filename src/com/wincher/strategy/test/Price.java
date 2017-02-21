package com.wincher.strategy.test;

public class Price {
	private MemberStrategy strategy;

	public Price(MemberStrategy strategy) {
		this.strategy = strategy;
	}
	
	public double quote(double booksPrice){
		booksPrice =  this.strategy.calcPrice(booksPrice);
		System.out.println("You should pay: $" + booksPrice + "!");
		return booksPrice;
	}
	
}
