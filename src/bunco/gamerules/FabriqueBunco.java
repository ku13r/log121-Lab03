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
Nom du fichier : FabriqueBunco.java
Date créé : Nov 3, 2014
Date dern. modif. Nov 11, 2014 
******************************************************* 
Historique des modifications 
******************************************************* 
2014-11-03 Version initiale
*******************************************************/

package bunco.gamerules;

import framework.Fabrique;
import framework.Joueur;
import framework.collections.CollectionDe;
import framework.collections.CollectionJoueur;

public class FabriqueBunco extends Fabrique {

	private int nbPlayers;
	private int nbDice;
	
	/**
	 * Constructeur
	 * @param nbPlayers
	 * @param nbDices
	 */
	public FabriqueBunco(int nbPlayers, int nbDices, int nbTours) {
		super(nbTours);
		
		players = new CollectionJoueur();
		dice = new CollectionDe();
		
		this.nbDice = nbDices;
		this.nbPlayers = nbPlayers;
		
		createGame(new BuncoStrategy());
	}
	
	@Override
	protected void createPlayer() {
		int i;
		
		for(i=0; i<nbPlayers; i++) {
			players.addPlayer(new Joueur("Player "+(i+1)));
		}
	}

	@Override
	protected void createDice() {
		int i;
		
		for(i=0; i<nbDice; i++) {
			dice.addDice(new DieWithNumber(6));
		}
	}

}
