package com.jdc.lbhj.dateTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DateTimeApiTest {
	
	@Test
	@Disabled
	//must have time and zone or offset
	void testDateHumanToInstant() {
		LocalDateTime date = LocalDateTime.now(); // private constructor ကြောင့် obj ဆောက်မရ
		System.out.println(date);
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		OffsetDateTime offdt = OffsetDateTime.now();
		System.out.println(offdt);
		System.out.println();
		
		//must be the pattern of +0
		Instant i1 = date.toInstant(ZoneOffset.of("+06:30")); // localdate မရ, LocalDateTime ကနေပဲရ
		System.out.println(i1);
		
		Instant i2 = zdt.toInstant();
		System.out.println(i2);
		
		Instant i3 = offdt.toInstant();
		System.out.println(i3);
		
		//Eg for LocalDate final class
		//Human h = new Human();// private constructor ကြောင့် obj ဆောက်မရ, final ကြောင့် inherite လုပ်မရ
		//Human h = Human.getInstance();
	}
	
	@Test
	void testInstantToHuman() {
		Instant i1 = Instant.now();
		ZonedDateTime zdt = i1.atZone(ZoneId.of("Asia/Rangoon"));
		System.out.println(zdt);
		OffsetDateTime odt = i1.atOffset(ZoneOffset.ofHours(5));
		System.out.println(odt);
	}
}

//final class Human{
//	private static Human instance;
//	private Human() {}
//	
//	public static Human getInstance() {
//		// obj test လုပ်နေတုန်း lock
//		synchronized (instance){
//			if(null == instance) {
//				instance = new Human();
//			}
//		}
//		return instance;
//	}
//}
