package com.jdc.lbhj.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@SuppressWarnings("unused")
public class AListDataTest extends JunitConfig {
	
	private int count;
	
	List<String> list = data.useList("A");

	
	private int createRecursive(String name) {
		if(count < 5) {
			if (name == list.get(count)) {
				return count;
			}
			createRecursive(name);
			count ++;
		}		
		return 0;
	}
	
	void useMethodInListTest() {
		List<String> list = data.useList("A");
		assertTrue(list.containsAll(List.of("Andrew", "James")));
		list.add("James"); // add james
		assertEquals(list.size(), 6); //arrat's size
		list.remove("James"); // remove James
		assertFalse(list.contains("James"));// assertFalse => james မရှိရင် true
	}
	
	//@ParameterizedTest
	@CsvSource({"0, Andrew", "3, Henery"})
	void selectListTest(int index, String res) {
		List<String> list = data.useList("L");
		assertEquals(res, list.get(index));
	}

	//@Disabled
	//@ParameterizedTest
	@ValueSource(strings = {"A", "L"}) // junit မှာ api and engin ကိုဖျက် jupiter အထိပဲ
	void useListTest(String str) {
		System.out.println(str);
		for(String s : data.useList(str)) {
			System.out.println("Element : " + s);
		}
		System.out.println();
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"a", "l"}) // junit မှာ api and engin ကိုဖျက် jupiter အထိပဲ
	void showListTest(String str) {
		System.out.println(str);
		for(String s : data.useList(str.toUpperCase())) {
			System.out.println("Element : " + s);
		}
		System.out.println();
	}
}
