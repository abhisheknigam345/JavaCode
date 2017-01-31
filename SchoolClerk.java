package com;
import java.util.List;
import java.util.TreeSet;

public class SchoolClerk {
public TreeSet<String> getUniqueStudentNames(List <Student> st){
	TreeSet<String> ts=new TreeSet<String>();
	if(st!=null){
		for(int i=0;i<st.size();i++)
			if(st.get(i).getName().toUpperCase()!=null)
			ts.add(st.get(i).getName());
	}
	return ts;
	}
}
