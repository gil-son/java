package br.com.gilson.heap_vs_stack.ex01;

import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op;
		
		System.out.println("\tMemory Manager");
		System.out.println("Enter the precise option:");
		op = input.nextInt();
		
		switch (op) {
		case 1: {
			
			memoryManager();
		}
		default:
			// throw new IllegalArgumentException("Unexpected value: " + op);
		}
		
	}
	
	public static void memoryManager() {
		System.out.println("----- Primitive Type -----");
		int x = 4;
		System.out.println("x="+x);
		int y = x;
		System.out.println("y="+y);
		System.out.println(" ---------- ");
		System.out.println("x=y:"+(x==y));
		
		System.out.println("----- Object -----");
		Person p1 = new Person(1,"Aveny");
		System.out.println("Person1:"+p1);
		Person p2 = p1;
		System.out.println("Person2:"+p2);
		System.out.println(" ---------- ");
		System.out.println("Person1 = Person2:"+(p1==p2));
		p2.setName("John");
		System.out.println(" ---------- ");
		System.out.println("Person1:"+p1);
		System.out.println("Person2:"+p2);
		System.out.println("Person1 = Person2 after set Person2:"+(p1.getName().equals(p2.getName())));
		System.out.println("Person1 = Person2 after set Person2:"+(p1==p2));
		
		System.out.println(" ---------- ");
		Person p3 = new Person(3,"Cris"); // New instance, then new local in Heap
		System.out.println("Person3:"+p3);
		System.out.println("Person1 = Person3:"+(p1==p3));
	}
}
