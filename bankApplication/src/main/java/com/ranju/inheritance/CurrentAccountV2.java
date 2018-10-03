package com.ranju.inheritance;

public class CurrentAccountV2 implements Insurance{
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
