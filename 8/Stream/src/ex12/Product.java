package ex12;

import java.util.List;

public class Product {

	  private Long id;
	  
	  private String name;
	  private String category;
	  private Double price;
	  
	  private List<Order> orders;

	public Product(Long id, String name, String category, Double price, List<Order> orders) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.orders = orders;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	  
	}
