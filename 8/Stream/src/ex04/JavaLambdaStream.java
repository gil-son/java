package ex04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaLambdaStream {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		
		list.stream()
			.skip(2)
			.forEach( 
				e -> {
					
					Person p = new  Person("Name: "+String.valueOf(e));
					System.out.println(p.getName());
					
				});
		
	}	
				public class Test{
					
				
				}
	
	
	
}



class Car {
	private String name;
	Car(){}
	Car(String name){this.name = name;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
}