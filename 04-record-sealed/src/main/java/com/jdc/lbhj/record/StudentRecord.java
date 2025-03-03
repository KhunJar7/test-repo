package com.jdc.lbhj.record;

public record StudentRecord (
	int id,
	String name,
	int age) {
	//key => Default Final
	
	//မရေးလဲရ default => Canonical Constructor
	public StudentRecord(int id, String name, int age) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	//Compact Constructor
	/*public StudentRecord{
		if (id <= 0) {
			throw new IllegalArgumentException();
		}
		
		if (null == name) {
			throw new NullPointerException();
		}
		
		if (age <= 0) {
			throw new IllegalArgumentException();
		}
	}*/
	
	//Secondary Constructor (same with overloading)
	public StudentRecord(String name) {
		this(1, name, 1);//Parent constructor ကိုမဖြစ်မနေပြန်တည်ဆောက်‌‌ေပးရ
	}
}
