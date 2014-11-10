package bunco.gamerules;

import framework.Die;
import framework.Fabrique;
import framework.Player;
import framework.collections.DiceCollection;
import framework.collections.PlayerCollection;

public class FabriqueBunco extends Fabrique {

	private int nbPlayers;
	private int nbDices;
	
	public FabriqueBunco(int nbPlayers, int nbDices) {
		super(6);
		
		players = new PlayerCollection();
		dices = new DiceCollection();
		
		this.nbDices = nbDices;
		this.nbPlayers = nbPlayers;
		
		createGame(new BuncoStrategy());
	}
	
	@Override
	protected void createPlayer() {
		int i;
		
		for(i=0; i<nbPlayers; i++) {
			players.addPlayer(new Player("Player "+(i+1)));
		}
	}

	@Override
	protected void createDice() {
		int i;
		
		for(i=0; i<nbDices; i++) {
			dices.addDice(new DieWithNumber(6));
		}
	}

}
