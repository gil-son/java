package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;

public class AccountTests {
	
	@Test
	public void depositShouldIncreaseBalanceWhenPositiveAmount() {
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = new Account(1L, 0.0);
		
		acc.deposit(amount);
		
		// Assertions x;
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	
	public void depositShouldDonNothingWhenNegativeAmount() {
		double expectedValue = 100.0;
		Account acc  = new Account(1L, expectedValue);
		double amount = -200;
		acc.deposit(amount);
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	
}
