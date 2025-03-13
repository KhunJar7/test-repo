package com.jdc.lbhj.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;


@SuppressWarnings("unused")
public class CollectionData {

	static String[] array = { "Andrew", "John", "Willian", "Henery", "Kelvin" };
	
	public Collection<String> getCollection(){
		
		Collection<String> array = new ArrayList<String>();// can't get ArrayList's method
		
		List<String> col2 = new ArrayList<String>();// can get Arraylist's method cause Arraylist overide the method of list
		String name = col2.get(3);
		
		Set<String> col3 = new HashSet<String>();
		
		return null;
	}
	public List<String> useList(String str) {
		return switch (str) {
		case "A" -> {
			ArrayList<String> list = new ArrayList<>();
			list.addAll(List.of(array));// List.of() => array ကို collection type ပြောင်း List Obj
			yield list;// return ပြန်တာ တကြောင်းထက်ပိုတာဆို ဒါကိုသုံး
		}
		case "L" -> {
			LinkedList<String> list = new LinkedList<>();
			list.addAll(List.of(array));
			yield list;
		}
		default -> null;
		};
	}

	public Set<String> useSet(String s) {
		return switch (s) {
		case "H" -> {
			HashSet<String> set = new HashSet<>();
			set.addAll(Set.of(array));
			yield set;
		}
		case "L" -> {
			LinkedHashSet<String> set = new LinkedHashSet<>();
			set.addAll(Set.of(array));
			yield set;
		}
		case "T" -> {
			TreeSet<String> set = new TreeSet<>();
			set.addAll(Set.of(array));
			yield set;
		}
		default -> null;
		};
	}

	public Queue<String> useQueue(String s, int capacity) {
		return switch(s) {
		case "block" -> new ArrayBlockingQueue<>(capacity);
		case "priority" -> new PriorityQueue<>();
		default -> null;
		};
	}

	public ArrayDeque<String> useDeque() {
		return new ArrayDeque<String>();
	}

	public Map<Integer, String> useMap(String s) {// <key, value>
		return switch(s) {
		case "hash" -> new HashMap<>();
		case "link" -> new LinkedHashMap<>();
		case "tree" -> new TreeMap<>();
		default -> null;
		};
	}
}
