package com.wincher.iterator.example;

import com.wincher.iterator.example.MyLinkedList.Node;

public class Client {
	public static void main(String[] args) {
		MyList ml = new MyArrayList<>();
		ml.add("abc1");
		ml.add("abc2");
		ml.add("abc3");
		ml.add("abc4");
		ml.add("abc5");
		ml.add("abc6");
		ml.add("abc7");
		ml.add("abc8");
		ml.add("abc9");
		ml.add("abc10");
//		MyLinkedList.Node node = mal.getHead();
//		if (node != null){
//			while (node.getNextNode()!=null){
//				System.out.println(node.getValue());
//				node = node.getNextNode();
//			}
//		}
		Iterator iterator = ml.getIterator();
		System.out.println(iterator.currentItem().toString());
		while (iterator.hasNext()) {
			iterator.next();
			System.out.println(iterator.currentItem().toString());
		}
	}
}
