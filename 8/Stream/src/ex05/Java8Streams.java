package ex05;


import java.util.Arrays;
import java.util.List;

public class Java8Streams {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,4,6,7,8,9);
		
		
		// Java 8
		
		long count = list.stream()
				.filter( e -> e % 2 == 0 && e > 7)
				.map(e -> e * 2)
				.count();
		
		System.out.println(count);
		
	}
}
