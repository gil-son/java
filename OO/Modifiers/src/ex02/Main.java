package ex02; // https://www.w3schools.com/java/java_modifiers.asp

public class Main {
	// Static method
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects. Only Class can call me");
	}
	
	// Public method
	public void myPublicMehtod() {
		System.out.println("Public methods must be called by creating objects. Require an object to call me");
	}
	
	// Main method
	public static void main(String[] args) {
		myStaticMethod(); // Main.myStaticMethod()  Call the static method
		
		Main main = new Main();
		main.myPublicMehtod();
	}
	
	
	
}
