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
	
	/**
	 * Vérifi si il reste des éléments à itérer.
	 * @return boolean
	 */
	@Override
	public boolean hasNext() {
		return (currentPos < playersList.size()) ? true : false;
	}
	
	/**
	 * Retourne le prochain élément dans la liste et
	 * incrémente la position actuel dans la liste de 1.
	 * @return Die
	 */
	@Override
	public Player next() {
		Player player = playersList.get(currentPos);
		currentPos++;
		return player;
	}

}
