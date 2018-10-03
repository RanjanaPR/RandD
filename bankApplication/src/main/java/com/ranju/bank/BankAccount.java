package com.ranju.bank;



/**hgjh
 * 
 * @author ranjpr
 *
 */
public class BankAccount {

	int accountNo;
	String accountHolderName;
	double accountBalance;
	static int autoAccountNoGen;
	
		public BankAccount( String accountHolderName, double accountBalance) {
		super();
		accountNo=++autoAccountNoGen;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
		public BankAccount() {
			accountNo=++autoAccountNoGen;
			accountHolderName="Unknown";
			accountBalance=0;
			
		}
		public void withdraw(double amount) {
			accountBalance-=amount;
		}
		public void  deposite(double amount) {
			accountBalance+=amount;
		}
		
				
		
		@Override
		public String toString() {
			return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName
					+ ", accountBalance=" + accountBalance + "]";
		}
		public int getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(int accountNo) {
			this.accountNo = accountNo;
		}
		public String getAccountHolderName() {
			return accountHolderName;
		}
		public void setAccountHolderName(String accountHolderName) {
			this.accountHolderName = accountHolderName;
		}
		public double getAccountBalance() {
			return accountBalance;
		}
		/*
		public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}*/
}
