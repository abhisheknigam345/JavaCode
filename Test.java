package com;

public class Test {


	public static void main(String[] args) {
		
		Bank obj=new Bank();
		System.out.println(obj.addAccount(new SavingAccount(1,101,1000)));
		System.out.println(obj.addAccount(new SavingAccount(2,201,1000)));
		System.out.println(obj.addAccount(new SavingAccount(3,301,1000)));
		System.out.println(obj.addAccount(new SavingAccount(4,401,1000)));
		System.out.println(obj.addAccount(new SavingAccount(4,401,1000)));
		
		
		
		try{
			System.out.println(obj.withdraw(1, 500));
			System.out.println(obj.withdraw(3, 1000));
			
		}
		catch(OutOfBalanceException ex){
			System.out.println(ex.getMessage());
		}
		

	}

}
