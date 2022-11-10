package ex13;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainPracticeWithProducts {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList();

		products.add(new Product("Water", Product.Status.ATIVED, new BigDecimal(1.0)));
		products.add(new Product("Windows", Product.Status.ATIVED, new BigDecimal(20.0)));
		products.add(new Product("Console", Product.Status.ATIVED, new BigDecimal(300.0)));
		
		
		System.out.println("WITHOUT STREAM = Imperative code = code with step by step");
		for(Product p : products) {if(p.getName().startsWith("W")) { p.setStatusProduct(Product.Status.INATIVED); }}
		
		System.out.println("WITH STREAM is like functional function");
		
		Predicate<Product> predicate = p -> p.getName().startsWith("W");
		Consumer<Product> consumer = p -> p.setStatusProduct(Product.Status.ATIVED);
				
		
		Stream<Product> streamProducts = products.stream().filter(predicate);
		streamProducts.forEach(consumer);
		
		// Others ways
		
		//streamProducts.forEach(p -> p.setStatusProduct(Product.Status.ATIVED));
		//streamProducts.forEach(Product::atived); // Instance with method
		
		
		// Simplify
		products.stream()
		.filter(p -> p.getName().startsWith("C")) // Intermediate = return other stream
		.forEach(Product::atived); // terminal =  finish the process = void
		
		
	}
}


class Product {
	
	private String name;
	private Status statusProduct;
	private BigDecimal price;
	
	 enum Status{
		ATIVED, INATIVED
	}
	 
	public Product(String name, Status statusProduct, BigDecimal price) {
		this.name = name;
		this.statusProduct = statusProduct;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Status getStatusProduct() {
		return statusProduct;
	}

	public void setStatusProduct(Status statusProduct) {
		this.statusProduct = statusProduct;
		System.out.println(this.getName() + " was updated to " +this.getStatusProduct());
	}
	
	public void atived() {
		this.statusProduct = Product.Status.ATIVED;
		System.out.println(this.getName() + " was updated to " +this.getStatusProduct());
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}