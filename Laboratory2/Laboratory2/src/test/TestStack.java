package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Stack;

class TestStack {

private Stack<Integer> stack; 
	
	private void setUpStageOne() {
		stack = new Stack<Integer>();
	}
	
	private void setUpStageTwo() {
		
		stack.push(73);
		stack.push(37);
		stack.push(65);
		stack.push(21);
		stack.push(98);
	}
	
	@Test
	public void testOne() {
		setUpStageOne(); 
		
		assertTrue(stack.isEmpty());
		assertTrue(stack.getSize() == 0);
		
		stack.push(73);
		stack.push(37);
		stack.push(65);
		stack.push(21);
		stack.push(98);
		
		assertTrue(stack.getSize() == 5);
		assertFalse(stack.isEmpty());
		
		assertTrue( stack.topElement().getValue() == 98);
		stack.pop();

		assertTrue( stack.topElement().getValue() == 21);
		stack.pop();
		
		assertTrue( stack.topElement().getValue() == 65);
		stack.pop();
		
		assertTrue( stack.topElement().getValue() == 37);
		stack.pop();
		

		assertTrue( stack.topElement().getValue() == 73);
		stack.pop();
		
		assertTrue(stack.isEmpty());
		assertTrue(stack.getSize() == 0);
		
		 
	}
	
	@Test
	public void testTwo() {
		
		setUpStageOne();
		setUpStageTwo();
		
		assertTrue(stack.getSize() == 5);
		assertFalse(stack.isEmpty());
		
		assertTrue( stack.topElement().getValue() == 98);
		stack.pop();

		assertTrue( stack.topElement().getValue() == 21);
		stack.pop();
		
		assertTrue( stack.topElement().getValue() == 65);
		stack.pop();
		
		assertTrue( stack.topElement().getValue() == 37);
		stack.pop();
		

		assertTrue( stack.topElement().getValue() == 73);
		stack.pop();
		
		assertTrue(stack.isEmpty());
		assertTrue(stack.getSize() == 0);
	}


}
