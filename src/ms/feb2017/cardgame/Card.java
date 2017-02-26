package ms.feb2017.cardgame;

public abstract class Card implements Comparable{
	private int value;
	private Suit suit;
	
	public Card(int v, Suit s){
		value = v;
		suit = s;
	}
	
	public Suit getSuit(){
		return suit;
	}
	
	public int getValue(){
		return value;
	}
	
	public int compareTo(Card c2) {
		// TODO Auto-generated method stub
		if(value > c2.value){
			return 1;
		}else if(value < c2.value){
			return -1;
		}else {
			return 0;
		}
	}

}
