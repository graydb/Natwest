package com.natwest.enums;

public class Cards {

	
	
	    private final Rankse rank;
	    private final Suite suit;
	    public Cards(Rankse rank, Suite suit) {
	        this.rank = rank;
	        this.suit = suit;
	    }
	    public Suite getSuit() {
	        return suit;
	    }
	    public Rankse getRank() {
	        return rank;
	    }
	    public String toString() {
	        return rank + " of " + suit;
	    }
	

}

	
	
	

