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
Nom du fichier : TestesDe.java
Date créé : Nov 3, 2014
Date dern. modif. Nov 11, 2014 
******************************************************* 
Historique des modifications 
******************************************************* 
2014-11-03 Version initiale
*******************************************************/

package tests;

import static org.junit.Assert.*;
import framework.De;

import org.junit.*;

public class TestesDe {
	
	private De de1;
	private De de2;
	
	@Before
	public void faireAvant() {
		//de1 = new Dice(6);
		//de2 = new Dice(6);
	}
	
	@Test
	public void deSuperieurTest() {
		de1.setLastRollValue(4);
		de2.setLastRollValue(5);
		assertTrue(de1.compareTo(de2) == 1);
		System.out.println("ALLO");
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
