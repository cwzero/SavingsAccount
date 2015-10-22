package com.liquidforte.java;

public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		SavingsAccount.setAnnualInterestRate(0.04);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf("Saver 1: $%.2f\n", saver1.getSavingsBalance());
		System.out.printf("Saver 2: $%.2f\n", saver2.getSavingsBalance());
		SavingsAccount.setAnnualInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf("Saver 1: $%.2f\n", saver1.getSavingsBalance());
		System.out.printf("Saver 2: $%.2f\n", saver2.getSavingsBalance());
	}

}
