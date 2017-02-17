package com.wincher.observer.example;

public class GrandFatherFather implements Observer{

	@Override
	public void doWhenBabyAwake() {
		System.out.println(getClass().getName() + "feed the baby...");
	}

}
