/******************************************************
Cours:  LOG121
Projet: Laboratoire #3
Nom du fichier: Dice.java
Date créé: 2014-10-21
*******************************************************
Historique des modifications
*******************************************************
*@author Hugo Deschamps
2014-10-21 Version initiale
*******************************************************/ 

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
	 * Retourne un nombre al��atoire entre 1 et le nombre de face du d��.
	 * @return int
	 */
	public int rollDice() {
		Random rand = new Random();
		return lastRollValue = rand.nextInt(this.numberOfFace + 1); 
	}
	
	/**
	 * Compare la valeur roul��e par deux d��s.
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
