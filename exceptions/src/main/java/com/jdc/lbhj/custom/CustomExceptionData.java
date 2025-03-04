package com.jdc.lbhj.custom;

@SuppressWarnings("unused")
public class CustomExceptionData {

	public String changeCheckToUncheck(String message) {
		try {

			String mess = getMyCheckException(message);
			System.out.println(mess);

		} catch (MyCheckException e) {
			
			System.err.println(e.getMessage());
			throw new MyUncheckException(e.getMessage());
		}
		return message;
	}

	public String getMyCheckException(String message) throws MyCheckException { // used throws cause this is object
																					// creation place
		if (null == message || message.isBlank()) {
			throw new MyCheckException("There is no message yet for check!");
		}

		return message;
	}

	public String getMyUncheckException(String message) {

		if (null == message || message.isBlank()) {
			throw new MyUncheckException("There is no message yet for Uncheck!");
		}
		
		return message;
	}
}
