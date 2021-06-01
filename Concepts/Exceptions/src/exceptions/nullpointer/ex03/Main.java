package exceptions.nullpointer.ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Person p;
		
		Scanner t = new Scanner(System.in);
		int verify = 0;
		
		System.out.println("Type 1 to insert a reference or other digit to don't reference:");
		verify = t.nextInt();
		
		if(verify == 1) {
			p = new Person();
		}else {
			// Don't have references to any object
			p = null;
		}
	
		
		ProcessPerson pp = new ProcessPerson(p);
		
		
		// We can say that it "points to null" but more often we say that "the variable is null".
		pp.ProcessPerson(p);
		
	}

}
