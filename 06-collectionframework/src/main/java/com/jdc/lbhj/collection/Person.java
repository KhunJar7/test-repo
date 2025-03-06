package com.jdc.lbhj.collection;

public record Person (
		String name,
		int age) implements Comparable<Person> {

	@Override
	public int compareTo(Person p) {
		// return p.name.compareTo(name);//Z to A
		//return name.compareTo(p.name);// A to Z
		//return p.age > age ? 1 : -1;// big to small
		return age > p.age ? 1 : -1;// small to big
	}
	
}
