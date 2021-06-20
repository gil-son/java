package tests.entities;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import entities.Account02;
import entities.Financing;
import tests.factory.AccountFactory;
import tests.factory.FinancingFactory;

public class FinancingTests {

	@Test
	public void entryShouldByTweetyPorcentOfIncome() {
		double value = 100000.0;
		
		Financing finance = FinancingFactory.createFinance(value,4000.0,40);
		double expectedValue = finance.entry();
		
		Assertions.assertEquals(expectedValue, 0.2*finance.getTotalAmount());
		
	}
	
	
	@Test
	public void installmentShouldBeEightyPercentOfAmount() {
		double value = 100000.0;
		
		Financing finance = FinancingFactory.createFinance(value,4000.0,40);
		double expectedValue = finance.quota();
		
		Assertions.assertEquals(expectedValue, (finance.getTotalAmount()*0.8)/finance.getMonths());
	}
	
	
	@Test
	public void installmentShouldNotWhenIsMoreThanHalfIncome(){
	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			double value = 100000.0;
			FinancingFactory.createFinance(value,4000.0,39);
		});
	}
	
	// Constructor
	
	
	// Setters
	
	@Test
	public void setAmountShouldByInstallmentIsMoreThanHalfIncome() {
		double value = 100000.0;
		
		Financing finance = FinancingFactory.createFinance(value,4000.0,40);
		double expectedValue = 4005.0;
		finance.setIncome(4005.0);
		Assertions.assertEquals(expectedValue, finance.getIncome());
		
	}
	
	
	@Test
	public void setAmountShouldNotByInstallmentIsMoreThanHalfIncome() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			double value = 100000.0;
			Financing finance = FinancingFactory.createFinance(value,4000.0,40);
			finance.setIncome(3999.0);
		});
		
	}
	
	
	
	
}
