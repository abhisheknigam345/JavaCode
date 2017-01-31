package com;

public class Associate extends Employee {

	Associate(int empId, String name, double basicPay, double perksPay) {
		super(empId, name, basicPay, perksPay);
		
	}
	public double calculateSalary() {
		
	
		return this.getBasicPay()+this.getPerksPay();
	}
}
