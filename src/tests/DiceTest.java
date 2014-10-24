/******************************************************
Cours:  LOG121
Projet: Laboratoire #3
Nom du fichier: DiceTest.java
Date créé: 2014-10-21
*******************************************************
Historique des modifications
*******************************************************
*@author Hugo Deschamps
2014-10-21 Version initiale
*******************************************************/ 

package tests;

import static org.junit.Assert.*;
import framework.Dice;

import org.junit.*;

public class DiceTest {
	
	private Dice de1;
	private Dice de2;
	
	@Before
	public void faireAvant() {
		de1 = new Dice(6);
		de2 = new Dice(6);
	}
	
	@Test
	public void deSuperieurTest() {
		de1.setLastRollValue(4);
		de2.setLastRollValue(5);
		assertTrue(de1.compareTo(de2) == 1);
	}
	
	@Test
	public void deInferieurTest() {
		de1.setLastRollValue(4);
		de2.setLastRollValue(5);
		assertTrue(de2.compareTo(de1) == -1);
	}
	
	@Test
	public void memeDeTest() {
		de1.setLastRollValue(4);
		assertTrue(de1.compareTo(de1) == 0);
	}

	@Test(expected=IllegalArgumentException.class)
	public void deNullTest() {
		de1.setLastRollValue(4);
		de1.compareTo(null);
	}
}
