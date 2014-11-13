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
Nom du fichier : Jeu.java
Date créé : Nov 3, 2014
Date dern. modif. Nov 11, 2014 
******************************************************* 
Historique des modifications 
******************************************************* 
2014-11-03 Version initiale
*******************************************************/

package framework;

import java.util.Iterator;

import framework.collections.CollectionDe;
import framework.collections.CollectionJoueur;
import framework.gamerules.StrategieJeu;

public class Jeu {
	
	private int nbOfTurns;
	private int currTurn;
	
	private StrategieJeu gameStrategy;
	
	private CollectionJoueur joueurs;
	private CollectionDe des;
	
	private Iterator<Joueur> playerIterator;
	private Iterator<De> iterateurDe;
	
	private Joueur currPlayer;

	/**
	 * Constructeur
	 * @param nbOfTurns
	 */
	public Jeu(int nbOfTurns, StrategieJeu gameStrategy) {
		this.nbOfTurns = nbOfTurns;
		this.currTurn = 1;
		this.gameStrategy = gameStrategy;
	}
	
	/**
	 * Lance l'execution du jeu.
	 */
	public void jouer(CollectionJoueur joueurs, CollectionDe des) {
		this.joueurs = joueurs;
		this.des = des;
		
		this.playerIterator = joueurs.createIterator();
		nextPlayerToPlay();
		
		while(currTurn <= nbOfTurns) {
			rollDice();
			calculateTurnScore();
		}
		
		calculateThisGameWinner();
		
	}
	
	/**
	 * Change le joueur qui joue actuellement.
	 * Si on arrive au bout de la liste, on retourne au début.
	 */
	public void nextPlayerToPlay() {
		if(playerIterator.hasNext()) {
			currPlayer = playerIterator.next();
		} else {
			playerIterator = joueurs.createIterator();
			currPlayer = playerIterator.next();
			currTurn++;
		}
	}
	
	/**
	 * Roule toute les dés dans la collection de dés.
	 */
	private void rollDice() {
		iterateurDe = des.createIterator();
		De tempDice;
		
		while(iterateurDe.hasNext()) {
			tempDice = iterateurDe.next();
			tempDice.rollDie();
		}
	}
	
	/**
	 * Calcule selon la règle implémentée, le score des joueurs durant
	 * un tour.
	 */
	public void calculateTurnScore() {
		gameStrategy.calculateThisTurnScore(this);
	}
	
	/**
	 * Calcule selon la règle implémentée, le score des joueurs après la partie.
	 */
	public void calculateThisGameWinner() {
		gameStrategy.calculateThisGameWinner(this);
	}

	/**
	 * retourne le nombre de tours pour cette partie.
	 * @return nbOfturns
	 */
	public int getNbOfTurns() {
		return nbOfTurns;
	}
	
	/**
	 * retourne le numero du tour actuel
	 * @return currTurn
	 */
	public int getCurrTurn() {
		return currTurn;
	}
	
	public CollectionJoueur getJoueurs() {
		return joueurs;
	}
	
	public CollectionDe getDes() {
		return des;
	}
	
	/**
	 * @return the currPlayer
	 */
	public Joueur getCurrPlayer() {
		return currPlayer;
	}

}
