package ex01;

public class CreateCar {

	public static void main(String args[] ) {
		
		Wheel wheel = new Wheel("rubber");
		
		Car car = new Car(wheel);
		
		System.out.println(car.wheel.texture);
		
	}
}
