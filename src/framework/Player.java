/******************************************************
Cours:  LOG121
Projet: Laboratoire #3
Nom du fichier: Player.java
Date créé: 2014-10-21
*******************************************************
Historique des modifications
*******************************************************
*@author Hugo Deschamps
2014-10-21 Version initiale
2014-11-07 Ajout d'exception compareTo (Simon)
*******************************************************/  

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
	
	/**
	 * Compare le score entre deux joueurs.
	 * @return int
	 */
	@Override
	public int compareTo(Player o) {
		if((o == null)||(o.getClass() != this.getClass()))
			throw new IllegalArgumentException("Joueur non valide");
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
