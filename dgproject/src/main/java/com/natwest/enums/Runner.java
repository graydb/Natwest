package com.natwest.enums;

public class Runner {

	public static void main(String[] args) {
		
// get card = newCard (Rank,ACE , Suit.CLUBS);
		//Dealer d = new Dealer(card);
		//System.out.println(d.getCard());
		Cards card = new Cards(Rankse.KING, Suite.DIAMONDS);
		
	Dealer d = new Dealer(card);
	
		System.out.println(card);
		
		System.out.println(d.deal());
		System.out.println(d.getCard());
		

	}

}
