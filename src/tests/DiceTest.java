package tests;

import static org.junit.Assert.*;
import framework.Die;

import org.junit.*;

public class DiceTest {
	
	private Die de1;
	private Die de2;
	
	@Before
	public void faireAvant() {
		//de1 = new Dice(6);
		//de2 = new Dice(6);
	}
	
	@Test
	public void deSuperieurTest() {
		de1.setLastRollValue(4);
		de2.setLastRollValue(5);
		assertTrue(de1.compareTo(de2) == 1);
		System.out.println("ALLO");
	}
	
	@Test
	public void deInferieurTest() {
		de1.setLastRollValue(4);
		de2.setLastRollValue(5);
		assertTrue(de2.compareTo(de1) == -1);
	}
	
	@Test
	public void memeDeTest() {
		de1.setLastRollValue(4);
		assertTrue(de1.compareTo(de1) == 0);
	}

	@Test(expected=IllegalArgumentException.class)
	public void deNullTest() {
		de1.setLastRollValue(4);
		de1.compareTo(null);
	}
}
