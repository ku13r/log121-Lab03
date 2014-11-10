package framework.collections;

import framework.Die;
import framework.utils.DiceIterator;

import java.util.List;
import java.util.ArrayList;

public class DiceCollection implements Collection {

	private List<Die> dices;
	private int nbOfDices;
	
	/**
	 * Constructeur
	 */
	public DiceCollection() {
		nbOfDices = 0;
		this.dices = new ArrayList<Die>();
	}
	
	/**
	 * Ajoute un dé à la liste de dés.
	 * @param dice
	 */
	public void addDice(Die dice) {
		dices.add(dice);
		nbOfDices++;
	}
	
	/**
	 * Retourne un itérateur parcourant la liste de dés.
	 */
	@Override
	public DiceIterator createIterator() {
		return new DiceIterator(dices);
	}
	
	public int getNbOfDices() {
		return nbOfDices;
	}

}
