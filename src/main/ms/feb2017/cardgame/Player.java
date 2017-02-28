package main.ms.feb2017.cardgame;
import java.util.*;

public class Player {
	
	private String name;
	private List<Card> playerCards;
	private List<Card> reserveCardPile = new ArrayList<>();
	
	public Player(String n, List<Card> pcards){
		name = n;
		playerCards = new ArrayList<>(); 
		playerCards.addAll(pcards);
	}
	
	public String getName(){
		return name;
	}
	
	public Card getCard(){
		if(this.playerCards.size() != 0) {
			Card c = playerCards.get(0);
			playerCards.remove(0);
			return c;
		}
		return null;
	}
	
	public int getSize(){
		return playerCards.size();
	}
	
	public int getReserveCardsSize(){
		return reserveCardPile.size();
	}
	
	public void reloadPlayerCards(){
		playerCards.addAll(reserveCardPile);
		Collections.shuffle(playerCards);
		reserveCardPile.clear();
	}
	
	public void addToReseveCards(Card c){
		reserveCardPile.add(c);
	}
	
}
