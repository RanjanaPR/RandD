package com.ranju.cust;

import com.ranju.bank.BankAccount;
import com.ranju.inheritance.SavingsAccount;

public class Customer {
	public static void main(String[] args) {
	BankAccount acc=null;
	acc=new SavingsAccount();
	acc.withdraw(5000);
	
	}
}
