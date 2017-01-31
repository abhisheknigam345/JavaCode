package com;

public class CreditCardCompany {
public  double getPaybackAmount(Customer c){
		double credit =c.getCreditCardCharges();
		double payback;
		if(credit>2500){
		payback=0.01*credit;
		}
		else if(credit>1500&&credit<=2500){
			payback=0.75*credit/100;
			
		}
		else if(credit>500&&credit<=1500){
			payback=0.50*credit/100;
			
		}
		else
			payback=0.25*credit/100;
		return payback;
	}
}
