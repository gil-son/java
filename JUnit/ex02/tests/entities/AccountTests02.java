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
	public void fullwithDrawShouldReturnZeroBalance() {
		double expectedValue = 0.0;
		double amount = 200.0;
		Account02 acc = AccountFactory.createAccount(amount);
		
		acc.fullWithdraw();
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
}
