package test.ms.feb2017.cardgame;
import java.util.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.mockito.Mock;

import main.ms.feb2017.cardgame.*;

import org.junit.Before;


public class WarGameTest {
	
	WarGame wg;
	
	@Before
	public void Setup(){

		wg = new WarGame("Player1","Player2");
		

	}
	

	@Test
	public void testPlayGame() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckPlayerEmpty() {
		fail("Not yet implemented");
	}

}
