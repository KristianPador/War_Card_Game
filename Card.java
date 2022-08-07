package WarCardGame;

public class Card {

	// Enums used to set the names of the cards
	public enum Suits{
		HEARTS, DIAMONDS, CLUBS, SPADES
	}
	
	public enum Values{
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}
	
	//*** Fields ***
	private Suits suit;
	private Values value;
	private String cardName;
	
	//*** Constructor ***
	public Card(Suits suit, Values value) {
		this.suit = suit;
		this.value = value;
		cardName = value + " of " + suit;
	}
	
	//*** Methods ***
	public void describe() {
		System.out.println(cardName);
	}
	
	//*** Getters and Setters ***
	public Suits getSuit() {
		return suit;
	}
	public void setSuit(Suits suit) {
		this.suit = suit;
	}
	public Values getValue() {
		return value;
	}
	public void setValue(Values value) {
		this.value = value;
	}
}
