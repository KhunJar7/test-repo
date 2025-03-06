package com.jdc.lbhj.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@SuppressWarnings("unused")
public class BSetDataTest extends JunitConfig{

	static TreeData tree;

	@ParameterizedTest
	@CsvSource({"Andrew, Andrew", "James, not match name"})
	void useMethodInSetTest(String name, String res) {
		Set<String> set = data.useSet("H");
		
		String str = set.contains(name) ? name : "not match name";
		assertEquals(str, res);
	}

	@Disabled
	@Test
	void treeSetTest() {
		TreeSet<Person> set = tree.useTreeset();// Treeset value must be comparable type
		for (Person p : set) {
			System.out.println(p.name() + " " + p.age());
		}
	}

	// @Test
	void linkHashSetTest() {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Andrew");
		set.add("Willion");
		set.add("John");
		set.add("Henery");
		set.add("Andrew");

		for (String s : set) {
			System.out.println(s);
		}
	}

	// @ParameterizedTest
	@CsvSource({ "0, Andrew", "3, Henery" })
	void selectListTest(int index, String res) {

	}

	@Disabled
	@ParameterizedTest
	@ValueSource(strings = { "h", "L", "t" }) // junit မှာ api and engin ကိုဖျက် jupiter အထိပဲ
	void useListTest(String str) {
		System.out.println("Use Set Type : " + str);
		for (String s : data.useSet(str.toUpperCase())) {
			System.out.println("Element : " + s);
		}
		System.out.println();
	}
}
