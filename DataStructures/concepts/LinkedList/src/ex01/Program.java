package ex01;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int op;
		
		do {
			
			showMenu();
			op = sc.nextInt();
			
			
			
		}while(op !=3);
		
		
		sc.close();
	}

	
	public static void showMenu() {
		System.out.println(
				"\n1 - Insert element into list"
			   +"\n2 - Show list"
			   +"\n3 - Exit"
				);
	}

}
