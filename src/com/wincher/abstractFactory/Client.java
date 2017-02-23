package com.wincher.abstractFactory;

public class Client {

	public static void main(String[] args) {
		ComputerEngineer cf = new ComputerEngineer();
		cf.makeComputer(new AmdFactory());
	}

}
