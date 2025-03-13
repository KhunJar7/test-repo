package com.jdc.lbhj.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DateTest {
	
	@SuppressWarnings("deprecation")
	@Disabled
	@Test
	void testCreateDate() {
		Date date = new Date(); // java.util
		System.out.println("Current date : " + date);
		
		Date date2 = new Date(2023, 11, 01); // deprecated => မသုံးစေချင်တော့တာ
		System.out.println(date2);// Month => 0 to 11, 2023 + 1970
		
//		Date date3 = new Date("11,00,2023");// IllegalArgumentException
//		System.out.println(date3);
	}
	
	@Test
	@Disabled
	void testCreateDateFromCalender() {		
		Calendar cl1 = Calendar.getInstance();// getInstance() => obj ကိုထုတ်ပေး
		Date d1 = cl1.getTime();// getTime() => date obj
		System.out.println(d1);// current time
	}
	
	@Test
	@Disabled
	void testCreateDateWithSetter() {
		Calendar cl2 = Calendar.getInstance();
		cl2.setLenient(false);// auto convert => false, default => true
		cl2.set(2022, Calendar.AUGUST, 22);
		cl2.set(Calendar.MONTH, 12);// 0 to 11 => month, if 11 < userinput => autoincreate month(year)
		cl2.set(Calendar.DATE, 30);// feb 28, 29/30 => march 1/2
		//cl2.set(5, 20);// same as cl2.set(Calendar.DATE, 20);, 5 => Month
		System.out.println(cl2.getTime());
	}
	
	@Test
	@Disabled
	void testCreateDateFromFormatter() throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy kk:mm:ss SSS");// SimpleDateFormat(pattern)
		Date date = df.parse("11-11-1999 24:23:20 546");
		System.out.println(date);
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL);
		String str = df2.format(date);
		System.out.println(str);
	}
	
	@Test
	void testAddRollAndMinusInCalender() {
		Calendar cl = Calendar.getInstance();
		
		//Plus
		//cl.add(Calendar.DATE, 25);// April ပြောင်း
		cl.roll(Calendar.DATE, 40);// day + but Month မပြောင်း (current month)
		System.out.println(cl.getTime());
		
		//Minus
		cl.add(Calendar.DATE, -20);// month ပြန်ဆုတ်သွား
		System.out.println(cl.getTime());
	}
}
