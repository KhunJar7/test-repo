package com.jdc.lbhj.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class GCollectionUtilityClassTest {
	
	List<Integer> list = new ArrayList<Integer>();
	
	@Test
	void shuffleTest() {
		addData();
		//Collections.shuffle(list, Random.from(RandomGenerator.getDefault()));
		Collections.shuffle(list);// Random
		System.out.println(list);
	}
	
	@Test
	@Disabled
	void searchTest() {
		addData();
		Collections.sort(list);
		int res = Collections.binarySearch(list, 5);
		System.out.println(res);
	}
	
	@Test
	@Disabled
	void sortTest() {
		addData();
		Collections.sort(list, Comparator.reverseOrder());// big to small
		System.out.println(list);
	}
	
	void addData() {
		list.addAll(List.of(4, 2, 5, 6, 1, 3));
	}
}
