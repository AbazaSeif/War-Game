package ms.feb2017.cardgame;

import java.util.*;

public class WarGame {

	Deck deck;
	Player p1;
	Player p2;
	List<Card> deckOfCards;
	List<Card> player1Cards = new ArrayList<>();
	List<Card> player2Cards = new ArrayList<>();
	
	
	public WarGame(String player1, String player2){
		deck = new Deck();
		deckOfCards = deck.getCards();
		Collections.shuffle(deckOfCards);	
		distributeCards(deckOfCards);
		p1 = new Player(player1,player1Cards);
		p2 = new Player(player2,player2Cards);
	}
	
	private void distributeCards(List<Card> deckCards){
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
		
	}
	
	public String playGame(){
		List<Card> warcards = new ArrayList<>();
		int count =0;
		while(true){
			if(p1.getSize() == 0 && p1.getReserveCardsSize()==0){
				return p2.getName();
			}else if(p2.getSize() == 0 && p2.getReserveCardsSize()==0){
				return p1.getName();
			}
			if(p1.getSize() == 0 && p1.getReserveCardsSize()!=0){
				System.out.println("Reloading in player 1");
				p1.reloadPlayerCards();
			}
			if(p2.getSize() == 0 && p2.getReserveCardsSize()!=0){
				System.out.println("Reloading in player 2");
				p2.reloadPlayerCards();
			}
			if(p1.getSize()!=0 && p2.getSize()!=0){
			Card c1 = p1.getCard();
			Card c2 = p2.getCard();
			int res = c1.compareTo(c2);
			System.out.println(++count);
			switch(res){
			
			case 1: if(warcards.size()>0){
						for(Card c : warcards)
							p1.addToReseveCards(c);
						warcards.clear();
					}
					p1.addToReseveCards(c1);
					p1.addToReseveCards(c2);
					break;
			case -1: if(warcards.size()>0){
						for(Card c : warcards){
							p2.addToReseveCards(c);
						}
						warcards.clear();
					 }
					 p2.addToReseveCards(c1);
					 p2.addToReseveCards(c2);
					 break;
				
			case 0: System.out.println("It's a War!!!");
			        warcards.add(c1);
			        warcards.add(c2);
			        break;
			}
			}
		}
		
	}
	
}


