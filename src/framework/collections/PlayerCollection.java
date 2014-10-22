package framework.collections;

import framework.Player;
import framework.utils.PlayerIterator;

import java.util.List;
import java.util.ArrayList;

public class PlayerCollection implements Collection {
	
	private List<Player> players;
	
	public PlayerCollection() {
		this.players = new ArrayList<Player>();
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}

	@Override
	public PlayerIterator createIterator() {
		return new PlayerIterator(players);
	}
	
}
