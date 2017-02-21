package com.wincher.strategy.example;

import java.math.BigDecimal;

public interface Calculate {
	BigDecimal operation(BigDecimal x, BigDecimal y);
}
