package com;
import java.util.HashMap;
public class SearchMap {

private HashMap<Student,Faculty> studentFacultyMap=new HashMap<Student,Faculty>();

private HashMap<String,String> studentFacultyNameMap =new HashMap<String,String>();
public Faculty getFaculty(Student student){
	if(studentFacultyMap!=null)
		return studentFacultyMap.get(student);
	
	else
		return null;
}
public String getFacultyName(String student){
	if(studentFacultyNameMap!=null)
		return studentFacultyNameMap.get(student);
	else 
		return null;
}


public void mapNames(String student,String faculty){
	
	studentFacultyNameMap.put(student, faculty);	
}
public void mapFaculty(Student student,Faculty faculty){
	studentFacultyMap.put(student, faculty);
}
}
