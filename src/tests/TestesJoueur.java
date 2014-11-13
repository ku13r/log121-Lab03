/****************************************************** 
Cours : LOG121
Session : A2014
Groupe : 01
Projet : Laboratoire #3 
Étudiant(e)(s) : Hugo Deschamps
				 Nicolas Pinard
				 Simon Lafontaine
Code(s) perm. : AM46850
				AM38000
				AM37640
Professeur : Ghizlane El boussaidi
Chargés de labo : Alvine Boaye Belle et Michel Gagnon
Nom du fichier : TestesJoueur.java
Date créé : Nov 3, 2014
Date dern. modif. Nov 11, 2014 
******************************************************* 
Historique des modifications 
******************************************************* 
2014-11-03 Version initiale
*******************************************************/

package tests;

import static org.junit.Assert.*;
import framework.Joueur;

import org.junit.*;

public class TestesJoueur {
	
	private Joueur player1;
	private Joueur player2;
	
	@Before
	public void faireAvant() {
		player1 = new Joueur("Player 1");
		player2 = new Joueur("Player 2");
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
