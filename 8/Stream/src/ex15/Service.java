package ex15;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.BinaryOperator;

public class Service {

	public static Boolean verifyItem(String nameItem, List<Product> products) {
		boolean hasLoinCuts = products.stream()
				.anyMatch(p -> p.getName().equals(nameItem));
		return hasLoinCuts;
	}

	
	public static BigDecimal countByStatus(Status status, List<Product> products) {
		
		BinaryOperator<BigDecimal> operation = (x, y) -> x.add(y);
		
		BigDecimal total = products.stream()
				.filter(p -> p.getStatusProduct().equals(status))
				.map(Product::getPrice)
				.reduce(BigDecimal.ZERO, operation); // BigDecimal::add = by each iten from map, add
		
		return total;
	}
	
}
