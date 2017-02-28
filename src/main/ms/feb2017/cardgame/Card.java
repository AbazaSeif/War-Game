package main.ms.feb2017.cardgame;

public class Card implements Comparable<Card>{
	private int value;
	private int suitType;
	
	public Card(int s, int v){
		suitType = s;
		value = v;
	}
	
	public int getSuit(){
		return suitType;
	}
	
	public int getValue(){
		return value;
	}
	
	@Override
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
	
	@Override
	public String toString(){
		return "Suit " + this.getSuit() + " Value: " + this.getValue();
		
	}
}
