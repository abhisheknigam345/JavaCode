package com;
import java.util.*;
public class Organization {
private ArrayList <Employee> employees=new ArrayList<Employee>();

public Organization(){}

public TreeSet<Employee> sortEmployees(){
	TreeSet<Employee> al=new TreeSet<Employee>();
	Collections.sort(employees);
	al.addAll(employees);
	
	
	return al;
	
	
}

public int addEmployee(Employee e) throws BasicPayException{

	
	if(e.getBasicPay()<0){
		 throw new BasicPayException(e.getBasicPay());
	}
	boolean flag=false;
	for(int i=0;i<employees.size();i++){
		if(e.getEmpId()==employees.get(i).getEmpId())
			flag=true;
	}
	if(flag)
		return -1;
	else{
		employees.add(e);
		return employees.size();
	}



}
public int searchEmployee(String emp){
	int count=0;
	for(int i=0;i<employees.size();i++){
		
	if(employees.get(i).getName()==emp)
			count++;
	}
	return count;
}

public int getEmployeeIdWithMaxSalary(){
	double max= employees.get(0).calculateSalary();
	int id = 0;
	for(int i=0;i<employees.size();i++){
		if(employees.get(i).calculateSalary()>max){
			max=employees.get(i).calculateSalary();
	
			id=employees.get(i).getEmpId();
		}
		
	}
	return id;
}

public ArrayList <Employee> getEmployees() {
	return employees;
}

public void setEmployees(ArrayList <Employee> employees) {
	this.employees = employees;
}

}
