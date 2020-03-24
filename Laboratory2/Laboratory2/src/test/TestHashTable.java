package test;

import static org.junit.Assert.assertNull;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.HashIsEmptyException;
import exceptions.NonExistentKeyException;
import model.HashTable;

class TestHashTable {

private HashTable<String, String> HashTable;

	private void setUpStageOne() {
		
		HashTable = new HashTable<String, String>(); 
	}
	
	private void setUpStageTwo() {
		for (int i = 0; i < 10; i++) {
			HashTable.put(i+"", "#"+i);
		}		
	}
	
	
	private void setUpStageThree() {

		HashTable.put(0+"", "teachers");
		HashTable.put(0+"", "let");
		HashTable.put(0+"", "the");
		HashTable.put(9+"", "kids");
		HashTable.put(5+"", "alone");
	}
	
	
	@Test
	void testOne() {
		setUpStageOne();
		setUpStageTwo();
		assertTrue(HashTable.getSize() == 10);
		for (int i = 0; i < HashTable.getSize(); i++) {
			assertTrue(HashTable.get(i+"").equals("#"+i) );
		}
	}
	
	@Test
	void testTwo() {
		setUpStageOne();
		setUpStageTwo();
		
		try {
			for (int i = 0; i < 10; i++) {
				HashTable.remove(i+"");	
				
			}
			
			assertTrue(HashTable.getSize() == 0);
			
		} catch (HashIsEmptyException | NonExistentKeyException e) {
			
			fail("Error en la prueba"); 
		}

	}
	
	@Test
	void testThree() {
		setUpStageOne();
		assertTrue(HashTable.getSize() == 0);
		
	}
	
	
	@Test
	void testFive() {
		setUpStageOne();
		setUpStageThree();
		try {

			HashTable.remove(0+"");
			
			assertNull(HashTable.getObjet(0+"", "teachers").getNext().getNext()); 
			
			HashTable.remove(""+0);
			
			assertNull(HashTable.getObjet(0+"", "teachers").getNext());
			
		}catch (HashIsEmptyException | NonExistentKeyException e) {
			fail("the test has been fail....");
		}	
		
	}
	
	@Test
	void testSix() {
		setUpStageOne();
		setUpStageThree();
		try {
			HashTable.remove(5+"");
			
		} catch (HashIsEmptyException | NonExistentKeyException e) {
			
			assertTrue(e instanceof NonExistentKeyException);	
		}
		
	}
	
	@Test
	void testSeven() {
		setUpStageOne(); 
		
		try {
			HashTable.remove(0+"");
		} catch (HashIsEmptyException | NonExistentKeyException e) {
			
			assertTrue(e instanceof HashIsEmptyException );
		}

	}

}
