package com.wincher.strategy.example;

import java.math.BigDecimal;

public class Subtract implements Calculate {

	@Override
	public BigDecimal operation(BigDecimal x, BigDecimal y) {
		return x.subtract(y);
	}

}
