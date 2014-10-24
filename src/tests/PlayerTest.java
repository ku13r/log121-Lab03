/******************************************************
Cours:  LOG121
Projet: Laboratoire #3
Nom du fichier: PlayerTest.java
Date créé: 2014-10-21
*******************************************************
Historique des modifications
*******************************************************
*@author Hugo Deschamps
2014-10-21 Version initiale
*******************************************************/ 

package tests;

import static org.junit.Assert.*;
import framework.Player;

import org.junit.*;

public class PlayerTest {
	
	private Player player1;
	private Player player2;
	
	@Before
	public void faireAvant() {
		player1 = new Player("Player 1");
		player2 = new Player("Player 2");
	}
	
	@Test
	public void playerHighScoreTest() {
		player1.setScore(100);
		player2.setScore(120);
		assertTrue(player1.compareTo(player2) > 0);
	}
	
	@Test 
	public void playerLowerScoreTest() {
		player1.setScore(100);
		player2.setScore(120);
		assertTrue(player2.compareTo(player1) < 0);
	}
	
	@Test
	public void playerSameScore() {
		player1.setScore(100);
		assertTrue(player1.compareTo(player1) == 0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void playerNullTest() {
		player1.setScore(100);
		player1.compareTo(null);
	}
}
