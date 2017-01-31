package com;

public class Faculty {
private int empid;
private String name;
private String subject;
Faculty(int empid,String name,String subject){
	this.empid=empid;
	this.name=name;
	this.subject=subject;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empId) {
	this.empid = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
}
