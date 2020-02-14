package model;

public class Prime {

	/**
	 * A matrix with Numbers from 1 to the number passed for parameter
	 */
	private Numbers[][] numbers;
	
	/**
	 * Constructor
	 */
	public Prime() {
		
	}
	
	public Numbers[][] getNumbers() {
		return numbers;
	}

	public void setNumbers(Numbers[][] numbers) {
		this.numbers = numbers;
	}

	/**
	 * Verify the primes in Numbers using a text archive with them there
	 */
	public void verifyPrimePersistance() {
		
	}
	
	/**
	 * Verify the primes in Numbers using the eratostenes algorithm
	 */
	public void verifyPrimeEratostenes() {
		
	}
	
	/**
	 * Verify the primes in Numbers using the Euler factorization
	 */
	public void verifyPrimeEulerFatorization() {
		
	}
	
	/**
	 * Using a int (by parameter) returns an ints array with the actual measurements of Numbers
	 * @param userN: A max number in the matrix Numbers.
	 * @return dimensions: An array with the actual measurements of Numbers
	 */
	public int[] calibrateMatrix(int userN) {
	
		int[] dimensions;
		double x = Math.ceil((double)(userN));
		dimensions = new int[]{userN, userN};
		return dimensions;
	}
	
	/**
	 * this method inicializes Numbers with its actual measurements
	 * @param userN:  A max number in the matrix Numbers.
	 */
	public void generateMatrix(int userN) {
		
		int[] dimensions = calibrateMatrix(userN);
		numbers = new Numbers[dimensions[0]][dimensions[0]];
		int discriminator = 0;
		for(int i=0; i<numbers.length&&discriminator<userN;i++) {
			
			for(int j=0; j<numbers[i].length;j++) {
				
				numbers[i][j] = new Numbers(discriminator);
				discriminator= discriminator+1;
			}
		}
	}
	
	public void findPrimes() {
		
	}
}
