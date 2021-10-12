package ex06;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Comparator;

public class Java8Streams {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,4,6,7,8,9);
		
		
		// Java 8
		
		Optional<Integer> min = list.stream()
		.filter( e -> e % 2 == 0)
		.min(Comparator.naturalOrder());
		
		System.out.println(min.get());
		System.out.println(min.orElse(5));
	}
}
