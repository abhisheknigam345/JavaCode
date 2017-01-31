package com;
import java.util.TreeSet;
public class NewBank {
	private TreeSet<Account> acctSet=new TreeSet<Account>();
	
	public void addAccountSet(Account account){
		acctSet.add(account);
	}
	public TreeSet<Account> getAcctSet(){
		return acctSet;
	}
}
