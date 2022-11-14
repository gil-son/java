package ex15;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainPracticeWithProducts extends Service{

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList();
		List<Category> categories = new ArrayList();
		
		Category categoryMeet = new Category("Meet");
		Category categoryDrink = new Category("Drink");
		
		products.add(new Product("Wine", Status.ATIVED, new BigDecimal(1.0), categoryDrink));
		products.add(new Product("Beer", Status.ATIVED, new BigDecimal(1.0), categoryDrink));
		products.add(new Product("Bife", Status.ATIVED, new BigDecimal(20.0), categoryMeet));
		products.add(new Product("Loin Cuts", Status.ATIVED, new BigDecimal(300.0), categoryMeet));
			
		boolean hasLoinCuts = Boolean.FALSE;
		
		System.out.println("WITHOUT STREAM = Imperative code = code with step by step");
		
		for(Product p : products) {
			if(p.getName().equals("Loin Cuts")) {
				hasLoinCuts = Boolean.TRUE;
				break;
			}
		}
		
		System.out.printf("Has Loin Cuts: %b", String.valueOf(hasLoinCuts));
		
		hasLoinCuts = Boolean.FALSE;
		
		System.out.printf("\nWITH STREAM is like functional function");

		 hasLoinCuts = MainPracticeWithProducts.verifyItem("Loin Cuts", products);

		System.out.printf("\nHas Loin Cuts: %b", String.valueOf(hasLoinCuts));
		
		System.out.printf("\n\n");
		
		System.out.print("WITHOUT STREAM = Imperative code = code with step by step");
		
		BigDecimal total = BigDecimal.ZERO;
		
		for(Product p : products) {
			if(p.getStatusProduct().equals(Status.ATIVED)) {
				total = total.add(p.getPrice());
			}
		}
		
		System.out.printf("\ntotal ATIVED\n" + total);
		
		total = BigDecimal.ZERO;
		
		System.out.printf("\nWITH STREAM is like functional function");

		 total = MainPracticeWithProducts.countByStatus(Status.ATIVED, products);

		 System.out.printf("\ntotal ATIVED\n" + total);
		
		
	}
}


