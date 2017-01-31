package com;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class Bank {

	 ArrayList <Account> acctList=new ArrayList<Account>();
	 Bank(){
		 
	 }
	 public boolean addAccount(Account acct){
		 int flag=0;
		 for(int i=0;i<acctList.size();i++){
		 if(acct.getAccountId()==acctList.get(i).getAccountId())
		 {
			flag=1;
		 }
		
	 }
		 if(flag==1)
			 return false;
			 else {
				 acctList.add(acct);
			 	return true;
			 	}
		 
	 }
	 public double deposit(int accId,double amount){
		double balance=-1;
		for(Account accnt:acctList){
			if(accnt.getAccountId()==accId){
				accnt.setBalance(accnt.getBalance()+amount);
				balance=accnt.getBalance();
			}
		}
		return balance;
	 }
	 public double withdraw(int accId,double amount)throws OutOfBalanceException{
		 double balance=-1;
		 double accntBalance=0;
		 boolean flag=false;
		 for(Account accnt:acctList){
			 if(accnt.getAccountId()==accId){
				 balance=accnt.getBalance()-amount;
				 accntBalance=accnt.getBalance();
				 flag=true;
				 if(balance>=0)
					 accnt.setBalance(balance);
			 }
		 }
		 if(balance<=0&&flag==true)
			 throw new OutOfBalanceException(accntBalance,amount);
		 else if(balance>=0&&flag==true)
			 return balance;
		 else 
			 return -1;
	 }
	 
	public HashSet<Integer>customerSet(){
		HashSet<Integer> set=new HashSet <Integer>();
		for(Account accnt:acctList){
			set.add(accnt.getCustomerId());
		}
		
		
		return set;
		
	}
	public HashMap<Integer,Account>acctMap(){
		HashMap<Integer,Account> hm=new HashMap<Integer,Account>();
		for(Account accnt:acctList){
			hm.put(accnt.getAccountId(), accnt);
		}
		return hm;
	}
	
}
