package com;

import java.util.ArrayList;
import java.util.*;

public class TraingMngmtSys implements Training {
	ArrayList<TrainingProvider> providerList = new ArrayList<TrainingProvider>();
	ArrayList<Course> CourseList = new ArrayList<Course>();
	@Override
	public int addTrainingProvider(TrainingProvider tr) throws ProviderAlreadyExistsException {
		// TODO Auto-generated method stub

		for (TrainingProvider t:providerList) {
			if(tr.getName().equalsIgnoreCase(t.getName())&&tr.getLocation().equalsIgnoreCase(t.getLocation())){
				throw new ProviderAlreadyExistsException();
			}
		}
		providerList.add(tr);
		return providerList.size();

	}


	@Override
	public int addCourse(Course cr) {
		// TODO Auto-generated method stub
		int flag =0;
		for (Course course : CourseList) {
			if(cr.getCourseId()==course.getCourseId()){
				flag =1;

			}

		}if(flag==1){
			return CourseList.size();

		}else{
			CourseList.add(cr);
			return CourseList.size();

		}
	}

	@Override
	public String updateCourseList(String t, String c) throws CourseAlreadyExistsException{
		// TODO Auto-generated method stub


		for (TrainingProvider tp:providerList) {
			if(tp.getName().equalsIgnoreCase(t)){
				if(tp.getCourses().contains(c)){
					throw new CourseAlreadyExistsException();
				}tp.getCourses().add(c);
				return "courses added";
			}
		}
		return "provider not found";

	}
	public HashSet<String> getUniqueCourseByMode(String s){
		HashSet<String> hash = new HashSet<String>();
		for (Course course : CourseList) {
			if(course.getModeOfDelivery().equals(s)){
				hash.add(course.getCourseName());
			}
		}
		return hash;
	}
	public HashMap<String,ArrayList<String>> getProviderMapByCourse(){
		HashSet<String> h1= new HashSet<String>();
		for(Course course : CourseList) {
			h1.add(course.getCourseName());
		}
		HashMap<String,ArrayList<String>> hg = new HashMap<String,ArrayList<String>>();
		for (String st : h1) {
			ArrayList<String> a = new ArrayList<String>();
			for (TrainingProvider tp : providerList) {
				if(tp.getCourses().contains(st)){
					a.add(tp.getName());
				}
			}hg.put(st,a);
			
		}
		return hg;
	}
}