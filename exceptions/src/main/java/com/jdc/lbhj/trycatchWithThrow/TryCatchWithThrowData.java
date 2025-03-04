package com.jdc.lbhj.trycatchWithThrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class TryCatchWithThrowData {

	public void useMessage() {

		try {

			String message = getData();

			System.out.println("This is message for you : " + checkMessage(message));

		} catch (IOException e) {

			System.err.println(e.getMessage());// err => , .getMessage is from Throwable object

		} catch (NoSuchElementException e) {

			System.err.println(e.getMessage());

		}

	}

	/*
	 * //Checked Exception eg , must throws, when throws must same type or super type of your created object exception
	 * private String checkMessage(String message) throws Exception {
	 * 
	 * if (message.isBlank()) { throw new Exception("There is no message !");// need
	 * throws cause of checked exception }
	 * 
	 * return message; }
	 */

	@SuppressWarnings("unused")

	private String checkMessage(String message) {

		if (message.isBlank()) {
			throw new NoSuchElementException("There is no message !"); // don't need throws cause of unchecked exception
																		// if you want to you can
			// throw new Exception("There is no message !");// must throws cause of checked
			// exception
		}

		return message;
	}

	private String getData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Type your message : ");
		return br.readLine();

	}
}
