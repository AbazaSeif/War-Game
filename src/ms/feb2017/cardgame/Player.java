package ms.feb2017.cardgame;
import java.util.*;

public class Player {
	
	private String name;
	private List<Card> playerCards;
	
	public Player(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public void setCards(List<Card> card) {
		this.playerCards = card;
	}
	

}
