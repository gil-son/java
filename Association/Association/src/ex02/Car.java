package ex02;

public class Car {
	
	 private Wheel wheel;
	 
	 public Car() {
		 
	 }
	 
	 public Car(Wheel wheel) {
		 this.wheel = wheel;  // this = indicate the class attribute 
	 }
	 
	 // getter and setter
	 
	 public Wheel getWheel() {
		 return wheel;
	 }
	 
	 public void setWheel(Wheel wheel) {
		 this.wheel = wheel;
	 }
	 
}
