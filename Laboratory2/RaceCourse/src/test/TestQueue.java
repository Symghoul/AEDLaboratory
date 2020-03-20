package test;


import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import model.Queue;

class TestQueue {

	private Queue<Integer> queue; 
	
	private void stageOne() {
		queue = new Queue<Integer>(); 
	} 
	
	private void stageTwo() {
		
		queue.enQueue(19);
		queue.enQueue(37);
		queue.enQueue(24);
		queue.enQueue(51);
		queue.enQueue(75);
	}
	
	@Test
	void testOne() {
		stageOne(); 
		
		assertTrue(queue.getSize() == 0);
		assertTrue(queue.isEmpty());
				
	}
	
	@Test
	void testTwo() {
		
		stageOne(); 
		stageTwo();
		
		assertFalse(queue.isEmpty()); 
		
		assertTrue( queue.getFront().getValue() == 19 );
		queue.deQueue();
		assertTrue( queue.getFront().getValue() == 37 );
		queue.deQueue();
		assertTrue( queue.getFront().getValue() == 24 );
		queue.deQueue();
		assertTrue( queue.getFront().getValue() == 51 );
		queue.deQueue();
		assertTrue( queue.getFront().getValue() == 75 );
		queue.deQueue();
		
		assertTrue(queue.isEmpty());	
		assertTrue(queue.getSize() == 0);		
	}
	
}