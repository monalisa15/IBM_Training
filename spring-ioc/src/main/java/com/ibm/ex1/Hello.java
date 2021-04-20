package com.ibm.ex1;

public class Hello {
	
	private String message;
	
	public Hello() {
		System.out.println("Default Constructor");
	}

	public Hello(String message) {
		this.message = message;
		System.out.println("Parameter Constructor");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("Setter Method");
	}
	
	

}
