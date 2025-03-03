package com.jdc.lbhj.test;

import org.junit.jupiter.api.Test;

import com.jdc.lbhj.handler.Handler;

public class HandlerTest {
	
	@Test
	void testName() {
		Handler handle = new Handler();
		handle.useName();
	}
}
