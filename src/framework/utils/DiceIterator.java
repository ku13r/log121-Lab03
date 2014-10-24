/******************************************************
Cours:  LOG121
Projet: Laboratoire #3
Nom du fichier: DiceIterator.java
Date créé: 2014-10-21
*******************************************************
Historique des modifications
*******************************************************
*@author Hugo Deschamps
2014-10-21 Version initiale
*******************************************************/ 

package framework.utils;

import framework.Dice;

import java.util.List;

public class DiceIterator implements Iterator {
	
	private List<Dice> dicesList;
	private int currentPos = 0;
	
	public DiceIterator(List<Dice> dicesList) {
		this.dicesList = dicesList;
	}
	
	@Override
	public boolean hasNext() {
		return (currentPos + 1 < dicesList.size()) ? true : false;
	}

	@Override
	public Dice next() {
		Dice dice = dicesList.get(currentPos);
		currentPos++;
		return dice;
	}

}
