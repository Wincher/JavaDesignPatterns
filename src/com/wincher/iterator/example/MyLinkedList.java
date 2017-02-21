package com.wincher.iterator.example;

public class MyLinkedList<E> extends MyList {
	private Node head;
	private Node tail;

	@Override
	public void add(Object o) {
		if (head != null) {
			tail.nextNode = new Node(o);
			tail = tail.nextNode;
		} else {
			head = new Node(o);
			tail = head;
		}

	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	class Node<E> {
		private E value;
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return value.toString();
		}

		private Node nextNode;

		public Node(E value) {
			super();
			this.value = value;
		}

		public E getValue() {
			return value;
		}

		public void setValue(E value) {
			this.value = value;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}
	}

	public Iterator getIterator() {
		return new MyLinkedListIterator();
	}

	private class MyLinkedListIterator implements Iterator {

		private Node currentNode = head;

		@Override
		public Object currentItem() {
			return currentNode;
		}

		@Override
		public void first() {
			currentNode = head;
		}

		@Override
		public void next() {
			if (hasNext()) currentNode = currentNode.getNextNode();
		}

		@Override
		public void last() {
			while (null != currentNode.getNextNode()) {
				currentNode = currentNode.getNextNode();
			}
		}

		@Override
		public boolean hasNext() {
			return (null != currentNode.getNextNode());
		}

	}

}
