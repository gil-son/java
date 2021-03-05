package ex01;

public class Equals {
	public static void main( String[] args) {
		// Using String and Object
		String name1 = "aaa"; 
		String name2 = "aaa"; 
		String name3 = new String("aaa");
		String name4 = new String("aaa");
		
		System.out.println(" ---- String ---- ");
		
		// Return true because use the same space of memory and both are String
		System.out.println("String with String: "+(name1 == name2));
		
		// Return false because the location is memory Heap
		System.out.println("String with Object String: "+(name1 == name3));
		
		// Return false because location different in memory
		System.out.println("Object String with Object String: "+(name3 == name4));
		
		
		// Using Primitive type int and Wrapper Class 
		System.out.println();
		int n1 = 1, n2 = 1;
		Integer n3 = new Integer(1);
		
		System.out.println(" ---- int/Integer ---- ");
		
		// Return true because use the same space of memory and both are type int
		System.out.println("int with int: "+(n1 == n2));
		
		// Constructor Integer is deprecated since version 9
		// System.out.println("Int with Integer: "+(n1 == n3));
		
		
		// How to use the value and not the memory address?
		
		System.out.println("\n ---- Equals ---- ");
		System.out.println("Equals(String with Object String): "+(name1.equals(name3))); // Use CTRL + '+' to see equals()

		
		
	}
}
