package com;

public class PaySlipDemo {
	public static void main(String[] args) {
	PaySlip obj=new PaySlip();	
	obj.calculateBasicSal(60000);
	obj.calculatePF(0.4*60000);
	obj.calculateHRA(0.4*60000);
	obj.calculateTotalSal(0.4*60000,0.5*0.4*60000,1.0,1.0,1.0,1.0);
	obj.calculateTotalDeductions(1000, 10, 19, 20);
	obj.calculateAnualSal(100000);
	obj.calculateAualRevisedSal(1000000,5);
	
	
	}

}
