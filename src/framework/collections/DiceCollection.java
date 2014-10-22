package framework.collections;

import framework.Dice;
import framework.utils.DiceIterator;

import java.util.List;
import java.util.ArrayList;

public class DiceCollection implements Collection {

	private List<Dice> dices;
	
	public DiceCollection() {
		this.dices = new ArrayList<Dice>();
	}
	
	public void addDice(Dice dice) {
		dices.add(dice);
	}
	
	@Override
	public DiceIterator createIterator() {
		return new DiceIterator(dices);
	}

}
