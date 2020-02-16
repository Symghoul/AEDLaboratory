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

	
	/**
	 * This method gets the primes of the text file
	 */
	public void verifyPrimePersistance() {
		
		String bfRead;
		int[] intPrimes = new int[maxNumber];
		int i=0;
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader(FILE_DIRECTION));
			String temp = bf.readLine();
			String[] primes = temp.split(" ");
			while(primes[i] != ""+maxNumber ) {
				
				intPrimes[i]=Integer.parseInt(primes[i]);
				i=i+1;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		findPrimes(intPrimes);
	}
	
	/**
	 * Verify the primes in Numbers using the eratostenes algorithm
	 */
	public void verifyPrimeEratostenes(int n) {
		
		 boolean prime[] = new boolean[n+1];
	        
	        for(int i=0;i<n;i++)
	        	prime[i] = true;
	        
	        for(int p = 2; p*p <=n; p++) {
	            if(prime[p] == true){
	                for(int i = p*2; i <= n; i += p)
	                	for(int j = p*2; j <= n-1; j += p)
	                    prime[i] = false;
	            }
	        }    	
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
		
		int posX;
		int posY;
		for(int i=0; i<nPrimes.length; i++) {
			
			posX = (int) Math.ceil((double)nPrimes[i]/(double)nPrimes.length );
			posY = (nPrimes[i]%nPrimes.length);
			
			numbers[posX][posY].setPrime(true);
		}
	}
}
