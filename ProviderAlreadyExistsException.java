package com;

public class ProviderAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String getMessage(){
		return "Training Provider Already Exist!! Please recheck before adding.";
	}
}
