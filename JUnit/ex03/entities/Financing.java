package entities;

public class Financing {
	private Double totalAmount;
	private Double income;
	private Integer months;
	
	// public Financing() {} In this case, don't use default constructor, because it will avoid Null Pointer when create an object and setter an attribute
	
	public Financing(Double totalAmount, Double income, Integer months) {
		
		validateFinancing(totalAmount, income, months);
		
		this.totalAmount = totalAmount;
		this.income = income;
		this.months = months;
		/*
		if(quota() > income / 2.0) {
			throw new IllegalArgumentException("The quota/installment must be less or equal than half income");
		}
		*/
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		validateFinancing(totalAmount, income, months);
		this.totalAmount = totalAmount;
			
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		validateFinancing(totalAmount, income, months);
		this.income = income;	
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		validateFinancing(totalAmount, income, months);
		this.months = months;
	}
	
	public double entry() {
		return this.totalAmount * 0.2;
	}
	
	
	public double quota() {
		return this.totalAmount * 0.8 / months;
	}
	
	public void validateFinancing(Double totalAmount, Double income, Integer months) {
		if(totalAmount * 0.8 / months > income / 2.0) {
			throw new IllegalArgumentException("The quota/installment must be less or equal than half income");
		}
	}
}
