package ex01;

import java.util.Arrays;
import java.util.List;

public class JavaLambdaStream {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
	
		// Java 7 - Without stream
		
		/*
		for(Integer integer : list) {
			System.out.println(integer);
		}
		*/
		
		
		// Java 7 - With Stream
		
		// list.stream().forEach();
		
		list.stream().forEach( 
				e -> System.out.println(e));
		
	}
}
