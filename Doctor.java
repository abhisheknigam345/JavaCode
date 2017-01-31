package com;

public class Doctor {
private int regNo;
private String doctorName;
private String specialization;
private double consultingFee;
public int getRegNo() {
	return regNo;
}

public void setRegNo(int regNo) {
	this.regNo = regNo;
}

public String getDoctorName() {
	System.out.println(doctorName);
	return doctorName;
}

public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}

public String getSpecialization() {
	return specialization;
}

public void setSpecialization(String specialization) {
	this.specialization = specialization;
}

public double getConsultingFee() {
	return consultingFee;
}

public void setConsultingFee(double consultingFee) {
	this.consultingFee = consultingFee;
}
Doctor(int rNo,String dn,String spec,double cf ){
	regNo=rNo;
	doctorName=dn;
	consultingFee=cf;
	specialization=spec;
}

public  String displayDoctorDetail(){
	String format="Doctor Name :"+doctorName +"Specialization :"+specialization;
	System.out.println(format);
	return format;
}
}
