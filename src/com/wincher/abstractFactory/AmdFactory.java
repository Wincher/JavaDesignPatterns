package com.wincher.abstractFactory;

public class AmdFactory implements AbstractFactory {

	@Override
	public CPU createCpu() {
		// TODO Auto-generated method stub
		return new AmdCpu(938);
	}

	@Override
	public Mainboard createMainboard() {
		// TODO Auto-generated method stub
		return new AMDMainboard(938);
	}

}
