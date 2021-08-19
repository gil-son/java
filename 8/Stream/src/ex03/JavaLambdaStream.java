package ex03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaLambdaStream {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		
		// Java 4 = no data flow
		
		for(int i=0; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		// Java 5 = no data flow
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
		
		// Java 8 - Stream with Lambda = data flow
		
		/* each number of this stream is a data that is passing through the stream... 
		 * and can be operated by functions
		 */
		
		
		list.stream()
			.forEach( 
				e -> System.out.println(e));
		
	}
}
