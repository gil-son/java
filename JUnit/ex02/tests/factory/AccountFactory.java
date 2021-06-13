package tests.factory;

import entities.Account02;

public class AccountFactory {
	
	public static Account02 createEmptyAccount() {
		return new Account02(1L, 0.0);
	}
	
	public static Account02 createAccount(double initialBalance) {
		return new Account02(1L, initialBalance);
	}
}
