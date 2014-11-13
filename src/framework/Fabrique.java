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
Nom du fichier : Fabrique.java
Date créé : Nov 3, 2014
Date dern. modif. Nov 11, 2014 
******************************************************* 
Historique des modifications 
******************************************************* 
2014-11-03 Version initiale
*******************************************************/

package framework;

import framework.collections.CollectionDe;
import framework.collections.CollectionJoueur;
import framework.gamerules.StrategieJeu;

public abstract class Fabrique {

	protected CollectionJoueur players;
	protected CollectionDe dice;
	
	protected Jeu game;
	
	private int nbOfTurns;
	
	/**
	 * Constructeur
	 * @param nbOfTurns
	 */
	public Fabrique(int nbOfTurns) {
		this.nbOfTurns = nbOfTurns;
	}
	
	/**
	 * Méthode principal qui crée les joueurs, les dés et initialise le jeu.
	 * @param gameStrategy
	 */
	public final void createGame(StrategieJeu gameStrategy) {
		createPlayer();
		createDice();
		game = new Jeu(nbOfTurns, gameStrategy);
		game.jouer(players, dice);
	}
	
	/**
	 * crée les joueurs.
	 */
	protected abstract void createPlayer();
	
	/**
	 * crée les joueurs.
	 */
	protected abstract void createDice();
}
