package com;

public class TestDemo {

	/**
	 * @author Rehan Raza
	 * 1190848
	 */
	public static void main(String[] args) {
		Chef[] i=new Chef[5];
		i[0]=new Chef(1,"asd",200);
		i[1]=new Chef(2,"asde",2300);
		i[2]=new Chef(3,"asfd",2000);
		i[3]=new Chef(4,"asdd",200);
		i[4]=new Chef(5,"asd",2000);
		System.out.println(ChefOperations.findChef(1,i).getName());
		System.out.println(ChefOperations.searchChef("ASD", i));
		System.out.println(ChefOperations.getHighestPaidChef(i).getName());
		
	}



}
