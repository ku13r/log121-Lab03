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
	 * Ajoute un dé à la liste de dés.
	 * @param dice
	 */
	public void addDice(Dice dice) {
		dices.add(dice);
	}
	
	/**
	 * Retourne un itérateur parcourant la liste de dés.
	 */
	@Override
	public DiceIterator createIterator() {
		return new DiceIterator(dices);
	}

}
