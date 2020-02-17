package testModel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.Prime;

class PrimeTest extends TestCase{
	
	private Prime prime;

	@BeforeEach
	void setUp1() {
		prime = new Prime();
	}

	@BeforeEach
	void setUp2() {
		prime.generateMatrix(14);
	}
	
	@BeforeEach
	void setUp3() {
		prime.verifyPrimeEratostenes(15);
	}
	
	@Test
	public void testGenerateMatrix(){
	
		setUp1();
		setUp2();
		assertTrue(prime.getNumbers().length==4);
		assertTrue(prime.getNumbers()[3][3].getNumber()==0);
	}

	@Test
	public void testVerifyPrimePersistence() {
		
		setUp1();
		setUp2();
		prime.verifyPrimePersistance();
		assertTrue(prime.getNumbers()[3][0].isPrime());
		assertFalse(prime.getNumbers()[2][3].isPrime());
		
	}
	
	@Test
	void testVerifyPrimeEratostenes() {
		
		setUp3();
		prime.generateMatrix(15);
		int[] isTestPrime = {2,3,5,7,11,13};
		
			assertEquals(isTestPrime[3], prime.getNumbers()[2][1]);
		
	}
}