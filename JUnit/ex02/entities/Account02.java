package entities;

public class Account02 {
	
	public static double DEPOSIT_FEE_PERCENTAGE = 0.02;
	
	private Long id;
	private Double balance;
	
	public Account02() {
		
	}

	public Account02(Long id, Double balance) {
		super(); 
		this.id = id;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if(amount > 0) {
			amount -= amount * DEPOSIT_FEE_PERCENTAGE;
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			throw new IllegalArgumentException();
		}
		balance -= amount;
	}
	
	public double fullWithdraw() {
		double aux = balance;
		balance = 0.0;
		return aux;
	}
}
