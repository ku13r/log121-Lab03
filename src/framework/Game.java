/******************************************************
Cours:  LOG121
Projet: Laboratoire #3
Nom du fichier: Game.java
Date créé: 2014-10-21
*******************************************************
Historique des modifications
*******************************************************
*@author Hugo Deschamps
2014-10-21 Version initiale
*******************************************************/ 

package framework; 

import framework.gamerules.RulesStrategy;

public abstract class Game {
	
	private int currentTurn = 0;
	private RulesStrategy gameRules;
	
	public void calculateThisTurnScore() {
		
	}
	
	public void calculateThisGameWinner() {
		
	}
	
}
