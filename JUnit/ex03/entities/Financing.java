package entities;

public class Financing {
	private Double totalAmount;
	private Double income;
	private Integer months;
	
	public Financing() {}
	
	public Financing(Double totalAmount, Double income, Integer months) {
		this.totalAmount = totalAmount;
		this.income = income;
		this.months = months;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
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
