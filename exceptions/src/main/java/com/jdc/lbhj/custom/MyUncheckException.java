package com.jdc.lbhj.custom;

@SuppressWarnings("serial")
public class MyUncheckException extends RuntimeException { // extends လုပ်လိုက်တာနဲ့ become RuntimeException object 
	
	public MyUncheckException() {
		super();
	}
	
	public MyUncheckException(String message) {
		super(message);
	}
	
}
