package com.wincher.strategy.example;

import java.math.BigDecimal;

public class Mutiply implements Calculate {

	@Override
	public BigDecimal operation(BigDecimal x, BigDecimal y) {
		return x.multiply(y);
	}
}
