package br.com.gilson.stack.exe01;

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
		int x = 4;
		System.out.println(x);
		int y = x;
		System.out.println(y);
		System.out.println(" ---------- ");
		System.out.println(x==y);
		
	}

}
