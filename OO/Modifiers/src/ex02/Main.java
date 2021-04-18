package ex02;

public class Main {
	// Static method
	static void myStaticMethod() {
		System.out.println("Only Class can call me");
	}
	
	// Public method
	public void myPublicMehtod() {
		System.out.println("Require an object to call me");
	}
	
	// Main method
	public static void main(String[] args) {
		myStaticMethod(); // Main.myStaticMethod()  Call the static method
		
		Main main = new Main();
		main.myPublicMehtod();
	}
	
	
	
}
