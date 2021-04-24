package ex01;

public class SavingAccount {
	
	private int id;
    private float balance;
    
	public SavingAccount(int id, float balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	
	public float getBalance() {return balance;}
	public void setBalance(float balance) {this.balance = balance;}
    
    public void deposit(float value) {
    	this.setBalance(value+this.getBalance());
    }
    
    public void withDraw(float value) {
    	if(this.getBalance() >= value) {
    		this.setBalance(this.getBalance() - value);
    		System.out.printf("\n\nThe withdrawal is done!");
    	}else {
    		System.out.println("\n\nWarning! You don't have enough balance");
    	}
    }
    
    public void status() {
    	System.out.printf("\n\n\t Saving Account Status\n id: %d\n balance: %f",this.getId(),this.getBalance());
    }
    
}
