package ex02; // https://www.w3schools.com/java/java_interface.asp

public interface Animal {
	
	public abstract void animalSound(); // interface method (does not have a body)
	public void sleep(); // interface method (does not have a body)
	
}

// Pig "implements" the Animal interface
class Pig implements Animal{
	
	@Override
	public void animalSound() {
		System.out.println("Wee wee");
	}

	@Override
	public void sleep() {
		System.out.println("Zzz");
	}
}


class Main{
	public static void main(String[] args) {
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
	}
}


