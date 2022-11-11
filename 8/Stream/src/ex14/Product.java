package ex14;

import java.math.BigDecimal;

import ex14.Category;
import ex14.Status;

public class Product {
	
	private String name;
	private Status statusProduct;
	private BigDecimal price;
	private Category category;
	
	 
	public Product(String name, Status statusProduct, BigDecimal price, Category category) {
		this.name = name;
		this.statusProduct = statusProduct;
		this.price = price;
		this.category = category;
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
		this.statusProduct = Status.ATIVED;
		System.out.println(this.getName() + " was updated to " +this.getStatusProduct());
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
