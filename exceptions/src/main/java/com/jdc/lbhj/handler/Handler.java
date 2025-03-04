package com.jdc.lbhj.handler;

public class Handler {

	private Person person;
	private int count = 1;

	public Handler() {
		super();
		person = new Person();
	}

	// NullPointer Exception when person obj is not created yet
	public void useName() {
		try {
			person.setName("Kavin");
			System.out.println(person.getName());
		} catch (NullPointerException e) {
			System.out.println("This is NullPointerException because there is no person object !");
		}
	}

	// ArithmeticException
	public void useAge() {
		try {
			person.setAge(20);
			int age = dividedByZero(person.getAge());
			System.out.println(age);
			
		} catch (ArithmeticException e) {
			System.out.println("This is ArithmeticException because any number can't devided by zero !");
		}
	}

	public int dividedByZero(int age) {
		return age / 0;
	}

	// StackOverflow error
	public void recursive() {
		try {
			if (count > 0) {
				System.out.println("Recursive : " + count);
				count++;
				recursive();
			}
		} catch (StackOverflowError e) {
			System.out.println("This is StackOverFlowError cause of recursive !");//Error
		}
	}
}
