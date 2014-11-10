package framework.utils;

import framework.Die;

import java.util.List;

public class DiceIterator implements Iterator {
	
	private List<Die> dicesList;
	private int currentPos = 0;
	
	/**
	 * Constructeur
	 * @param dicesList
	 */
	public DiceIterator(List<Die> dicesList) {
		this.dicesList = dicesList;
	}
	
	/**
	 * Vérifi si il reste des éléments à itérer.
	 * @return boolean
	 */
	@Override
	public boolean hasNext() {
		return (currentPos < dicesList.size()) ? true : false;
	}
	
	/**
	 * Retourne le prochain élément dans la liste et
	 * incrémente la position actuel dans la liste de 1.
	 * @return Die
	 */
	@Override
	public Die next() {
		Die dice = dicesList.get(currentPos);
		currentPos++;
		return dice;
	}

}
