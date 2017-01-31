package com;

public class University {
	
	private String msg[]={"Student with the following details is added successfully to university","Student cannot be added to university as age is greater than 35 and less than 23"};
	public String[] addStudent(Student [] s){
	String messages[]=new String[s.length];
	if(s instanceof Student[]){
		for(int i=0;i<s.length;i++){
			try{
				registerStudent(s[i]);
				messages[i]=msg[0];
			}
			catch(AgeException ae){
				messages[i]=msg[1];
			}
		}
		return messages;
	}
	else
	
	return null;
}
public void registerStudent(Student st)throws AgeException{
	if(st.getAge()>35||st.getAge()<23)
		throw new AgeException();
	
}
}
