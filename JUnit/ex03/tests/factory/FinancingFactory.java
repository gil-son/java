package tests.factory;

import entities.Financing;

public class FinancingFactory {

	public static Financing createFinance(Double amount, Double income, Integer months) {
		Financing f = new Financing(amount,income, months);
		return f;
	}
}
