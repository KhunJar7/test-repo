package com.jdc.lbhj.lambda;

import org.junit.jupiter.api.Test;

import com.jdc.lbhj.ALambdaDemo;

public class LambdaTest {

	@Test
	void beforeAndAfterTest() {
		ALambdaDemo demo = new ALambdaDemo();
		demo.beforeLambda("Hello Before Lambda !");
		demo.afterLambda("Hello After Lambda !");
	}
}
