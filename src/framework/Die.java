package framework;

public abstract class Die implements Comparable<Die> {
	
	protected int numberOfFace;
	
	protected int lastRollValue;
	protected String lastRollContent;
	
	protected Face[] faces;
	
	/**
	 * Constructeur
	 * @param numberOfFace
	 */
	public Die(int numberOfFace) {
		this.numberOfFace = numberOfFace;
	}
	
	/**
	 * Retourne un nombre aléatoire entre 1 et le nombre de face du dé.
	 * @return int
	 */
	public abstract void rollDice();
	
	/**
	 * Compare la valeur roulée par deux dés.
	 * @return int
	 */
	@Override
	public int compareTo(Die o) {
		if(o == null)
			throw new IllegalArgumentException("Dé invalide.");
		
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
