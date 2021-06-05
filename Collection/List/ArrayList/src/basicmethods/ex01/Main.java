package basicmethods.ex01;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		
	
	String lesson1 = "Modeling the Class";
	String lesson2 = "Knowing more about lists";
	String lesson3 = "Working with Courses and Sets";
	
	ArrayList<String> lessons = new ArrayList<String>();
	// 
	System.out.println("---- Add ----");
	
	lessons.add(lesson1);
	lessons.add(lesson2);
	lessons.add(lesson3);
	
	System.out.println(lessons);
	
	System.out.println("\n---- Remove by index ----");
	lessons.remove(0);
	System.out.println(lessons);
	
	 
	System.out.println("\n---- Pass the list ----");
	
	
	System.out.println("\n\t For Each: ");
	
	for(String lesson : lessons) {
		System.out.println("Lesson: "+lesson);
	}
	
	System.out.println("\n\t For: ");
	
	for(int i = 0; i < lessons.size(); i++) {
		System.out.println("lesson: "+lessons.get(i));
	}
	

	System.out.println("\n\t Lambda: ");
	lessons.forEach( lesson -> {
		System.out.println("\npass the list ");
		System.out.println("lesson: "+lesson);
	});
	
	
	System.out.println("\n\t Ordened List:");
	lessons.add("About self-taught");
	Collections.sort(lessons);
	System.out.println(lessons);
	
	// Então concluimos aqui
	}

}
