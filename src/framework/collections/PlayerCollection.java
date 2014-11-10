package framework.collections;

import framework.Player;
import framework.utils.PlayerIterator;

import java.util.List;
import java.util.ArrayList;

public class PlayerCollection implements Collection {
	
	private List<Player> players;
	private int nbOfPlayers;
	
	/**
	 * Constructeur.
	 */
	public PlayerCollection() {
		nbOfPlayers = 0;
		this.players = new ArrayList<Player>();
	}
	
	/**
	 * Ajoute un nouveau joueur dans la collection.
	 * @param player
	 */
	public void addPlayer(Player player) {
		players.add(player);
		nbOfPlayers++;
	}
	
	/**
	 * Retourne un iterator parcourant la liste de joueurs.
	 */
	@Override
	public PlayerIterator createIterator() {
		return new PlayerIterator(players);
	}
	
	public int getNbOfPlayers() {
		return nbOfPlayers;
	}
	
}
