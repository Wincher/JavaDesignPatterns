package com.wincher.observer.javaImpl;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {
	public Watcher(Observable o) {
		o.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("状态发生改变：" + ((Watched) o).getData());
	}

	public static void main(String[] args) {
		Watched watched = new Watched();
		Observer watcher = new Watcher(watched);
		watched.setData("1");
		watched.setData("1");
		watched.setData("2");
		watched.setData("1");
		watched.setData("2");
	}

}
