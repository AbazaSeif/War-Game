package test.ms.feb2017.cardgame;

import static org.junit.Assert.*;

import org.junit.Test;

import main.ms.feb2017.cardgame.Card;


public class CardTest {

	@Test
	public void testCard() {
		try {
		      new Card(1,5);
		      new Card(4,13);
		      new Card(0,12);
		    } catch (Exception e) {
		      fail(e.getMessage());
		    }
	}


	@Test
	public void testCompareTo() {
		Card c1 = new Card(1,7);
		Card c2 = new Card(3,13);
		assertEquals(-1,c1.compareTo(c2));
		assertEquals(1,c2.compareTo(c1));
	}

}
