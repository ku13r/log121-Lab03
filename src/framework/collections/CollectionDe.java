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
Nom du fichier : CollectionDe.java
Date créé : Nov 3, 2014
Date dern. modif. Nov 11, 2014 
******************************************************* 
Historique des modifications 
******************************************************* 
2014-11-03 Version initiale
*******************************************************/

package framework.collections;

import framework.De;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class CollectionDe {

	private List<De> dice;
	private int nbOfDices;
	
	/**
	 * Constructeur
	 */
	public CollectionDe() {
		nbOfDices = 0;
		this.dice = new ArrayList<De>();
	}
	
	/**
	 * Ajoute un dé à la liste de dés.
	 * @param dice
	 */
	public void addDice(De die) {
		dice.add(die);
		nbOfDices++;
	}
	
	/**
	 * Retourne un itérateur parcourant la liste de dés.
	 */
	public Iterator<De> createIterator() {
		return dice.iterator();
	}
	
	public int getNbOfDices() {
		return nbOfDices;
	}

}
