package com;

public class EngineDemo {

	public static void main(String[] args) {
		Engine e1=new TwoStroke(1,2000,25,'g');
		Engine e2=new FourStroke(2,2000,25,'g');
		Engine e3=new TwoStroke(3,2000,25,'d');
		Engine e4=new FourStroke(4,2000,25,'d');
		System.out.println(e1.getMileage());
		System.out.println(e2.getMileage());
		System.out.println(e3.getMileage());
		System.out.println(e4.getMileage());
	}

}

