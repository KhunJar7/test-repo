package com.jdc.lbhj.record;

public record School(
		int id,
		String major) {
	
	//မရေးလည်း default  ပါ, တခါတလေရေးကိုရေးရ Framework ကမသိလို့
	public int getId() {
		return id();
	}
	
	public String getMajor() {
		return major();
	}
}
