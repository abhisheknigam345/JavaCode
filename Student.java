package com;

public class Student {
private String address;
private int age;
private String emailId;
private String name;
private String qualification;
private String sex;

Student(){
	
}
Student(String address,int age,String emailId,String name,String qualification,String sex){
	this.address=address;
	this.age=age;
	this.emailId=emailId;
	this.name=name;
	this.qualification=qualification;
	this.sex=sex;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}

}
