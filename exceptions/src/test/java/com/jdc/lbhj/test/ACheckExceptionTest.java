package com.jdc.lbhj.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jdc.lbhj.check.CheckExceptionData;

public class ACheckExceptionTest {

	CheckExceptionData data = new CheckExceptionData();

	@Test
	void fileTest() {
		String res = data.createFile("");// file name နဲ့ရှာ
		assertEquals(res, "exist");// res ရဲ့အဖြေက IOException ဆိုတာဖြစ်ကိုဖြစ်ရမယ်ဆိုပြီးစစ်

		res = data.createFile("D:/data/");// directory နဲ့ရှာ
		assertEquals(res, "IOException");
	}
}
