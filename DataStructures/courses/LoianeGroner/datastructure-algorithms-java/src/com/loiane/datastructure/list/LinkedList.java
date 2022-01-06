package com.loiane.datastructure.list;

public class LinkedList<T> {
	
	private Node<T> begin;
	private int size = 0;
	
	public void addFirst(T element) {
		Node<T> cell = new Node<T>(element);
		this.begin = cell;
		this.size++;
	}
	
	public void addSequence(T element) {
		Node<T> cell = new Node<T>(element, begin);
		this.begin = cell;
		this.size++;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LinkedList [begin=").append(begin).append("]");
		return builder.toString();
	}
	
	public int getSize() {
		return this.size;
	}
	
}
