package exceptions.nullpointer.ex02;

public class Main {

	public static void main(String[] args) {
		// Don't have references to any object
		Address ad = null;
		
		// We can say that it "points to null" but more often we say that "the variable is null".
		System.out.println(ad.getAllAddress());
		
	}

}
