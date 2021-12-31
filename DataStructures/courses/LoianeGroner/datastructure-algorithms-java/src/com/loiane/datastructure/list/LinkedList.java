package com.loiane.datastructure.list;

public class LinkedList<T> {
	
	private Node<T> begin;
	
	public void add(T element) {
		Node<T> cell = new Node<T>(element);
		this.begin = cell;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LinkedList [begin=").append(begin).append("]");
		return builder.toString();
	}
	
}
