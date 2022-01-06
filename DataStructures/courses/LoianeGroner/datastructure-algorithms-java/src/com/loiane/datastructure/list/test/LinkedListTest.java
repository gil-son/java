package com.loiane.datastructure.list.test;

import com.loiane.datastructure.list.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.addFirst(1);
		list.addSequence(2);
		list.addSequence(3);
		
		System.out.println("Size: "+list.getSize());
		System.out.println(list);
	}
}
