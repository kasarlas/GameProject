package com.arvest.Game_Project;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class GameTest {

		public static Game player1;
		public static Game player2;
		
	///The rules for winning are:

//		Rock crushes scissors
//		Paper covers rock
//		Scissors cuts paper
//		In all other cases:
//		if two / are the same it is a draw
//		otherwise, we lose
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		player1 = new Game();
		player2 = new Game();
		
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
