package com.jdc.lbhj.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.lbhj.trycatchWithThrow.TryCatchWithThrowData;

public class DTryCatchWithThrowTest {
	
	static private TryCatchWithThrowData data;
	
	@BeforeAll
	static void init() {
		data = new TryCatchWithThrowData();
	}
	
	@Test
	void testGetMessage() {
		data.useMessage();
	}
}
