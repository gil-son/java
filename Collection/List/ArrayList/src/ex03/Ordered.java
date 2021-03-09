package ex03;

public class Ordered {
	private int id;
	private String name;
	private double price;
	
	
	public Ordered(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void print() {
		System.out.printf(" --- Registration Data --- \n Id: %d\n Name: %s\n Price: %f", getId(), getName(), getPrice());
	}
	
}
