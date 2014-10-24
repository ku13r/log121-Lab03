/******************************************************
Cours:  LOG121
Projet: Laboratoire #3
Nom du fichier: PlayerIterator.java
Date créé: 2014-10-21
*******************************************************
Historique des modifications
*******************************************************
*@author Hugo Deschamps
2014-10-21 Version initiale
*******************************************************/ 

package framework.utils;

import framework.Player;

import java.util.List;

public class PlayerIterator implements Iterator {
	
	private List<Player> playersList;
	private int currentPos = 0;
	
	/**
	 * Constructeur
	 * @param playersList
	 */
	public PlayerIterator(List<Player> playersList) {
		this.playersList = playersList;
	}
	
	@Override
	public boolean hasNext() {
		return (currentPos + 1 < playersList.size()) ? true : false;
	}

	@Override
	public Player next() {
		Player player = playersList.get(currentPos);
		currentPos++;
		return player;
	}

}
