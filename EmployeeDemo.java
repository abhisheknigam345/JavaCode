package com;

import java.util.TreeSet;

public class EmployeeDemo {


	public static void main(String[] args) throws BasicPayException {
		
		Organization o=new Organization();
		try{
		System.out.println(o.addEmployee(new Associate(3,"aaa",5000,7000)));
		System.out.println(o.addEmployee(new Associate(1,"aaa",4000,6000)));
		System.out.println(o.addEmployee(new Consultant(2,"bbb1",4000,1000,5000)));
		System.out.println(o.addEmployee(new Consultant(1,"bbb2",3000,1000,5000)));
		System.out.println(o.addEmployee(new Consultant(4,"bbb3",3000,8000,2000)));
		System.out.println(o.addEmployee(new Consultant(5,"bbb3",-3000,8000,2000)));;
		}
		catch(BasicPayException e){
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println(o.searchEmployee("aaa"));
		System.out.println(o.searchEmployee("bbb"));
		System.out.println("id with max salary:"+o.getEmployeeIdWithMaxSalary());
		System.out.println("ids:");
		TreeSet<Employee> set=o.sortEmployees();
		for(Employee e:set)
			System.out.println(e.getEmpId());
		
	}

}
