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
Nom du fichier : RulesBuncoTest.java
Date créé : Nov 3, 2014
Date dern. modif. Nov 11, 2014 
******************************************************* 
Historique des modifications 
******************************************************* 
2014-11-03 Version initiale
*******************************************************/

package tests;

import static org.junit.Assert.*;
import framework.Jeu;
import framework.Joueur;
import framework.De;

import org.junit.*;

import bunco.gamerules.FabriqueBunco;

public class RulesBuncoTest {
	
	private FabriqueBunco bunco;
	private Jeu game;
	
	@Before
	public void faireAvant() {
		bunco = new FabriqueBunco(5, 3, 6);
	}
	
	@Test
	public void troisDesIdentiqueBunco() {
		System.out.println("Testing");
	}
	
}
