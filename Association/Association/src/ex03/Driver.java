package ex03;


public class Driver {
	
	public static void main( String[] args) {
		
		Wheel wheel1 = new Wheel();		
		Wheel wheel2 = new Wheel();
		Wheel wheel3 = new Wheel();		
		Wheel wheel4 = new Wheel();
		
		wheel1.setName("Front left wheel"); 	
		wheel2.setName("Front right wheel");
		wheel3.setName("Back left wheel"); 		
		wheel4.setName("Back right wheel");
		
		Car car = new Car();
		
		car.addWheel(wheel1); 
		car.addWheel(wheel2); 
		car.addWheel(wheel3); 
		car.addWheel(wheel4);
		
		car.showListWheels();
		
		
		
		wheel1.setUnlocked(true);		
		wheel2.setUnlocked(true); 
		wheel3.setUnlocked(true); 		
		wheel4.setUnlocked(true);
		
		car.turnOn();
		car.turnOff();
	}

}
