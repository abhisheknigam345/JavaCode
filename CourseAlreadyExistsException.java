package com;

public class CourseAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String getMessage(){
		return "Course Already Exist!! Please recheck before adding.";
	}

}
