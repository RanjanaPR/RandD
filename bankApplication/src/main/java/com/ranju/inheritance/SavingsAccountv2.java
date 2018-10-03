package com.ranju.inheritance;

import com.ranju.bank.BankAccount;

public class SavingsAccountv2  extends BankAccount implements Insurance{

	public void getInsurance(int insuranceAmount) {
		
		int amount=insuranceAmount++;
	}

	public void PrintName(String insuranceName) {
		
		System.out.println("" +insuranceName);
	}

	public void getInsurancePeriod(int insurancePeriod) {
		
		int period=insurancePeriod++;
	}

}
