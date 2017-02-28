package test.ms.feb2017.cardgame;
import java.util.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import main.ms.feb2017.cardgame.*;

import org.junit.Before;


public class WarGameTest {
	
	WarGame wg;
	
	@Mock
	private Deck mockDeck;
	
	
	@Before
	public void Setup(){
			MockitoAnnotations.initMocks(this);
			Card c1 = new Card(0,11);
			Card c2 = new Card(2, 9);
			List<Card> deckOfCards = new ArrayList<>();
			deckOfCards.add(c1);
			deckOfCards.add(c2);
			when(mockDeck.getCards()).thenReturn(deckOfCards);
			wg =  new WarGame("TestPlayer1","TestPlayer2",mockDeck);

	}
	

	@Test
	public void testPlayGame() {
		String winner = wg.playGame();
		assertEquals("TestPlayer2",winner);
	}

	

}
