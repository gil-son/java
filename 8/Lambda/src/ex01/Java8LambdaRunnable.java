package ex01;

public class Java8LambdaRunnable {

	public static void main(String[] args) {
		
		// Example Java 7 without Lambda
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello World!");
			}
			
		}).run();
		
		
		// Example Java 8 with Lambda
		
		new Thread(() -> { 
			System.out.println("Hello World!");
		}).run();

		
				
	}

}
