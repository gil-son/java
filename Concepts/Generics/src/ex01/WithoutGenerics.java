package ex01;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenerics {

	public static void main(String[] args) {
		
		System.out.println(WithoutGenericsModeDefined());
		
		System.out.println(WithoutGenericsModeCast());
	}
	
	
	public static String WithoutGenericsModeDefined() {
		List<String> string = new ArrayList<>();

		string.add("Hello"); string.add("World");
		
		String hello = string.get(0); String world = string.get(1);
		
		return hello+" "+world;
	}

	
	public static String WithoutGenericsModeCast() {
		List string = new ArrayList<>();

		string.add("Hello"); string.add("World");
		
		String hello = (String) string.get(0); String world = (String) string.get(1);
		
		return hello+" "+world;
	}
	
}
