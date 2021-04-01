package br.com.linkedlist;

// Structure to initialize a list

public class LinkedList<T> { // What is the type of this list? In that case, any type. So generic type

	private Node<T> firstnode;
	private Node<T> lastnode;
	private int size;
	
	
	
	public LinkedList(Node<T> firstnode, Node<T> lastnode, int size) {
		this.firstnode = null;
		this.lastnode = null;
	}
	
	
	
}
