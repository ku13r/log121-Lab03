package framework;

import java.util.Random;

public class Dice implements Comparable<Dice> {
	
	private int numberOfFace;
	private int lastRollValue;
	
	/**
	 * Constructeur
	 * @param numberOfFace
	 */
	public Dice(int numberOfFace) {
		this.numberOfFace = numberOfFace;
	}
	
	/**
	 * Retourne un nombre aléatoire entre 1 et le nombre de face du dé.
	 * @return int
	 */
	public int rollDice() {
		Random rand = new Random();
		return lastRollValue = rand.nextInt((this.numberOfFace) + 1); 
	}
	
	/**
	 * Compare la valeur roulée par deux dés.
	 * @return int
	 */
	@Override
	public int compareTo(Dice o) {
		return o.getLastRollValue() - lastRollValue;
	}

	/**
	 * @return the lastRollValue
	 */
	public int getLastRollValue() {
		return lastRollValue;
	}

	/**
	 * @param lastRollValue the lastRollValue to set
	 */
	public void setLastRollValue(int lastRollValue) {
		this.lastRollValue = lastRollValue;
	}
	
	/**
	 * @return the numberOfFace
	 */
	public int getNumberOfFace() {
		return numberOfFace;
	}
	
	/**
	 * @param faceNumber the faceNumber to set
	 */
	public void setNumberOfFace(int faceNumber) {
		this.numberOfFace = faceNumber;
	}

}
