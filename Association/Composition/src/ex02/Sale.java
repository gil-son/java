package ex02;

public class Sale {

	private Product product;
	private Seller seller;
	private Buyer buyer;
	
	
	public Sale(Product product, Seller seller, Buyer buyer) {
		this.product = product;
		this.seller = seller;
		this.buyer = buyer;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public Seller getSeller() {
		return seller;
	}


	public void setSeller(Seller seller) {
		this.seller = seller;
	}


	public Buyer getBuyer() {
		return buyer;
	}


	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}
}
