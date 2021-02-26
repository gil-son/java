package ex01;
import java.util.ArrayList;

public class Cars {
	public ArrayList<String> cars;
	
	/*
	public Cars() {
		ArrayList<String> cars = new ArrayList();
		this.cars = cars;
	}
	*/
	
	
	
	public void addOneCar( String car) { // Before to use this method, is necessary create a object ArrayList
		
		this.cars.add(car);
	}
	
	
	public void addMultiplesCars( ArrayList<String> cars) {
		this.cars = cars;
	}
	
	
	public ArrayList<String> cars( ){
		return this.cars;
	}
	
	public void showCars() {
		System.out.println(this.cars);
	}
	
	public void teste() {
		System.out.println(".");
	}
}