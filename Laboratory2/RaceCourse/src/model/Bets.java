package model;

import java.util.Comparator;

public class Bets<String, Bets> extends NodeHashTable {

	private int amountBet;
	private String horse;
	private boolean horseWinner;
	
	public Bets(int amountBet, String horse, boolean horseWinner) {
		super(key, value);
		this.amountBet = amountBet;
		this.horse= horse;
		this.horseWinner = horseWinner;
	}



	
}
