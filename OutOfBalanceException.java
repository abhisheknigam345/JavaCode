package com;

public class OutOfBalanceException extends Exception {

	//private static final long serialVersionUID = 1L;
	private double currentAmmount;
	private double withdrawAmmount;
	OutOfBalanceException(double currentAmmount,double withdrawAmmount){
		this.currentAmmount=currentAmmount;
		this.withdrawAmmount=withdrawAmmount;
	}
	
	public String getMessage(){
		double blnc=this.currentAmmount-this.withdrawAmmount;
		String msg=""+blnc;
		return msg;
	}
	
}
