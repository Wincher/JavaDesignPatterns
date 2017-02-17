package com.wincher.observer.example;

public class Client {
	public static void main(String[] args) {
		Baby b = new Baby();
		Father f = new Father();
		GrandFatherFather g = new GrandFatherFather();
		Mother m = new Mother();
		b.attach(g);
		b.attach(m);
		b.attach(f);
		b.awake();
	}
}
