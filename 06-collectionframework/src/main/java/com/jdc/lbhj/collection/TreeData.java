package com.jdc.lbhj.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeData {
	
	private Person[] array = {
			new Person("Andrew", 25, new Human("tt", 1)), 
			new Person("John", 24, new Human("tt", 1)),
			new Person("Alex", 23, new Human("tt", 1)),
			new Person("Phonix", 20, new Human("tt", 1)),
			new Person("Kelvin", 24, new Human("tt", 1))
			};
	
	public TreeSet<Person> useTreeset(){
		TreeSet<Person> set = new TreeSet<Person>();
		set.addAll(Set.of(array));
		return set;
	}
}
