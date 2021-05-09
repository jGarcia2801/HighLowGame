package HighLowGame;

import java.util.ArrayList;

public class Player {
	private String name;
	private ArrayList<Card> playerHand;
	
	public Player() {
		this.name = "";
		playerHand = new ArrayList<Card>();
	}
	public Player(String name) {
		this.name = new String(name);
		playerHand = new ArrayList<Card>();
	}
	
	public ArrayList<Card> getPlayerHand(){
		ArrayList<Card> cardsCopy = new ArrayList<Card>();
		for(int i = 0 ; i < this.playerHand.size() ; i++)
			cardsCopy.add(new Card (this.playerHand.get(i)));
	
		return cardsCopy;
	}
	
	public void addCard(Card c) {
		Card copy = new Card(c);
		this.playerHand.add(copy);
	}
	
	public String getName() {
		return new String(this.name);
	}
	public void setName(String name) {
		this.name = new String(name);
	}
}
