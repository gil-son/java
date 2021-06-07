package ex01.app;

import java.util.Locale;
import java.util.Scanner;

import ex01.util.List;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		List list = new List();
		
		int op;
		
		do {
			
			showMenu();
			op = sc.nextInt();
			
			switch (op) {
			case 1: {System.out.println("Type the element to insert in list:"); 
					list.add(sc.nextDouble());
					break;}
			
			case 2: {System.out.println("Type the element to delete in list:"); 
					list.remove(sc2.nextDouble()); 
					break;}
			
			case 3: {System.out.println("\nThe List:\n"+list.toString()); break;}
			case 4: {System.out.println("Get out!"); op=4; break;}
			default:
				System.out.println("Invalid option: " + op);
			}
			
			
			
			
		}while(op !=4);
		
		
		sc.close();
	}

	
	public static void showMenu() {
		System.out.println(
				"\n1 - Insert element into list"
			   +"\n2 - Delete element into list"
			   +"\n3 - Show list"
			   +"\n4 - Exit"
				);
	}

}
