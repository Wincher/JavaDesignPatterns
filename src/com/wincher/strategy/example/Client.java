package com.wincher.strategy.example;

import java.math.BigDecimal;

public class Client {
	public static void main(String[] args) {
		Calculate calculate = new Mutiply();
		Operator operator = new Operator(calculate);
		operator.operate(new BigDecimal(100.26), new BigDecimal(215.21));
	}
}
