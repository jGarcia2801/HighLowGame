package HighLowGame;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards;
	private static String [] SUITS = {"H", "S", "D", "C"};
	private static String [] RANKS = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
	private static int [] VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	
	public Deck() {
		cards = new ArrayList<Card>();
		
		for(int i = 0 ; i < SUITS.length ; i++)
			for(int j = 0 ; j < RANKS.length ; j++) {
				this.cards.add(new Card(SUITS[i], RANKS[j], VALUES[j]));
			}
	}
	public Deck(Deck other) {
		cards = new ArrayList<Card>();
		for(Card c : other.getCards()) {
			cards.add(c);
		}
	}
	
	public ArrayList<Card> getCards(){
		ArrayList<Card> cardsCopy = new ArrayList<Card>();
		for(int i = 0 ; i < this.cards.size() ; i++)
			cardsCopy.add(new Card (this.cards.get(i)));
	
		return cardsCopy;
	}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
}
