package com.jdc.lbhj.collection;

public record Person(String name, int age, Human human) implements Comparable<Person> {

	@Override
	public int compareTo(Person p) {
		// return p.name.compareTo(name);//Z to A
		// return name.compareTo(p.name);// A to Z
		// return p.age > age ? 1 : -1;// big to small
		//return age > p.age ? 1 : -1;// small to big
		return human.age() > p.human.age() ? 1 : -1;
	}
}

record Human(String name, int age) {

}
