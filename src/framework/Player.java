package framework;

public class Player implements Comparable<Player> {

	private int score;
	private String name;
	
	/**
	 * Constructeur
	 * @param Le nom du joueur
	 */
	public Player(String name) {
		this.setName(name);
	}
	
	public void addScore(int score) {
		this.score += score;
	}
	
	/**
	 * Compare le score entre deux joueurs.
	 * @return int
	 */
	@Override
	public int compareTo(Player o) {
		if(o == null)
			throw new IllegalArgumentException("Joueur invalide.");
		
		return o.getScore() - score;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
