package ex08;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Streams {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,4,6,7,8,9);
		List<String> listWords = Arrays.asList("aaa", "bbb", "ccc");
		
		// Java 8
		
		Map<Boolean, List<Integer>> themapBoolean = list.stream()
		.map( e -> e * 3)
		.collect(Collectors.groupingBy(e -> e % 2 == 0)); // The return is Boolean
		
		
		System.out.println(themapBoolean);
		
	
		Map<Integer, List<Integer>> themapInt = list.stream()
				.map( e -> e * 3)
				.collect(Collectors.groupingBy(e -> e % 3)); // The return is Integer
				
		System.out.println(themapInt);
				
				
		Map<Object, List<String>> themapString = listWords.stream() 
		.collect(Collectors.groupingBy(e -> e == "aaa")); // The return is String
				
				
		System.out.println(themapString);
		
	}
}
