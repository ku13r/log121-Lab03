package framework;

import framework.collections.DiceCollection;
import framework.collections.PlayerCollection;
import framework.gamerules.GameStrategy;

public class Game {
	
	private int nbOfTurns;
	private int currTurn;
	private GameStrategy gameStrategy;
	
	private PlayerCollection players;
	private DiceCollection dice;
	
	/**
	 * Constructeur
	 * @param nbOfTurns
	 */
	public Game(int nbOfTurns, PlayerCollection players, DiceCollection dices, GameStrategy gameStrategy) {
		this.nbOfTurns = nbOfTurns;
		this.players = players;
		this.dice = dices;
		this.gameStrategy = gameStrategy;
	}

	/**
	 * Calcule selon la règle implémentée, le score des joueurs durant
	 * un tour.
	 */
	public void calculateTurnScore() {
		gameStrategy.calculateThisTurnScore(this);
	}
	
	/**
	 * Calcule selon la règle implémentée, le score des joueurs après la partie.
	 */
	public void calculateThisGameWinner() {
		gameStrategy.calculateThisGameWinner(this);
	}
	
	/**
	 * @return the gameRules
	 */
	public GameStrategy getGameRules() {
		return gameStrategy;
	}

	/**
	 * @param gameRules the gameRules to set
	 */
	public void setGameRules(GameStrategy gameRules) {
		this.gameStrategy = gameRules;
	}
	
	/**
	 * retourne le nombre de tours pour cette partie.
	 * @return nbOfturns
	 */
	public int getNbOfTurns() {
		return nbOfTurns;
	}
	
	/**
	 * Retourne la collection de joueur.
	 * @return PlayerCollection
	 */
	public PlayerCollection getPlayers() {
		return players;
	}
	
	/**
	 * Retourne la collection de dés.
	 * @return DiceCollection
	 */
	public DiceCollection getDices() {
		return dice;
	}
	
}
