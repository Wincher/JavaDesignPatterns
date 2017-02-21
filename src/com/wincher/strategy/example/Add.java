package com.wincher.strategy.example;

import java.math.BigDecimal;

public class Add implements Calculate {

	@Override
	public BigDecimal operation(BigDecimal x, BigDecimal y) {
		return x.add(y);
	}

}
