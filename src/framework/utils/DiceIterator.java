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
