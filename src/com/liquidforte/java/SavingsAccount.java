package com.liquidforte.java;

public class SavingsAccount {
	private static double annualInterestRate = 0.00;
	private double savingsBalance = 0.00;
	
	public SavingsAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;
	}

	public void calculateMonthlyInterest() {
		savingsBalance += (savingsBalance * (annualInterestRate / 12));
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}	
}
