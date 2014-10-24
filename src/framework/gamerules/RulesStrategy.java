/******************************************************
Cours:  LOG121
Projet: Laboratoire #3
Nom du fichier: RulesStrategy.java
Date créé: 2014-10-21
*******************************************************
Historique des modifications
*******************************************************
*@author Hugo Deschamps
2014-10-21 Version initiale
*******************************************************/ 

package framework.gamerules;

import framework.Game;

public interface RulesStrategy {
	
	public void calculateThisTurnScore(Game game);
	
	public void calculateThisGameWinner(Game game);
	
}
