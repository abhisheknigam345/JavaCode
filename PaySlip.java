package com;

public class PaySlip {
public double calculateBasicSal(double grossSal){
	double basic=0.4*grossSal;
	return basic;
}
public double calculatePF(double basicSal){
	return(0.12*basicSal);
}
public double calculateHRA(double basicSal){
	return (basicSal/2);
}
public double calculateTotalSal(double basicSal,double hra,double cityallowance,double sundry,double lta,double performancePay){
	return(basicSal+hra+cityallowance+sundry+lta+performancePay);
	
}
public double calculateTotalDeductions(double totalSal,double pf,double profTax,double incomeTax){
	return (totalSal-profTax-pf-incomeTax);
}
public double calculateAnualSal(double totalSal){
	return (12*totalSal);
}
public double calculateAualRevisedSal(double anualSal,double percentageHike){
	return(anualSal+(percentageHike/100*anualSal));
}
}
class PaySlipDemo{
	public static void main(String args[]){
	PaySlip paySlip =new PaySlip();	
	double basic=paySlip.calculateBasicSal(60000);
	double pf=paySlip.calculatePF(basic);
	double hra=paySlip.calculateHRA(basic);
	double totalsal=paySlip.calculateTotalSal(basic, hra,1,3,4,5 );
	double totalde=paySlip.calculateTotalDeductions(totalsal, pf, 1, 3);
	double anualsal=paySlip.calculateAnualSal(totalsal);
	double ars=paySlip.calculateAualRevisedSal(anualsal, 50);
	
	}
	
}