package com;

public class Customer {
private int accId;
private double creditCardCharges;
private int custId;

Customer(int custId,int accId,double creditCardCharges )
{
this.custId=custId;
this.accId=accId;
this.creditCardCharges=creditCardCharges;
}
public int getAccId() {
	return accId;
}
public void setAccId(int accId) {
	this.accId = accId;
}
public double getCreditCardCharges() {
	return creditCardCharges;
}
public void setCreditCardCharges(double creditCardCharges) {
	this.creditCardCharges = creditCardCharges;
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
}


