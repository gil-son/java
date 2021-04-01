package br.com.linkedlist;

// Before create the list, required create the node

public class Node <T>{ // Generic Type
	private T element;
	private Node<T> next; // This attribute is to continue the element. Receive the own Class with Generic Type
	
	public Node() { // begin create without pass an attribution
		this.element = null;
	}
	
	public Node(T element) { // Receive element 
		this.element = element; 
	}
	
	public Node(T element, Node<T> next) { // Receive element and the next element
		this.element = element;
		this.next =  next;
	}
	
	
	
	public T getElement() {
		return element;
	}
	
	

	public void setElement(T element) {
		this.element = element;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	
}
