package com.wincher.iterator.example;

public interface Iterator {
	Object currentItem();

	void first();

	void next();

	void last();

	boolean hasNext();
}
