package com;

public interface Training {
public int addTrainingProvider(TrainingProvider tr) throws ProviderAlreadyExistsException;
public int addCourse(Course cr);
public String updateCourseList(String t,String c) throws CourseAlreadyExistsException;
}
