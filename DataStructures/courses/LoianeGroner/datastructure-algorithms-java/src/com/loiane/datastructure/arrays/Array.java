package com.loiane.datastructure.arrays;

public class Array {
	
	private String [] elements;
	private int size; // 0
	
	/*
	 *  new String[2] = [null, null] 
	 *     new int[2] = [0, 0]
	 * new boolean[2] = [false, false]
	 */
	
	public Array(int capacity) {
		this.elements = new String[capacity];
		this.size = 0;
	}
	
	
	/*
	//The problem with this algorithm is that as you add values, the search for the next
	// null value, you will always have to traverse everything again with one more position.
	
	public void add(String element) {
		for(int i = 0; i < elements.length; i++) {
			if(elements[i] == null) {
				elements[i] = element;
				break; // i = elements.length -1;
			}
		}
	}
	*/
	/*
	// 1 .Basic soluction
	public void add(String element) throws Exception {
		if(this.size < elements.length) {
			this.elements[this.size] = element;
			this.size++;
		}else {
			throw new Exception("The Array is full");
		}
	}
	*/
	// 2 .Basic soluction
	
	public boolean add(String element) {
		if(this.size < elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		}
		return false;
	}
	
	
	
	
}
