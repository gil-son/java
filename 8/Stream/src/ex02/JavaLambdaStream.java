package ex02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaLambdaStream {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		// Stream with Lambda
		list.stream()
			.filter(e -> e % 2 == 0)
			.forEach( 
				e -> System.out.println(e));
		
		// Stream without Lambda
		list.stream()
		.filter(new Predicate<Integer>() {
			@Override
			public boolean test(Integer e) {
				return e % 2 == 0;
			}
		})
		.forEach((Consumer<? super Integer>) new Consumer<Integer>() {
			@Override
			public void accept(Integer e) {
				System.out.println(e);
			}
		});
		
	}
}
