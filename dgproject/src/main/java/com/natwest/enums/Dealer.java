package com.natwest.enums;

import java.util.Random;

public class Dealer {
	
	
	private Cards card;
	Random random = new Random ();
	
	public Dealer(Cards card) {
		
		
		this.card = card;
			
	
	}
	
		
	public Cards getCard() {
		return card;
	}

	
	public Cards deal() {
		System.out.println(Rankse.values().length);
		System.out.println(Suite.values().length);
		return new Cards(Rankse.values()[random.nextInt(Rankse.values().length)],Suite.values()[random.nextInt(Suite.values().length)]);
	}
	

			
	
	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

}
