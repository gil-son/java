package ex01;

public class Seller {
	private int id;
	private float comission;
	
	public Seller(int id, float comission) {
		this.id = id;
		this.comission = comission;
	}
	
	public int getid() {return id;}
	public void setid(int id) {this.id = id;}
	public float getComission() {return comission;}
	public void setComission(float comission) {this.comission = comission;}
	
	public void selles() {
		System.out.printf("\n\n\tSeller\n seller: %d\t comission: %f", this.getid(), this.getComission());
	}
	
}
