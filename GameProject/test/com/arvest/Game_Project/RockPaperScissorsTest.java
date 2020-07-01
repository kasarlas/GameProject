package com.arvest.Game_Project;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class RockPaperScissorsTest {

	public static RockPaperScissors rps;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		
	}

	@Test
	public void testProcessInput() {
		//fail("Not yet implemented");
		RockPaperScissors rps = new RockPaperScissors();
		String result = rps.processInput("r","s");
		assertEquals(result, "Winner is A");
		result = rps.processInput("r","r");
		assertEquals(result, "Draw");
		
	}
	@Test
	public void testIsValidInput() {
		//fail("Not yet implemented");
		RockPaperScissors rps = new RockPaperScissors();
		boolean result = rps.isValidInput("r");
		assertTrue(result);
		result = rps.isValidInput("x");
		assertFalse(result);
	}

}
