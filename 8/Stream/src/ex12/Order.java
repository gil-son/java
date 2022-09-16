package ex12;

import java.time.LocalDate;
import java.util.List;

public class Order {

	private Long id;
	  private LocalDate orderDate;
	  private LocalDate deliveryDate;
	  private String status;
	  private Customer customer;
	  
	  List<Product> products;

	public Order(Long id, LocalDate orderDate, LocalDate deliveryDate, String status, Customer customer,
			List<Product> products) {
		
		this.id = id;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.status = status;
		this.customer = customer;
		this.products = products;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
