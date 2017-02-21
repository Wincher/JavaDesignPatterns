package com.wincher.iterator.example;

import java.util.ArrayList;

import com.wincher.strategy.example.Add;

public class MyArrayList<E> extends MyList {
	private E[] array = (E[]) new Object[2];
	private int index = 0;

	@Override
	public void add(Object o) {
		if (!(index < array.length)) {
			E[] temp = (E[]) new Object[array.length * 2];
			for (int i = 0; i < array.length; i++) {
				temp[i] = array[i];
			}
			array = temp;
		}

		array[index] = (E) o;
		index++;
//		for (int i = 0; i < index; i++) {
//			System.out.println(array[i]);
//		}

	}
	@Override
	public Iterator getIterator() {
		return new MyArrayListIterator(); 
	}

	private class MyArrayListIterator implements Iterator {

		private int currentIndex = 0;

		@Override
		public Object currentItem() {
			return array[currentIndex];
		}

		@Override
		public void first() {
			currentIndex = 0;
		}

		@Override
		public void next() {
			if (hasNext()) currentIndex++;
		}

		@Override
		public void last() {
			currentIndex = index -1;
		}

		@Override
		public boolean hasNext() {
			return currentIndex < index-1;
		}

	}

}
