package WarCardGame;

import java.util.ArrayList;

public class Player extends Deck{

	//*** Fields ***
	private ArrayList<Card> playerHand;
	private int playerScore;
	private String playerName;
	
	//*** Constructor ***
	public Player(String name) {
		this.playerName = name;
		playerScore = 0;
		playerHand = new ArrayList<Card>();
		}
	
	//*** Methods ***
	public void playerDescribe() {
		System.out.println("Player Name: " + playerName);
		System.out.println("Score: " + playerScore);
		System.out.println("Player hand:");
		for(Card card: playerHand) {
			card.describe();
		}
		
	}
	
	public void draw(Deck deck) {
		playerHand.add(deck.draw());
	}
	
	public Card flip(){
		Card cardFlips = playerHand.get(0);
		playerHand.remove(0);
		return cardFlips;
	}
	
	public void incrementScore() {
		playerScore++;
	}

	
	//*** Getters and Setters **
	public ArrayList<Card> getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(ArrayList<Card> playerHand) {
		this.playerHand = playerHand;
	}

	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
}
