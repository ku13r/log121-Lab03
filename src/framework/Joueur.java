/****************************************************** 
Cours : LOG121
Session : A2014
Groupe : 01
Projet : Laboratoire #3 
Étudiant(e)(s) : Hugo Deschamps
				 Nicolas Pinard
				 Simon Lafontaine
Code(s) perm. : AM46850
				AM38000
				AM37640
Professeur : Ghizlane El boussaidi
Chargés de labo : Alvine Boaye Belle et Michel Gagnon
Nom du fichier : Joueur.java
Date créé : Nov 3, 2014
Date dern. modif. Nov 11, 2014 
******************************************************* 
Historique des modifications 
******************************************************* 
2014-11-03 Version initiale
*******************************************************/

package framework;

public class Joueur implements Comparable<Joueur> {

	private int points;
	private String nom;
	
	/**
	 * Constructeur
	 * @param Le nom du joueur
	 */
	public Joueur(String name) {
		this.setName(name);
	}
	
	public void addScore(int score) {
		this.points += score;
	}
	
	/**
	 * Compare le score entre deux joueurs.
	 * @return int
	 */
	@Override
	public int compareTo(Joueur o) {
		if(o == null)
			throw new IllegalArgumentException("Joueur invalide.");
		
		return o.getScore() - points;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return points;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.points = score;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return nom;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.nom = name;
	}
	
}
