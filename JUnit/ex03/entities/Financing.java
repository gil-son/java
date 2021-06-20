package entities;

public class Financing {
	private Double totalAmount;
	private Double income;
	private Integer months;
	
	public Financing() {}
	
	public Financing(Double totalAmount, Double income, Integer months) {
		/*
		if(totalAmount == null)
			 throw new IllegalArgumentException("The Total Amount must be informed!"); 
		*/
		// 2000 >= 2000
		if(totalAmount * 0.8 / months > income / 2.0) {
			throw new IllegalArgumentException("The quota/installment must be less or equal than half income");
		}
		
		
		this.totalAmount = totalAmount;
		this.income = income;
		this.months = months;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		if(totalAmount * 0.8 / this.months > this.income / 2.0)
			this.totalAmount = totalAmount;
		else
			throw new IllegalArgumentException("The new Amount is not enough. Because the half installment is more than income"); 
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		if(quota() > income /2.0)
			 throw new IllegalArgumentException("The installment/quota must be half or more than income"); 
		
		this.income = income;	
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		if(totalAmount * 0.8 / months > this.income / 2.0)
			this.months = months;
		else
			throw new IllegalArgumentException("The new months is not enough. Because the half installment is more than income"); 
	}
	
	public double entry() {
		return this.totalAmount * 0.2;
	}
	
	
	public double quota() {
		return this.totalAmount * 0.8 / months;
	}
}
