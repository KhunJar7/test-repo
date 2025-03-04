package com.jdc.lbhj.test;

import org.junit.jupiter.api.Test;

import com.jdc.lbhj.handler.Handler;

public class HandlerTest {
	
	Handler handle = new Handler();
	
	//@Test
	void testName() {
		handle.useName();
	}
	
	//@Test
	void testAge() {
		handle.useAge();
	}
	
	@Test
	void testRecursive() {
		handle.recursive();
	}
	
}
