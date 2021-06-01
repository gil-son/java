package exceptions.nullpointer.ex01;

public class NullPointer {

	public static void main(String[] args) {
		
		String name; // String name = null;
		
		if(name != null) {
			System.out.println(name);
		}else {
			System.out.println("The references variable names is null");
		}
		
		
	}

}
