package ex04;

import java.util.Arrays;
import java.util.List;




public class JavaLambdaStream {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,4,6,7,8,9);
		
		// Are operations can be intregrantion between stream, how many is necessary
		list.stream()
			.filter(e -> e % 2 == 0)
			.skip(2) // Intermed operation
			.skip(1) // Intermed operation
			.limit(3)
			.map(e -> e * 2)
			.distinct()
			.forEach( 
				e -> {
					
					Person p = new  Person("Name: "+String.valueOf(e));
					Car c = new  Car("Car: "+String.valueOf(e));
					
					System.out.println(p.getName());
					System.out.println(c.getName());
				});
	}	
				public class Wheel{
					private String name;
					Wheel(){}
					Wheel(String name){this.name = name;}
					public String getName() {return name;}
					public void setName(String name) {this.name = name;}
				
				}
	
}



class Car {
	private String name;
	private Wheel wheel;
	Car(){}
	Car(String name){this.name = name;}
	Car(String name, Wheel wheel){this.name = name; this.wheel = wheel;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
}


class Wheel{
	private String name;
	Wheel(){}
	Wheel(String name){this.name = name;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

}