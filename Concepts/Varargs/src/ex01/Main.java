package ex01;

public class Main {

	public static void main(String[] args) {
		concat("message", "a", "b", "c", "etc...");
	}

	static void concat(String x, String... y) {
		
		for(String word : y) {
			x = x.concat(word);
		}
		
		System.out.print(x);
	}
	
}
