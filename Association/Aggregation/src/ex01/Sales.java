package ex01;

public class Sales {
	private int id;
	private Product product;
	private Seller seller;
    private Client client;
    
	public Sales(int id, Product product, Seller seller, Client client) {
		this.id = id;
		this.product = product;
		this.seller = seller;
		this.client = client;
	}
	
	public int getId() {return id;}
	public void setId(int id) {	this.id = id;}

	public Product getProduct() {return product;}
	public void setProduct(Product product) {this.product = product;}
	
	public Seller getSeller() {return seller;}
	public void setSeller(Seller seller) {this.seller = seller;}
	
	public Client getClient() {return client;}
	public void setClient(Client client) {this.client = client;}
    
	
	public void confirmSales() {
		
		System.out.printf("\n\n\tConfirm Sales"
							+ "\nid: %d"
							+ "\nproduct: %d"
							+ "\nseller: %d"
							+ "\nclient: %d",
							this.getId(),
							this.getProduct().getId(),
							this.getSeller().getid(),
							this.getClient().getId());
		
		this.getProduct().sold();
		this.getSeller().selles();
		this.getClient().info();
	}
	
	public void cancelSales() {
		System.out.printf("\n\n\tCancel Sales"
				+ "\nid: %d"
				+ "\nproduct: %d"
				+ "\nseller: %d"
				+ "\nclient: %d",
				this.getId(),
				this.getProduct().getId(),
				this.getSeller().getid(),
				this.getClient().getId());
	}
} 