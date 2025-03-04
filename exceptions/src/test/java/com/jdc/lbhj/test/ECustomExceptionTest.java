package com.jdc.lbhj.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.lbhj.custom.CustomExceptionData;
import com.jdc.lbhj.custom.MyCheckException;
import com.jdc.lbhj.custom.MyUncheckException;

public class ECustomExceptionTest {
	
	static CustomExceptionData data;
	
	@BeforeAll
	static void init() {
		data = new CustomExceptionData();
	}
	
	@Test
	void testException() {
		assertThrows(MyUncheckException.class, () -> data.getMyUncheckException(""));
		assertThrows(MyUncheckException.class, () -> data.changeCheckToUncheck(" "));
		assertThrows(MyCheckException.class, () -> data.getMyCheckException(null));
	}
}
