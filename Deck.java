package WarCardGame;

import java.util.ArrayList;
import java.util.Collections;

import WarCardGame.Card.Suits;
import WarCardGame.Card.Values;

public class Deck {

	//*** Field ***
	private ArrayList<Card> cardDeck;
	
	
	//*** Constructor ***
	public Deck() {
		cardDeck = new ArrayList<Card>();
		for(Suits suit : Suits.values()) {
			for(Values value : Values.values()) {
				cardDeck.add(new Card(suit, value));
			}
		}
	}
	//Using this method to test out if the names of the cards print out, not used in actually applicationsn
	public void testDescribe() {
		int c = 0;
		for(Card card : cardDeck) {
			c++;
			card.describe();
		}
	}
	
	//*** Methods ***
	public void shuffle() {
		Collections.shuffle(cardDeck);
	}
	
	public Card draw() {
		Card drawCard = cardDeck.get(0);
		cardDeck.remove(0);
		return drawCard;
		
	}
	
}
