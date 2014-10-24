/******************************************************
Cours:  LOG121
Projet: Laboratoire #3
Nom du fichier: Collection.java
Date créé: 2014-10-21
*******************************************************
Historique des modifications
*******************************************************
*@author Hugo Deschamps
2014-10-21 Version initiale
*******************************************************/  

package framework.collections;

import framework.utils.Iterator;

public interface Collection {
	
	public Iterator createIterator();
	
}
