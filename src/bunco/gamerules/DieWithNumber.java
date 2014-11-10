package bunco.gamerules;

import java.util.Random;

import framework.Die;
import framework.Face;

public class DieWithNumber extends Die {

	public DieWithNumber(int numberOfFace) {
		super(numberOfFace);
		
		for(int i=0; i<numberOfFace; i++)
			faces[i] = new Face(String.valueOf(i), i);
	}
	
	public void rollDice() {
		Random rand = new Random();
		Face tempFace = faces[rand.nextInt(numberOfFace-1)+1];
		lastRollValue = tempFace.getValue();
		lastRollContent = tempFace.getContent();
	}
	
}
