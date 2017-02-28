package main.ms.feb2017.cardgame;
import java.util.*;

public class Game {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player 1 : ");
		String player1 =sc.next();
		System.out.println("Enter Player 2 : ");
		String player2 =sc.next();
		sc.close();
		WarGame wg = new WarGame(player1,player2);
		String winner = wg.playGame();
		System.out.println("Winner is : " + winner);
	}
	
}
