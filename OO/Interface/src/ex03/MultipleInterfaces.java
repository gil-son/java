package ex03; // w3schools.com/java/java_interface.asp

interface FirstInterface {
	  public void myMethod(); // interface method
}

interface SecondInterface {
	  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface{
	@Override
	public void myMethod() {
		System.out.println("Some text...");
	}
	
	public void myOtherMethod() {
		System.out.println("Some other text...");
	}
}

class Main{
	public static void main(String[] args) {
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}
}


