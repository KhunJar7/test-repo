package com.jdc.lbhj;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DDefaultFuntionalInterfaceDemo {

	public static void main(String[] args) {
		
		//useConsumer();
		//useFunction();
		usePredicate("Hello", "H", "o");
		
	}
	
	static void useConsumer() {
		
		Consumer<String> first = message -> System.out.println(message);
		Consumer<String> second = message -> System.out.println(message.toUpperCase());
		
		Consumer<String> compose = first.andThen(second);
		compose.accept("Hello");
	}
	
	static void useFunction() {
		
		Function<Integer, Integer> f1 = a -> a * 2;// 3*2 = 6, compose second => 1*2 = 2
		Function<Integer, Integer> f2 = a -> a - 2;// 6-2 = 4, compose first => 3-2 = 1
		
		Function<Integer, Integer> fAndThen = f1.andThen(f2);
		int res = fAndThen.apply(3); // 4
		System.out.println("Result for function andThen : " + res);
		
		Function<Integer, Integer> fCompose = f1.compose(f2); //f2 first, f1 second
		int res1 = fCompose.apply(3); // 2
		System.out.println("Result for function composing : " + res1);
	}
	
	static void usePredicate(String message, String prefix, String suffix) {
		
		Predicate<String> p1 = str -> str.endsWith(suffix);		
		Predicate<String> p2 = str -> str.startsWith(prefix);
		
		Predicate<String> p3 = str -> p1.or(p2).test(str);

		System.out.println(p3.test(message));
	}
}
