package com;

public class Consultant extends Employee {
	
	private double consultingFees;

	public double getConsultingFees() {
		return consultingFees;
	}

	public void setConsultingFees(double consultingFees) {
		this.consultingFees = consultingFees;
	}
	public Consultant(int empId, String name, double basicPay, double perksPay,double consultingFees) {
		super(empId, name, basicPay, perksPay);
		this.consultingFees=consultingFees;
		
	}

	@Override
	public double calculateSalary() {
		 return this.getBasicPay()+this.getPerksPay()+this.consultingFees;
	
	}
	
	
}
