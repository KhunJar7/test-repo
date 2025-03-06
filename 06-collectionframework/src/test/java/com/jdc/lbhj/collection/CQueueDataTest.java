package com.jdc.lbhj.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class CQueueDataTest extends JunitConfig{
	
	private static Queue<String> queue;
	
	@Test
	@Order(4)
	void  queryElementVsPeekTest() { // ပထမဆုံးဟာကိုပဲရှာ
		assertEquals("Andrew", queue.element());
		assertEquals("Andrew", queue.peek());
		
		queue.clear();// all element cleared
		
		assertThrows(NoSuchElementException.class, () -> queue.element());
		assertNull(queue.peek());		
	}
	
	@Test
	@Order(3)
	// FIFO
	void queueRemoveVsPollTest() {
		assertEquals("Andrew", queue.remove());
		assertEquals(3, queue.size());
		
		assertEquals("John", queue.poll());
		assertEquals(2, queue.size());
		
		queue.poll();
		queue.remove();
		assertEquals(0, queue.size());
		
		assertThrows(NoSuchElementException.class, () -> queue.remove());
		assertNull(queue.poll());
	}
	
	@BeforeEach
	void queueAddTest() {
		queue = data.useQueue("block", 4);
		queue.addAll(List.of("Andrew", "John"));
		queue.add("Willian");// array size ထက်ကျော်သွားရင် IllegalStateException တက်
		queue.offer("James");		
	}
	
//	void queueAddTest() {
//		queue = data.useQueue("priority", 4);
//		queue.addAll(List.of("Andrew", "John"));
//		queue.add("Willian");// array size ထက်ကျော်သွားရင် IllegalStateException တက်
//		queue.offer("James");		
//	}
	
	@Test
	@Order(2)
	void queueAddVsOfferTest() {	
		assertEquals(4, queue.size());		
		assertThrows(IllegalStateException.class, () -> queue.add("Jack"));
		
		queue.offer("Jack"); // array size ထက်ကျော်လို့ ထည့်လည်းမထည့် error လည်းမတက်
		assertEquals(4, queue.size());
		
	}
}
