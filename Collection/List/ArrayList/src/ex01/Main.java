package ex01;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> manyCars = new ArrayList<String>();
		manyCars.add("Volvo");
		manyCars.add("BMW");
		manyCars.add("Ford");
		
		Cars cars = new Cars(); 
		
		cars.addMultiplesCars(manyCars); 
		cars.addOneCar("Mazda"); // Before to use this method, is necessary create a object ArrayList
		
		cars.showCars();
		
	
	}

}
