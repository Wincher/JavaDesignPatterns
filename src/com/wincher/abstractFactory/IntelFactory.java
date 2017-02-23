package com.wincher.abstractFactory;

public class IntelFactory implements AbstractFactory {

	@Override
	public CPU createCpu() {
		return new IntelCpu(755);
	}

	@Override
	public Mainboard createMainboard() {
		return new IntelMainboard(755);
	}

}
