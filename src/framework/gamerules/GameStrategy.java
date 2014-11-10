package framework.gamerules;

import framework.Game;

public interface GameStrategy {
	
	public void calculateThisTurnScore(Game game);
	
	public void calculateThisGameWinner(Game game);
	
}
