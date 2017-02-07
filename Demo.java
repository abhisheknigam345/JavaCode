package com;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("rdbms");
		ArrayList<String> c2 = new ArrayList<String>();
		c2.add("java");
		ArrayList<String> c3 = new ArrayList<String>();
		c3.add("java");
		TrainingProvider t1 = new TrainingProvider("a1", "l1", c1);
		TrainingProvider t2 = new TrainingProvider("a2", "l2",c2);
		TrainingProvider t3 = new TrainingProvider("a3","l3",c3);
		TraingMngmtSys tms = new TraingMngmtSys();
		tms.providerList.add(t3);
		tms.providerList.add(t2);
		tms.providerList.add(t1);
		Course co1 = new Course(11,"java" ,"online");
		Course co2 = new Course(12, "rdbms", "offline");
		Course co3 = new Course(13,"C++","online");
		tms.CourseList.add(co1);
		tms.CourseList.add(co2);
		tms.CourseList.add(co3);
		System.out.println(" "+tms.getProviderMapByCourse());
	
	
	}

}
