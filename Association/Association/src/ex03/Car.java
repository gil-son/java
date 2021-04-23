package ex03;

import java.util.ArrayList;


public class Car {
	
	private ArrayList<Wheel> listWheel = new ArrayList<Wheel>();
	boolean on;
	
	public ArrayList<Wheel> getWheel() {return listWheel;}
	public void setWheel(ArrayList<Wheel> whell) {this.listWheel = whell;}
	
	public void addWheel( Wheel wheel) {
		System.out.printf("\n The %s was equiped on the car",wheel.getName(),"\n");
		listWheel.add(wheel);
		
	}
	
	public void showListWheels() {
		System.out.printf("\n\n\tList equiped wheel(s):");
		for( Wheel wheelx : listWheel ) {System.out.printf("\n- %s",wheelx.getName());}
	}
	
	
	public boolean getOn() {return on;}
	public void setOn(boolean on) {this.on = on;}
	
	public void turnOn() {
		this.setOn(true);
		int countWheels=0;
		for( Wheel wheel : listWheel ) {
			countWheels++;
			if(wheel.getUnlocked() == false) {setOn(false);}
					 
		}
		
		if(countWheels == 4 ) {
			if(getOn()) {
				System.out.printf("\n\nThe car are on!"); 
			}else {
				System.out.printf("\nWarning! All wheels need to be Unlocked"); 
			}
		}else {
			System.out.printf("\nWarning! Verify the quantity of wheels");
		}
		
	}
	
	public void turnOff() {
		this.setOn(false); System.out.printf("\n\nThe car are off!"); 
	}
	
	
}
