package tests.entities;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import entities.Account02;
import entities.Financing;
import tests.factory.AccountFactory;
import tests.factory.FinancingFactory;

public class FinancingTests {

	@Test
	public void entryShouldReturnTwentyPercentOfTotalAmount() {

		Financing finance = FinancingFactory.createFinance(100000.0,2000.0,80);
		double expectedValue = 0.2*finance.getTotalAmount();
		double entry = finance.entry();
		
		Assertions.assertEquals(expectedValue, entry);
		
	}
	

	
	@Test
	public void quotainstallmentShouldBeEightyPercentOfAmount() {
		
		Financing finance = FinancingFactory.createFinance(100000.0,2000.0,80);
		
		double expectedValue = (finance.getTotalAmount()*0.8)/finance.getMonths();
		double result = finance.quota();
		
		Assertions.assertEquals(expectedValue, result);
	}
	
	// Constructor
	
	@Test
	public void constructorShouldSetValuesWhenValidData() {
		double values[] = {100000.0, 2000.0};
		int value = 80;
		Financing finance = FinancingFactory.createFinance(values[0], values[1], value);
		
		Assertions.assertEquals(values[0], finance.getTotalAmount());
		Assertions.assertEquals(values[1], finance.getIncome());
		Assertions.assertEquals(value, finance.getMonths());
		
	
	}
	
	
	@Test
	public void constructorShouldIllegalArgumentExceptionWhenInvalidData(){
	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			FinancingFactory.createFinance(100000.0,2000.0,79);
		});
	}
	
	// Setters
	
	@Test
	public void setTotalAmountShouldSetValueWhenValidaData() {

		Financing finance = FinancingFactory.createFinance(100000.0, 2000.0, 80);
		finance.setTotalAmount(90000.0);
		
		Assertions.assertEquals(90000.0, finance.getTotalAmount());
	}
	
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenValidaData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing finance = FinancingFactory.createFinance(100000.0, 2000.0, 80);
			finance.setTotalAmount(110000.0);
		});
	}
	
	
	@Test
	public void setIncomeShouldSetValueWhenValidaData() {
		
		Financing finance = FinancingFactory.createFinance(100000.0, 2000.0, 80);
		finance.setIncome(3000.0);
		Assertions.assertEquals(3000, finance.getIncome());
		
	}
	
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenValidaData(){
	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing finance = FinancingFactory.createFinance(100000.0, 2000.0, 80);
			finance.setIncome(1500.0);
		});
	}
	
	
	
	@Test
	public void setMonthsShouldSetValueWhenValidaData() {
		
		Financing finance = FinancingFactory.createFinance(100000.0, 2000.0, 80);
		finance.setMonths(81);
		Assertions.assertEquals(81, finance.getMonths());
		
	}
	
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenValidaData(){
	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing finance = FinancingFactory.createFinance(100000.0, 2000.0, 80);
			finance.setMonths(79);
		});
	}
	
}
