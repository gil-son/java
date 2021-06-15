package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import entities.Account02;
import tests.factory.AccountFactory;

public class AccountTests02 {
	
	@Test
	public void depositShouldIncreaseBalanceWhenPositiveAmount() {
		double amount = 200.0;
		double expectedValue = 196.0;
		
		Account02 acc  = AccountFactory.createEmptyAccount();
		
		acc.deposit(amount);
		
		// Assertions x;
		Assertions.assertEquals(expectedValue, acc.getBalance());
	} 
	
	@Test
	public void depositShouldDonNothingWhenNegativeAmount() {
		double expectedValue = 100.0;
		Account02 acc  = AccountFactory.createAccount(expectedValue);
		double amount = -200;
		acc.deposit(amount);
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	@Test
	public void fullwithDrawShouldClearBalanceAndReturnFullBalance() {
		double expectedValue = 0.0;
		double value = 200.0;
		
		Account02 acc = AccountFactory.createAccount(value);
		
		
		double result = acc.fullWithdraw();
		
		Assertions.assertTrue(result == value);
		Assertions.assertTrue(expectedValue == acc.getBalance());
	}
	
	@Test
	public void withdrawShouldDecreaseBalanceWhenSufficientBalance() {
		Account02 acc = AccountFactory.createAccount(800.0);
		acc.withdraw(500.0);
		Assertions.assertEquals(300, acc.getBalance());
	}
	
	@Test
	public void withdrawShouldThrowExceptionWhenInsufficientBalance() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Account02 acc = AccountFactory.createAccount(800.0);
			acc.withdraw(801.0);
		});
	}
}

















