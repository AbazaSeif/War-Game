package ms.feb2017.cardgame;

import java.util.*;

public class WarGame {

	Deck deck;
	Player p1;
	Player p2;
	List<Card> deckOfCards;
	List<Card> player1Cards;
	List<Card> player2Cards;
	List<Card> player1Temp;
	List<Card> player2Temp;
	
	
	public WarGame(String player1, String player2){
		deck = new Deck();
		deckOfCards = deck.getCards();
		Collections.shuffle(deckOfCards);
		assigncards(deckOfCards);
		p1 = new Player(player1);
		p2 = new Player(player2);
	}
	
	private void assigncards(List<Card> deckCards){
		boolean flag = true;
		for(Card c : deckCards){
			if(flag){
				player1Cards.add(c);
				flag = false;
			}else{
				player2Cards.add(c);
				flag = true;
			}
		}
		
		p1.setCards(player1Cards);
		p2.setCards(player2Cards);
	}
	
	private void playGame(){
		
	}
	
}


