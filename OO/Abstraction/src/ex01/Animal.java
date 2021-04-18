package ex01; // https://www.w3schools.com/java/java_abstract.asp

// Abstract Class
public abstract class  Animal  {
	public abstract void animalSound();
	
	public void sleep() {
		System.out.println("Zzz");
	}
	
	// From the example above, it is not possible to create an object of the Animal class:
	
}

class Main{
	public static void main(String[] args) {
		// Animal myObj = new Animal(); // will generate an error
	}
	
}