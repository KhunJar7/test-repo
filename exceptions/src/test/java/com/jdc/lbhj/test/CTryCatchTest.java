package com.jdc.lbhj.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jdc.lbhj.trycatch.TryCatchData;

public class CTryCatchTest {
	
	TryCatchData data = new TryCatchData();
	
	@Test
	void testTryWithFinally() {
		String res = data.useCheckedWithTryFinallyAndResource();
		System.out.println(res);
	}
	
	//@Test
	void testTryMultiCatch() {
		int res = data.useUncheckedWithTryMultiCatch(new int[2], "2");
		assertEquals(res, -1);
		int res2 = data.useUncheckedWithTryMultiCatch(new int[2], "hello");
		assertEquals(res2, -1);
	}
	
	//@Test
	void testTryCatch() {
		String res1 = data.useUncheckedWithTryCatch(127);
		System.out.println(res1);
		//assertEquals(res1, "ClassCastException");
	}
}	
