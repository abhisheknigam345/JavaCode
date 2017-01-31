package com;

public class AreaDemo {

	static double pi=22.0/7; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println(AreaDemo.findArea(-9));
		System.out.println(AreaDemo.findArea(2,3));
		System.out.println(AreaDemo.findVolume(3));
		System.out.println(AreaDemo.findVolume(-1, 2));*/
		
	}
public static double findArea(double a){
	try{
		double area;
		if(a>0){
		area=pi*a*a;
		return area;
		}
		else
			return -1;
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
return 0;	
}
public static double findArea(double a,double b){
	try{
		double area;
		if(a>0&&b>0){
		area=a*b;
		return area;
		}
		else
			return -1;
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
return 0;	
}
public static double findVolume(double a){
	try{
		double volume;
		if(a>0){
		volume=4/3*pi*a*a*a;
		return volume;
		}
		else
			return -1;
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return 0;
}
public static double findVolume(double a,double b){
	try{
		double volume;
		if(a>0&&b>0){
		volume=pi*a*a*b;
		return volume;
		}
		else
			return -1;
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return 0;
}
}
