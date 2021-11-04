package ex02;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// specific(new ArrayList<Horse>()); // <== compiler error, because no access the class Horse
		
			wildcard(new ArrayList<Horse>());
			
			genericsExtends(new ArrayList<Horse>());
	}
	
	
	class Animal { }
	class Horse extends Animal { }

	
	// Access the last extends - Without the extends syntax you can only use the exact class in the signature
	private static void specific(List<Animal> param) { }

	
	// Access the all extends - With the wildcard extends you can allow any subclasses of Animal
	private static void wildcard(List<? extends Animal> param) { }
	
	
	// Access the all extends - With the genericsExtends extends you can allow any subclasses of T (Generics)
	private static <T> void genericsExtends(List<? extends T> param) { }
	
}
