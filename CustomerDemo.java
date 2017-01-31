package com;

public class CustomerDemo {

	public static void main(String[] args) {
		try{
		Customer cust[]=new Customer[4];
		cust[0]=new Customer(1,'m',"abc",10);
		cust[1]=new Customer(2,'m',"cbc",20);
		cust[2]=new Customer(3,'f',"abc",5);
		cust[3]=new Customer(4,'m',"nbbc",30);
		String name=findYoungestCustomerName(cust,'m');
		System.out.println(name);
		}
		catch(Exception e){
			
		}
	}
	public static String findYoungestCustomerName(Customer[] arr,char g){
		try{
			
			double min=arr[0].getAge();
			int i,j;
			for(j=0;j<arr.length;j++){
				if(arr[j].getGender()=='g'){
					break;
				}
			}
			
			for(i=0;i<arr.length;i++){
				if(arr[i].getGender()=='g'&&arr[i].getAge()<min){
					min=arr[i].getAge();
				}
				
			}
			for(i=0;i<arr.length;i++){
				if(min==arr[i].getAge()){
					break;
			}
				
		}
		return arr[i].getName();
		}
		catch(Exception e){
		return null;
		}
	}
}
class Customer{
	private int custId;
	private char gender;
	private String name;
	private double age;
	Customer(int c,char g,String n,double a){
		custId=c;
		gender=g;
		name=n;
		age=a;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	
	
	
	
	
}
