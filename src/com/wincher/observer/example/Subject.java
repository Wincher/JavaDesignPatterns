package com.wincher.observer.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	List<Observer> observers = new ArrayList<Observer>();
	
	public void attach (Observer observer){
		observers.add(observer);
		System.out.println("observer:" + observer + " ready...");
	}
	public void detach(Observer observer){
		observers.remove(observer);
		System.out.println("observer:" + observer + " offline...");
	}
	public void awake(){
		for (Observer observer : observers){
			observer.doWhenBabyAwake();
		}
	}
}
