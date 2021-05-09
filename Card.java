package HighLowGame;

public class Card implements Comparable<Card>{
	private String suit;
	private String rank;
	private int value;
	
	public Card (String suit, String rank, int value) {
		this.suit = new String(suit);
		this.rank = new String(rank);
		this.value = value;
	}
	
	public Card(Card otherCard) {
		this.suit = otherCard.getSuit();
		this.rank = otherCard.getRank();
		this.value = otherCard.getValue();
	}
	
	public Card () {
		this.suit = "";
		this.rank = "";
		this.value = 0;
	}
	
	public String getSuit() {
		return new String (this.suit);
	}
	public String getRank() {
		return new String (this.rank);
	}
	public int getValue() {
		return this.value;
	}
	
	@Override
	public String toString() {
		String result = getRank() + getSuit();
		return result;
	}
	
	@Override
	public int compareTo(Card other) {
		//a card is greater than another card if the value of the card is greater than the value of the other card
		//returns 0 if cards are of equal value
		if (this.value > other.getValue()) {
			return 1;
		}
		if(this.value < other.getValue()) {
			return -1;
		}
		return 0;
	}
	
}
