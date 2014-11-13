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
Nom du fichier : BuncoStrategy.java
Date créé : Nov 3, 2014
Date dern. modif. Nov 11, 2014 
******************************************************* 
Historique des modifications 
******************************************************* 
2014-11-03 Version initiale
*******************************************************/

package bunco.gamerules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

import framework.De;
import framework.Jeu;
import framework.Joueur;
import framework.collections.CollectionDe;
import framework.collections.CollectionJoueur;
import framework.gamerules.StrategieJeu;

public class BuncoStrategy implements StrategieJeu {
	
	/**
	 * Calcule le score du joueur actuel selon les 
	 * valeurs des dés qu'il a rouler et détermine si
	 * il continue de jouer ou termine son tour.
	 * @param Jeu
	 */
	@Override
	public void calculateThisTurnScore(Jeu game) {
		CollectionDe collectionDe = game.getDes();
		Iterator<De> diceIterator = collectionDe.createIterator();
		
		De lastDie = null;
		De currDie = null;
		
		Joueur currPlayer = game.getCurrPlayer();
		
		System.out.println(currPlayer.getName());
		
		int currTurn = game.getCurrTurn();
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(diceIterator.hasNext()) {
			currDie = diceIterator.next();
			if(currDie.getLastRollValue() == currTurn)
				i++;
			else {
				if(lastDie != null) {
					if(lastDie.compareTo(currDie) != 0)
						k++;
					else
						j++;
				} else {
					k++;
					j++;
				}
			}
			
			lastDie = currDie;
		}
		
		System.out.println("i "+ i);
		System.out.println("j "+ j);
		System.out.println("k "+ k);
		System.out.println();
		
		//Si i est égal a 3 le joueur a un bunco.
		if(i == 3) {
			currPlayer.addScore(21);
			game.nextPlayerToPlay();
		} else //Sinon il a un point par dé dont la face est égal au nombre du tour.
			currPlayer.addScore(i);
		
		//Si j égal 3 il a 3 dé identique dont la face n'est pas égail au nombre du tour.
		if(j == 3)
			currPlayer.addScore(5);
		
		//Si k égal 3 le tour du joueur est terminé et il a aucun points.
		if(k == 3)
			game.nextPlayerToPlay();
	}
	
	/**
	 * Calcule le et mets dans un ordre décroissant 
	 * les joueurs et leurs score pour ensuite les afficher.
	 * @param Jeu
	 */
	@Override
	public void calculateThisGameWinner(Jeu game) {
		CollectionJoueur collectionJoueur = game.getJoueurs();
		Iterator<Joueur> playerIterator =  collectionJoueur.createIterator();
		Joueur tempJoueur;
		
		List<Joueur> playersSorted = new ArrayList<Joueur>();
		
		while(playerIterator.hasNext()) {
			tempJoueur = playerIterator.next();
			playersSorted.add(tempJoueur);
		}
		
		Collections.sort(playersSorted);
		
		System.out.println("Score finale!");
		
		for(Joueur joueur: playersSorted)
			System.out.println(joueur.getName() + " : " + joueur.getScore());
	}

}
