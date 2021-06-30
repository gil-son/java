package ex02;

public class Product {
	
	private float price;
	private int size;
	
	public Product() {
		
	}
	
	public Product(float price, int size) {
		this.price = price;
		this.size = size;
	}
	
	public void sold() {
		
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
}
