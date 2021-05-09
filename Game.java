package HighLowGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	private Player players;
	private int score;
	private Deck dealer;
	
	public Game() {
		this.players = new Player();
		this.score = 0;
		this.dealer = new Deck();
	}
	
	public void start(String playerName) {
		dealer.shuffle();
		this.players.setName(playerName);
	}
	
	public void increaseScore() {
		this.score++;
	}
	
	public Deck getDealer() {
		Deck dealerCopy = new Deck(this.dealer);
		return dealerCopy;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public boolean guess(String guess, Card cardShown, Card nextCard) {
		boolean result = false;
		if(guess.equalsIgnoreCase("higher") && nextCard.compareTo(cardShown) >= 0) {
			result = true;
		}
		if(guess.equalsIgnoreCase("lower") && nextCard.compareTo(cardShown) <= 0) {
			result = true;
		}
		
		return result;
	}
	
	public static void main (String [] args) {
		boolean correct = true;
		Game highLow = new Game();
		String guess;
		int index = 0;
		
		System.out.println("Welcome to the HighLow Game");
		System.out.println("The goal of this game is to guess if the next card in the deck is higher or lower than the current card");
		System.out.println("To start the game enter your name:");
		Scanner input = new Scanner(System.in);
		String playerName = input.nextLine();
		
		highLow.start(playerName);
		
		Deck dealerCopy = highLow.getDealer();
		ArrayList<Card> dealerHand = dealerCopy.getCards();
		Card cardShown = dealerHand.get(0);
		
		for(Card c : dealerHand) {
			System.out.println(c);
		}
		for(int i = 0 ; i<dealerHand.size() - 1 ; i++) {
			
			System.out.println("-------------------------------------------------------");
			System.out.println("Score: " + highLow.getScore());
			System.out.println("The card shown is:");
			System.out.println(cardShown);
			System.out.println("Is the next card in the deck higher or lower than the card shown");
			guess = input.nextLine();
			correct = highLow.guess(guess, cardShown, dealerHand.get(index + 1));
			
			if(correct) {
			System.out.println("YOU ARE CORRECT!!");
			highLow.increaseScore();
			}
			else
				System.out.println("YOU ARE WRONG!!");

			
			index++;
			cardShown = dealerHand.get(index);

			
		
	}
		input.close();
		System.out.println("Game Over Score: " + highLow.getScore());
	}
}
