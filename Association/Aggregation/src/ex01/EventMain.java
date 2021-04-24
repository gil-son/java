package ex01;

public class EventMain {

	public static void main(String[] args) {
		
		
		Product product = new Product(1,525.0f,20);		Product product2 = new Product(2,800.2f,10);
		Seller seller = new Seller(1,105.0f);			Seller seller2 = new Seller(2,80.02f);
		Client client = new Client(1,1050.0f);			Client client2 = new Client(2,800.2f);
		
		
		Sales sales = new Sales(1, product, seller, client);
		Sales sales2 = new Sales(2, product2, seller2, client2);
		
		
		sales.confirmSales();
		sales2.confirmSales();
		sales2.cancelSales();
	}

}
