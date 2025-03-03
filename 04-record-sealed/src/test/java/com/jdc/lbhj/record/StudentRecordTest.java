package com.jdc.lbhj.record;

import org.junit.jupiter.api.Test;

public class StudentRecordTest {

	@Test
	void test() {
		StudentRecord rec = new StudentRecord(1, "John", 20);
		System.out.println(rec.id());
		System.out.println(rec.name());
		System.out.println(rec.age());
	}
}
