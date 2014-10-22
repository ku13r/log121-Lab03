package framework.utils;

import framework.Player;

import java.util.List;

public class PlayerIterator implements Iterator {
	
	private List<Player> playersList;
	private int currentPos = 0;
	
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
