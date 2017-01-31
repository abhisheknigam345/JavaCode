package com;
public class SavingAccount extends Account {

	SavingAccount(int accountId, int customerId, double balance) {
		super(accountId, customerId, balance);
	}

	public double deposit(double d) {
		return this.getBalance()+d;
	}


	public double withdraw(double w) {
		return this.getBalance()-w;
	}
	
	}

