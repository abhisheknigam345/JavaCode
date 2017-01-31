package com;

public class StaticVarDemo {
	public static void main(String[] args) {

	}

}
class IDGenerator{
	public static int id =1;

}
class Account{
	private int accountId =IDGenerator.id++;
	private int customerId;
	private double balance;
	Account(int c,double b){
		customerId=c;
		balance=b;
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
	
	
	
}
