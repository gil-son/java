package ex02; // https://www.w3schools.com/java/java_abstract.asp

// Abstract Class
public abstract class  Animal  {
	public abstract void animalSound();
	
	public void sleep() {
		System.out.println("Zzz"); // Abstract Class allow code inside
	}
	
	// From the example above, it is not possible to create an object of the Animal class:
	
}


class Bird extends Animal{
	@Override 
	public void animalSound(){
		System.out.println("Piu");
	}
}

class Main{
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.animalSound();
		bird.sleep();
	}
	
}