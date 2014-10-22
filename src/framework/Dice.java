package framework;

import java.util.Random;

public class Dice implements Comparable<Dice> {
	
	private int numberOfFace;
	private int lastRollValue;
	
	public Dice(int numberOfFace) {
		this.numberOfFace = numberOfFace;
	}
	
	public int calculerRandomNumber() {
		Random rand = new Random();
		return lastRollValue = rand.nextInt((this.numberOfFace - 1) + 1) + 1; 
	}

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
