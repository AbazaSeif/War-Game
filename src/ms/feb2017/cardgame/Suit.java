package ms.feb2017.cardgame;

public enum Suit {
	club(0), Diamond(1), Heart(2), Spade(3);
	private int value;
	
	private Suit(int v){
		value = v;
	}
	
	public int getValue(){
		return value;
	}
}
