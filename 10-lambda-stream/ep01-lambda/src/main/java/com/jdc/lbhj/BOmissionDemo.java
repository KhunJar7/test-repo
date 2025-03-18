package com.jdc.lbhj;

public class BOmissionDemo {

	void show() {
		
		int a = 50;		
		WithoutArgInter i1 = () -> a;		
		System.out.println(i1.getValue());
		
		ReturnInter i2 = (x, y) -> "Result : " + (x + y);
		System.out.println(i2.getMessage(3, 2));
		
		VoidInter i3 = message -> System.out.println(message);	
		i3.showMessage("Hello");
		
	}
}

@FunctionalInterface
interface ReturnInter{
	String getMessage(int a, int b);
}

@FunctionalInterface
interface VoidInter{
	void showMessage(String message);
}

@FunctionalInterface
interface WithoutArgInter{
	int getValue();
}
