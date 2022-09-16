package ex12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(1L,"Customer A");
		Customer c2 = new Customer(1L,"Customer B");
		
		Product p1 = new Product(1L,"name product A", "Category A", 10.0, null);
		Product p2 = new Product(1L,"name product B", "Category B", 20.0, null);
		
		
		List<Product> listProduct1 = new ArrayList<>();
		listProduct1.add(p1);
		
		List<Product> listProduct2 = new ArrayList<>();
		listProduct2.add(p1); listProduct2.add(p2);
		
		Order o1 = new Order(1L,LocalDate.now(),LocalDate.now().plusDays(2L),"Status A", c1, listProduct1);
		Order o2 = new Order(2L,LocalDate.now(),LocalDate.now().plusDays(2L),"Status B", c2, listProduct2);
		
		List<Order> setOrder1 = new ArrayList<>();
		setOrder1.add(o1);
		
		List<Order> setOrder2 = new ArrayList<>();
		setOrder2.add(o2);
		
		p1.setOrders(setOrder1);
		p2.setOrders(setOrder2);
		
		System.out.print(listProduct2
				.stream()
				.collect(Collectors.toList()));
		
	}

}







