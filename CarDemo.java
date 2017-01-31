package com;

public class CarDemo {
	public static void main(String[] args) {
		 Car cars[]=new Car[4];
		 cars[0]=new Car(101,400,1000);
		 cars[1]=new Car(201,500,2000);
		 cars[2]=new Car(301,600,3000);
		 cars[3]=new Car(401,800,4000);
		Car car=findCarWithHighestMilage(cars);
	}
	public static Car findCarWithHighestMilage(Car[] a){
		try{
			double max=a[0].getMilage();
			int i;
			for(i=0;i<a.length;i++){
				if(max<a[i].getMilage()){
					max=a[i].getMilage();
				}
			}
			for(i=0;i<a.length;i++){
				if(max==a[i].getMilage()){
					break;
			}
		}
		return a[i];
	}
	catch(Exception e){
		return null;
	}
}
}
class Car{
	
	
	private int regNo;
	private double milage;
	private int capacity;
	
	Car(int r,double m,int c){
		regNo=r;
		milage=m;
		capacity=c;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public double getMilage() {
		return milage;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}


