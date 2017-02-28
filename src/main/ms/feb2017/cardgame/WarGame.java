package main.ms.feb2017.cardgame;

import java.util.*;

public class WarGame {

	
	Player p1;
	Player p2;
	List<Card> deckOfCards;
	List<Card> player1Cards = new ArrayList<>();
	List<Card> player2Cards = new ArrayList<>();
	
	
	public WarGame(String player1, String player2, Deck deck){

		deckOfCards = deck.getCards();
		Collections.shuffle(deckOfCards);	
		distributeCards(deckOfCards);
		p1 = new Player(player1,player1Cards);
		p2 = new Player(player2,player2Cards);
	}
	
	public void distributeCards(List<Card> deckCards){
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
		
		while(true){
			
			String winner = checkPlayerEmpty(p1,p2);
			if(winner!=null){
				return winner;
			}
			if(p1.getSize()!=0 && p2.getSize()!=0){
			Card c1 = p1.getCard();
			Card c2 = p2.getCard();
			int res = c1.compareTo(c2);
			System.out.println(p1.getName() + " got card with Rank : " + c1.getValue());
			System.out.println(p2.getName() + " got card with Rank : " + c2.getValue());
		
			switch(res){
			
			case 1: if(warcards.size()>0){
						for(Card c : warcards)
							p1.addToReseveCards(c);
						warcards.clear();
					}
					p1.addToReseveCards(c1);
					p1.addToReseveCards(c2);
					System.out.println(p1.getName() +" won this round!! \n");
					break;
			case -1: if(warcards.size()>0){
						for(Card c : warcards){
							p2.addToReseveCards(c);
						}
						warcards.clear();
					 }
					 p2.addToReseveCards(c1);
					 p2.addToReseveCards(c2);
					 System.out.println(p2.getName() +" won this round!! \n");
					 break;
				
			case 0: System.out.println("It's a War!! Lay down 1 card and draw again");
			        warcards.add(c1);
			        warcards.add(c2);
			        String winnerFoundInWar = checkPlayerEmpty(p1,p2);
					if(winnerFoundInWar!=null){
						return winnerFoundInWar;
					}
					if(p1.getSize()!=0 && p2.getSize()!=0){
			        warcards.add(p1.getCard());
			        warcards.add(p2.getCard());
					}
			        break;
			}
			}
		}
		
	}
	
	public String checkPlayerEmpty(Player pl1, Player pl2){
		if(p1.getSize() == 0 && p1.getReserveCardsSize()==0){
			return p2.getName();
		}else if(p2.getSize() == 0 && p2.getReserveCardsSize()==0){
			return p1.getName();
		}
		if(p1.getSize() == 0 && p1.getReserveCardsSize()!=0){
			System.out.println("Reloading cards for " + p1.getName());
			p1.reloadPlayerCards();
		}
		if(p2.getSize() == 0 && p2.getReserveCardsSize()!=0){
			System.out.println("Reloading cards for " + p2.getName());
			p2.reloadPlayerCards();
		}
		return null;
	}
}


