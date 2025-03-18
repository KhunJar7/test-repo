package com.jdc.lbhj;

public class CMethodReferenceDemo {

	public static void main(String[] args) {
		showMessage();
	}
	
	static void showMessage() {
		UsedInter i1 = m -> System.out.println(m);
		i1.use("Hello Lambda");
		
		ReferenceData data = new ReferenceData();
		String message = "Hello Method Reference";
		
		UsedInter i2 = data :: showInstanceMessage;
		i2.use(message);
		
		UsedInter i3 = ReferenceData :: showStaticMessage;
		i3.use(message);
		
		UsedInter i4 = ReferenceData :: new;
		i4.use(message);
	}
}

@FunctionalInterface
interface UsedInter {
	void use(String message);
}

class ReferenceData {

	public ReferenceData() {

	}

	public ReferenceData(String message) {
		System.out.println("Use Constructor :: " + message);
	}

	static void showStaticMessage(String message) {
		System.out.println("Use Static :: " + message);
	}

	void showInstanceMessage(String message) {
		System.out.println("Use Instance :: " + message);
	}
}
