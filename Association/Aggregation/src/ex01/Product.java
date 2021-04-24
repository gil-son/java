package ex01;

public class Product {
	private int id;
	private float price;
	private int size;
	
	public Product( int id, float price, int size) {
		this.id = id;
		this.price = price;
		this.size = size;
	}
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}

	public float getPrice() {return price;}
	public void setPrice(float price) {this.price = price;}
	
	public int getSize() {return size;}
	public void setSize(int size) {this.size = size;}
	
	public void sold() {
		System.out.printf("\n\n\tProduct\n id:%d\t price: %f\t size: %d",this.getId(),this.getPrice(),this.getSize());
	}
}
