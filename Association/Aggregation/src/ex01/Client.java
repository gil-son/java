package ex01;

public class Client {
	private int id;
	private float money;
	

	public Client(int id, float money) {
		this.id = id;
		this.money = money;
	}
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}

	public float getMoney() {return money;}
	public void setMoney(float money) {this.money = money;}
	
	public void info() {
		System.out.printf("\n\n\tClient\n id: %d\t money: %f",this.getId(),this.getMoney());
	}
}
