package model;

public class Numbers {

	private boolean isPrime;
	private int number;
	
	public Numbers(int number) {
		this.number = number;
		isPrime = false;
	}

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
