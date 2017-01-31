package com;

public class PizzaKing {

	
	public static void main(String[] args) {
	

	}
	public int performPizzaKingOperations(String m,String n){
		try {
			orderPizza(m,n);
			return 0;
		} catch (DuplicateOrderException e) {
			return -1;
			
		}
		catch(Exception e){
			return -2;
		}

	}
	public void orderPizza(String m,String n)throws DuplicateOrderException{
	if(m.equalsIgnoreCase(n)){
		throw new DuplicateOrderException();
	}
}

}
