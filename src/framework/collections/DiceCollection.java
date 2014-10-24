/******************************************************
Cours:  LOG121
Projet: Laboratoire #3
Nom du fichier: DiceCollection.java
Date créé: 2014-10-21
*******************************************************
Historique des modifications
*******************************************************
*@author Hugo Deschamps
2014-10-21 Version initiale
*******************************************************/ 

package framework.collections;

import framework.Dice;
import framework.utils.DiceIterator;

import java.util.List;
import java.util.ArrayList;

public class DiceCollection implements Collection {

	private List<Dice> dices;
	
	/**
	 * Constructeur
	 */
	public DiceCollection() {
		this.dices = new ArrayList<Dice>();
	}
	
	/**
	 * Ajoute un d�� �� la liste de d��s.
	 * @param dice
	 */
	public void addDice(Dice dice) {
		dices.add(dice);
	}
	
	/**
	 * Retourne un it��rateur parcourant la liste de d��s.
	 */
	@Override
	public DiceIterator createIterator() {
		return new DiceIterator(dices);
	}

}
