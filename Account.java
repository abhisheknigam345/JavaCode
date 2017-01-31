package com;

public abstract class Account implements Comparable<Account> {
	private int accountId;
	private int customerId;
	private double balance;
	Account(int accountId,int customerId,double balance){
		this.accountId=accountId;
		this.customerId=customerId;
		this.balance=balance;
	}
	

	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int compareTo(Account accnt) {
		if(this.getAccountId()>accnt.getAccountId())
			return 1;
		else if(this.getAccountId()==accnt.getAccountId())
			return 0;
		else 
			return -1;
		
	}
	public abstract double deposit(double d);
	public abstract double withdraw(double w);
	
}
