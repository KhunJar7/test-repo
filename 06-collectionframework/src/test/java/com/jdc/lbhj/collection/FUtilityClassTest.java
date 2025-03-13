package com.jdc.lbhj.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FUtilityClassTest {
	
	String[] array = {"ee", "jj", "bb", "TT", "ss"};
	
	@Test
	void arrayComparTest() {
		String[] other = {"ee", "jj", "bb", "TT", "ss"};
		
		Arrays.sort(array);
		Arrays.sort(other);
		showArray(array);
		showArray(other);
		int res = Arrays.compare(array, other);
		System.out.println("Result : " + res);
	}
	
	@Test
	@Disabled
	void arrayCopyTest() {
		String[] arr = Arrays.copyOf(array, array.length + 1);
		arr[array.length] = "yy";
		showArray(arr);
	}
	
	@Test
	@Disabled
	void immutableDataTest() {
		List<String> list = List.of("ss", "aa", "bb");//of => unmodified list (immutable)
		List<String> list1 = new ArrayList<String>(list);
		list1.add("bb");
		//list.add("bb"); //can't add
	}
	
	@Test
	@Disabled
	// before using search, must be sorted first
	// if there are duplicated elements, no guarantee which one will be out
	void arraySearchTest() {
		Arrays.sort(array);
		int result = Arrays.binarySearch(array, "ss");
		System.out.println("Result index : " + result);		
	}
	
	@Test
	@Disabled
	void arraySort() {
		
		Arrays.sort(array);
		showArray(array);// small to big
		Arrays.sort(array, Comparator.reverseOrder());// big to small
		showArray(array);
		Arrays.sort(array, 0, 3);// O to 2 ကိုပဲ order စီ 
		showArray(array);
	}
	
	private void showArray(String[] array) {		
		for(String s : array) {
			System.out.println(s);
		}
		System.out.println();
	}
}
