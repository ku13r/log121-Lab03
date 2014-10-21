import java.util.Random;

public class Dice {
	
	private int numberOfFace;
	
	public Dice(int numberOfFace) {
		this.numberOfFace = numberOfFace;
	}
	
	public int calculerRandomNumber() {
		Random rand = new Random();
		return rand.nextInt((this.numberOfFace - 1) + 1) + 1; 
	}
	
	public int getNumberOfFace() {
		return numberOfFace;
	}
	
	public void setNumberOfFace(int numberOfFace) {
		this.numberOfFace = numberOfFace;
	}
	
}
