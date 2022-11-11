package ex14;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainPracticeWithProducts {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList();
		List<Category> categories = new ArrayList();
		
		Category categoryMeet = new Category("Meet");
		Category categoryDrink = new Category("Drink");
		
		products.add(new Product("Wine", Status.ATIVED, new BigDecimal(1.0), categoryDrink));
		products.add(new Product("Beer", Status.ATIVED, new BigDecimal(1.0), categoryDrink));
		products.add(new Product("Bife", Status.ATIVED, new BigDecimal(20.0), categoryMeet));
		products.add(new Product("Loin Cuts", Status.ATIVED, new BigDecimal(300.0), categoryMeet));
			
		
		System.out.println("WITHOUT STREAM = Imperative code = code with step by step");
		
		for(Product p : products) {
			if(p.getStatusProduct().equals(Status.ATIVED)) {
				Category category = p.getCategory();
				if(!categories.contains(category)) {
					categories.add(category);
				}
			}
		}
		System.out.println("All categories:");
		for(Category c: categories) {System.out.println(c.getCategory());}
		
		
		
		System.out.println("WITH STREAM is like functional function");
		
		List<Category> categoriesList = products.stream()
				.filter(p -> p.getStatusProduct().equals(Status.ATIVED)) // Can be Lazy
				.map(Product::getCategory)  // p -> p.getCategory()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println("All categories:");
		for(Category c: categoriesList) {System.out.println(c.getCategory());}
		
	}
}


