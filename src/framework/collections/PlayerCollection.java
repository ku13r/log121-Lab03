/******************************************************
Cours:  LOG121
Projet: Laboratoire #3
Nom du fichier: PlayerCollection.java
Date créé: 2014-10-21
*******************************************************
Historique des modifications
*******************************************************
*@author Hugo Deschamps
2014-10-21 Version initiale
*******************************************************/ 

package framework.collections;

import framework.Player;
import framework.utils.PlayerIterator;

import java.util.List;
import java.util.ArrayList;

public class PlayerCollection implements Collection {
	
	private List<Player> players;
	
	/**
	 * Constructeur.
	 */
	public PlayerCollection() {
		this.players = new ArrayList<Player>();
	}
	
	/**
	 * Ajoute un nouveau joueur dans la collection.
	 * @param player
	 */
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	/**
	 * Retourne un iterator parcourant la liste de joueurs.
	 */
	@Override
	public PlayerIterator createIterator() {
		return new PlayerIterator(players);
	}
	
}
