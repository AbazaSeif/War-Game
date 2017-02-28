package main.ms.feb2017.cardgame;
import java.util.*;

public class Deck {
	
	List<Card> cards = new ArrayList<>();
	
	public Deck(){
		
		for(Suit s : Suit.values()){
			int suitnum = s.getValue();
			for(int i=1;i<=13;i++){
				Card c = new Card(suitnum,i);
				cards.add(c);			
			}
		}
	
	}
	
	public List<Card> getCards(){
		return this.cards;
	}
	
	
}
