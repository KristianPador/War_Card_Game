package WarCardGame;

public class App {

	public static void main(String[] args) {
		
		Player player1 = new Player("Kristian");
		Player player2 = new Player("Kathria");
		
		Deck playerDeck = new Deck();
		playerDeck.shuffle();
		
		for(int i = 1; i <= 52; i++) {
			if(i % 2 == 0) {
				player1.draw(playerDeck);
			}else {
				player2.draw(playerDeck);
			}
		}
		System.out.println("------------");
		
		for(int i = 1; i <= 26; i++) {
			System.out.println("Round " + i + "\n------------");
			System.out.println(player1.getPlayerName() + " flipped over: ");
			Card player1card = player1.flip();
			player1card.describe();
			
			System.out.println(player2.getPlayerName() + " flipped over: ");
			Card player2card = player2.flip();
			player2card.describe();
			
			if(cardBattle(player1card,player2card) == 1) {
				player1.incrementScore();
			}else if(cardBattle(player1card,player2card) == 2) {
				player2.incrementScore();
			}else {
				System.out.println("DRAW");
			}
			System.out.println("------------");
		}
		System.out.println("The player scores are: ");
		System.out.println(player1.getPlayerName() + ": " + player1.getPlayerScore());
		System.out.println(player2.getPlayerName() + ": " + player2.getPlayerScore());
		
		if(player1.getPlayerScore() > player2.getPlayerScore()) {
			System.out.println(player1.getPlayerName() + " Wins!");
		}else if(player2.getPlayerScore() > player1.getPlayerScore()) {
			System.out.println(player2.getPlayerName() + " Wins!");
		}else {
			System.out.println("It's a Draw!");
		}
		
		
				
	}
	 
	//Method to return a value based on the enum
	public static int switchtoInt(Card card) {
		switch(card.getValue()) {
		case TWO: return 2;
		case THREE: return 3;
		case FOUR: return 4;
		case FIVE: return 5;
		case SIX: return 6;
		case SEVEN: return 7;
		case EIGHT: return 8;
		case NINE: return 9;
		case TEN: return 10;
		case JACK: return 11;
		case QUEEN: return 12;
		case KING: return 13;
		default: return 14;
		
		}
	}
	
	//Because the cards are set to enums, we have to make the cards into Integers to compare the values easier
	public static int cardBattle(Card player1card, Card player2card) {
		if(switchtoInt(player1card) > switchtoInt(player2card)) {
			return 1;
		}else if(switchtoInt(player1card) < switchtoInt(player2card)) {
			return 2;
		}else {
			return 3;
		}
	}

}
