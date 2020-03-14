package model;

import java.util.Comparator;

public class Bets {

	private int amountBet;
	private String horse;
	private boolean horseWinner;
	private String key;
	
	public Bets(String key, int amountBet, String horse, boolean horseWinner) {
		this.key =key;
		this.amountBet = amountBet;
		this.horse= horse;
		this.horseWinner = horseWinner;
	}



	
}
