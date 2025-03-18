package com.jdc.lbhj.dateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TemporalAccessorTest {
	
	@Test
	void adjustDateTimeTest() {
		//all ရှိပြီးသားအချိန်ကိုပြောင်းတာမဟုတ်ပဲ obj အသစ်ဆောက်လိုက်တာ because date, time is immutable 
		
		var ldt = LocalDateTime.now();
		
		// using Period which is a grandchild of TemporalAmount
		var p = Period.ofDays(10);
		@SuppressWarnings("unused")
		var p1 = Period.from(Period.ofDays(10));
		
		ldt.plus(Period.ofDays(10));
		System.out.println(ldt);// not plus
		var ldt1 = ldt.plus(p);
		System.out.println(ldt1);// value change +10
		
		// using fluent method
		var ldt2 = ldt.minusDays(10);
		System.out.println(ldt2);
		
		// using localTime which is a grnadchild of Temporaladjustor
		var idt3 = ldt.with(LocalTime.of(4, 30)); // အစားထိုး 
		System.out.println(idt3);
		//or
		// using fluent method
		var idt4 = ldt.withHour(4).withMinute(30);
		System.out.println(idt4);
	}
	
	@Test
	@Disabled
	void setTimeTest() {
		// LocalDateTime is a grandchild of temporalAccessor
		var ldt = LocalDateTime.from(LocalDateTime.now());
		System.out.println(ldt);
		
		var ldt1 = LocalDateTime.of(2022, 10, 20, 10, 20);
		System.out.println(ldt1);
	}
	
	@Test
	@Disabled
	void getTimeWithTemporalFieldOrFluentMethod() {
		
		// using ChronoField which is a child of TemporalField
		LocalDateTime ldt = LocalDateTime.now();
//		int dom = ldt.get(ChronoField.DAY_OF_MONTH);// TemporalField parent နဲ့လက်ခံလို့ chile => ChronoField ထည့်ပေးလို့ရ
//		int dow = ldt.get(ChronoField.DAY_OF_WEEK);
//		int doy = ldt.get(ChronoField.DAY_OF_YEAR);
		
		int dom = ldt.get(ChronoField.MONTH_OF_YEAR);// TemporalField parent နဲ့လက်ခံလို့ chile => ChronoField ထည့်ပေးလို့ရ
		int dow = ldt.get(ChronoField.DAY_OF_MONTH);
		int doy = ldt.get(ChronoField.YEAR);
		
		System.out.println(dow + " " + dom + " " + doy);
		
		//or
		// using fluent method
		int day = ldt.getDayOfMonth();
		int month = ldt.getMonthValue();
		int year = ldt.getYear();
		System.out.println(day + " " + month + " " + year);
	}
}
