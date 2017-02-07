package com;

import java.util.ArrayList;

public class TrainingProvider {
private String name;
private String location;
private ArrayList<String> courses;
public TrainingProvider(String name, String location, ArrayList<String> courses) {
	super();
	this.name = name;
	this.location = location;
	this.courses = courses;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public ArrayList<String> getCourses() {
	return courses;
}
public void setCourses(ArrayList<String> courses) {
	this.courses = courses;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((courses == null) ? 0 : courses.hashCode());
	result = prime * result + ((location == null) ? 0 : location.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	TrainingProvider other = (TrainingProvider) obj;
	if (courses == null) {
		if (other.courses != null)
			return false;
	} else if (!courses.equals(other.courses))
		return false;
	if (location == null) {
		if (other.location != null)
			return false;
	} else if (!location.equals(other.location))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}


}
