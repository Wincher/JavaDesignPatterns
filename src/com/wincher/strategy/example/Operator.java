package com.wincher.strategy.example;

import java.math.BigDecimal;

public class Operator {
	private Calculate calculate;

	public Operator(Calculate calculate) {
		super();
		this.calculate = calculate;
	}
	
	public BigDecimal operate(BigDecimal x, BigDecimal y) {
		BigDecimal b = calculate.operation(x, y);
		System.out.println(b);
		return b;
	}
}
