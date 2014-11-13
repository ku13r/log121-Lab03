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
Nom du fichier : CollectionJoueur.java
Date créé : Nov 3, 2014
Date dern. modif. Nov 11, 2014 
******************************************************* 
Historique des modifications 
******************************************************* 
2014-11-03 Version initiale
*******************************************************/

package framework.collections;

import framework.Joueur;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionJoueur {
	
	private List<Joueur> players;
	private int nbOfPlayers;
	
	/**
	 * Constructeur.
	 */
	public CollectionJoueur() {
		nbOfPlayers = 0;
		this.players = new ArrayList<Joueur>();
	}
	
	/**
	 * Ajoute un nouveau joueur dans la collection.
	 * @param player
	 */
	public void addPlayer(Joueur player) {
		players.add(player);
		nbOfPlayers++;
	}
	
	/**
	 * Retourne un iterator parcourant la liste de joueurs.
	 */
	public Iterator<Joueur> createIterator() {
		return players.iterator();
	}
	
	public int size() {
		return nbOfPlayers;
	}
	
}
