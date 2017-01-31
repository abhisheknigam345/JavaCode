package com;

public abstract class Employee implements Comparable<Employee>{
	private int empId;
	private String name ;
	private double basicPay;
	private double perksPay;
	
	Employee(int empId,String name,double basicPay,double perksPay){
		this.empId=empId;
		this.name=name;
		this.basicPay=basicPay;
		this.perksPay=perksPay;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getPerksPay() {
		return perksPay;
	}
	public int compareTo(Employee e) {
		if(this.getEmpId()>e.getEmpId())
			return 1;
		else if(this.getEmpId()==e.getEmpId())
			return 0;
		else if(this.getEmpId()<e.getEmpId())
			return -1;
		return empId;
	}


	public void setPerksPay(double perksPay) {
		this.perksPay = perksPay;
	}
	
	
	public abstract double calculateSalary();
}
