package ex07;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,4,6,7,8,9);
		
		
		// Java 8
		
		List<Integer> newlist = list.stream()
		.filter( e -> e % 2 == 0)
		.map( e -> e * 3)
		.collect(Collectors.toList()); // created a new list and saved
		
		
		System.out.println(list);
		System.out.println(newlist);
	
	}
}
