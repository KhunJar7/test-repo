package com.jdc.lbhj.custom;

@SuppressWarnings("serial")
public class MyCheckException extends Exception { // extends လုပ်လိုက်တာနဲ့ become Exception object 
	public MyCheckException() {
		super();
	}
	
	public MyCheckException(String message) {
		super(message);
	}
	
}
