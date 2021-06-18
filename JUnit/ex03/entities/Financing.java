package entities;

public class Financing {
	private Double totalAmount;
	private Double income;
	private Integer months;
	
	public Financing() {}
	
	public Financing(Double totalAmount, Double income, Integer months) {
		
		if(totalAmount * 20/100 <= income )
			 throw new IllegalArgumentException("The income must be 20 percent or less than amount"); 
		
		this.totalAmount = totalAmount;
		this.income = income;
		this.months = months;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		if(getTotalAmount() / 0.2 < totalAmount )
			 throw new IllegalArgumentException("The value must be 20 percent or less than amount"); 
		
		this.totalAmount = totalAmount;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		if(quota() > income /2.0)
			 throw new IllegalArgumentException("The installment must be half or more than income"); 
		
		this.income = income;	
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		this.months = months;
	}
	
	public double entry() {
		return totalAmount * 0.2;
	}
	
	
	public double quota() {
		return totalAmount * 0.8 / months;
	}
}
