package model;

import java.io.BufferedReader;
import java.io.FileReader;

public class Prime {

	public static final String FILE_DIRECTION = "AEDLaboratory\\Laboratory1\\src\\data";
	
	/**
	 * The max number in Numbers
	 */
	private int maxNumber;
	
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

//	/**
//	 * Verify the primes in Numbers using a text archive with them there
//	 * pre: nPrimes != null
//	 */
//	public void verifyPrimePersistance() {
//		
//		String[] nPrimes = readText();
//		int temp;
//		int posX;
//		int posY;
//		for(int i=0; i<nPrimes.length; i++) {
//			
//			temp = Integer.parseInt(nPrimes[i]);
//			posX = (int) Math.ceil((double)temp/(double)nPrimes.length );
//			posY = (temp%nPrimes.length);
//			
//			numbers[posX][posY].setPrime(true);
//		}
//		
//	}
	
	/**
	 * This method gets the primes of the text file 
	 * @return
	 */
	private void readText() {
		
		String temp = "";
		String bfRead;
		try {
			BufferedReader bf = new BufferedReader(new FileReader(FILE_DIRECTION));
			while((bfRead = bf.readLine()) != ""+maxNumber ) {
				
				temp = temp +" "+ bfRead;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String[] nPrimes = temp.split(" ");
		// Cambiarle el nombre por el metodo y hacer otras maricadas asi
//		return nPrimes;
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
	
		maxNumber = userN;
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
	
	/**
	 * Verify the primes in Numbers using a int array with them there
	 * @param: nPrimes: A int array with only prime numbers
	 * pre: nPrimes != null
	 */
	public void findPrimes(int[] nPrimes) {
		
//		int temp;
		int posX;
		int posY;
		for(int i=0; i<nPrimes.length; i++) {
			
//			temp = nPrimes[i];
			posX = (int) Math.ceil((double)nPrimes[i]/(double)nPrimes.length );
			posY = (nPrimes[i]%nPrimes.length);
			
			numbers[posX][posY].setPrime(true);
		}
	}
}
