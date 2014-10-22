package framework.gamerules;

import framework.Game;

public interface RulesStrategy {
	
	public void calculateThisTurnScore(Game game);
	
	public void calculateThisGameWinner(Game game);
	
}
