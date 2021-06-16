package tests.entities;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {

	@Test
	public void entryShouldByTweetyPorcentOfIncome() {
		double value = 100.0;
		
		Financing finance = FinancingFactory.createFinance(value,10.0,2);
		double expectedValue = finance.entry();
		
		Assertions.assertEquals(expectedValue, 0.2*finance.getTotalAmount());
		
		
	}
	
	@Test
	public void installmentShouldBeEightyPercentOfAmount() {
		double value = 100.0;
		
		Financing finance = FinancingFactory.createFinance(value,10.0,2);
		double expectedValue = finance.quota();
		
		Assertions.assertEquals(expectedValue, (finance.getTotalAmount()*0.8)/finance.getMonths());
	}
	
	@Test
	public void dontInstallmentWhenIsMoreThanHalfIncome(){
		double value = 100.0;
		
		Financing finance = FinancingFactory.createFinance(value,10.0,2);
		double expectedValue = finance.entry();
		
		Assertions.assertTrue(expectedValue <= finance.getTotalAmount() * 0.5);
	}
	
}
