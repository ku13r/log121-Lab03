package bunco.gamerules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import framework.Die;
import framework.Game;
import framework.Player;
import framework.collections.DiceCollection;
import framework.collections.PlayerCollection;
import framework.gamerules.GameStrategy;
import framework.utils.DiceIterator;
import framework.utils.PlayerIterator;

public class BuncoStrategy implements GameStrategy {
	
	/**
	 * 
	 */
	@Override
	public void calculateThisTurnScore(Game game) {
		
		DiceCollection dices = game.getDices();
		PlayerCollection players = game.getPlayers();
		
		int nbDices = dices.getNbOfDices();
		
		DiceIterator diceIterator;
		PlayerIterator playerIterator = players.createIterator();

		int tempPlayerScore;
		
		Boolean currPlayerTurn;
		
		Player currPlayer = null;
		Die currDie;
		Die lastDie;
		
		//index que l'on incrémente si aucun des dés est égal
		//au numémro du tour actuel.
		int j;
		
		//index que l'on incrémente si la valeur du dé est égal au tour actuel.
		int k;
		
		//index que l'on incrémente si les dés on la même valeur mais pas égal au tour actuel.
		int l;
		
		//Boucle qui fait jouer chaque joueurs
		while(playerIterator.hasNext()) {
			currPlayer = playerIterator.next();
			currPlayerTurn = true;
			tempPlayerScore = 0;
			
			System.out.println("C'est le tour du " + currPlayer.getName());
			
			//Boucle permet au joueur actuel de rejouer
			while(currPlayerTurn) {
				diceIterator = dices.createIterator();
				lastDie = null;
				currDie = null;
				j = 0;
				k = 0;
				l = 0;

				//Boucle qui roule les dés
				while(diceIterator.hasNext()) {
					currDie = diceIterator.next();
					currDie.rollDice();
					
					System.out.println("DIE ROLL = "+currDie.getLastRollValue());
					
					if(currDie.getLastRollValue() == 3)
						k++;
					else {
						if(lastDie != null) {
							if(lastDie.compareTo(currDie) != 0)
								j++;
							else
								l++;
						} else {
							j++;
							l++;
						}
					}
					
					lastDie = currDie;
				} //fin boucle dés
				
				System.out.println("k " + k);
				System.out.println("j " + j);
				System.out.println("l " + l);
				
				//Si le joueur fait un bunco il gagne 21 points
				//et termine son tour.
				if(k == nbDices) {
					System.out.println("BUNCO");
					tempPlayerScore += 21;
					currPlayerTurn = false;
				} else  {
					tempPlayerScore += k;
				}
				
				//Si il obtient 3 dés avec des valeurs identiques
				//Mais pas au tours de la même valeur.
				if(l == nbDices) {
					System.out.println("FIVE POINTER");
					tempPlayerScore += 5;
				}
				
				//Si le compteur arrive à 3, le tour du joeur ce termine.
				if(j == nbDices) {
					System.out.println("NEXT PLAYER");
					currPlayerTurn = false;
				}
				
			} // fin bouclue rejouer
			System.out.println("SCORE PLAYER "+ tempPlayerScore);
			currPlayer.addScore(tempPlayerScore);
			
		} //fin boucle pour faire jouer chaque joueurs
		
	}
	
	/**
	 * Calcule le et mets dans un ordre décroissant 
	 * les joueurs et leurs score et l'affiche.
	 * @param Game
	 */
	@Override
	public void calculateThisGameWinner(Game game) {
		PlayerCollection players = game.getPlayers();
		
		PlayerIterator playerIterator = players.createIterator();
		Player player;
		
		List<Player> playersSorted = new ArrayList<Player>();
		
		while(playerIterator.hasNext()) {
			player = playerIterator.next();
			playersSorted.add(player);
		}
		
		Collections.sort(playersSorted);
		
		System.out.println("Score finale!");
		
		for(Player player1: playersSorted)
			System.out.println(player1.getName() + " : " + player1.getScore());
	}

}
