package framework;

import framework.collections.DiceCollection;
import framework.collections.PlayerCollection;
import framework.gamerules.GameStrategy;

public abstract class Fabrique {

	protected PlayerCollection players;
	protected DiceCollection dices;
	
	protected Game game;
	
	private int nbOfTurns;
	
	public Fabrique(int nbOfTurns) {
		this.nbOfTurns = nbOfTurns;
	}
	
	public final void createGame(GameStrategy gameStrategy) {
		createPlayer();
		createDice();
		game = new Game(nbOfTurns, players, dices, gameStrategy);
		
		for(int i=0; i<nbOfTurns; i++)
			game.calculateTurnScore();
		
		game.calculateThisGameWinner();
	}
	
	protected abstract void createPlayer();
	
	protected abstract void createDice();
}
