package com.jdc.lbhj.dateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TemporalAmountTest {
	
	@Test
	void useBetweenWithPeriodAndDuration() {
		var p = Period.between(LocalDate.now(), LocalDate.of(2025, 04, 13));
		System.out.println(p.getMonths() + "\t" + p.getDays());
		
		var d = Duration.between(LocalTime.of(9, 30), LocalTime.now());
		//System.out.println(d.get(ChronoUnit.SECONDS)/60); // MINUTE နဲ့မရ
		//or
		System.out.println(Math.divideExact(d.getSeconds(), 60));
		//or
		System.out.println(d.toMinutes());
	}
	
	@Test
	@Disabled
	// Duration is connected with time
	void durationTest() {
		var d1  = Duration.ofDays(10);// x လိုက်ပြီး seconds ပြောင်းသွား
		System.out.println(d1);
		
		var lt = d1.addTo(LocalTime.now()); // time ပါမှရ localdatetime , localdate မှာ time မပါ
		System.out.println(lt);
	}
	
	@Test
	@Disabled
	// Period is connected with date
	void periodTest() {
		var p1 = Period.ofMonths(10);
		System.out.println(p1);
		var ld = p1.addTo(LocalDate.now()); // date လက်ခံ,
		System.out.println(ld);
	}
	
}
