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
Nom du fichier : DieWithNumber.java
Date créé : Nov 3, 2014
Date dern. modif. Nov 11, 2014 
******************************************************* 
Historique des modifications 
******************************************************* 
2014-11-03 Version initiale
*******************************************************/

package bunco.gamerules;

import java.util.Random;

import framework.De;
import framework.Face;

public class DieWithNumber extends De {
	
	public DieWithNumber(int numberOfFace) {
		super(numberOfFace);
		
		for(int i=0; i<numberOfFace; i++)
			faces.add(new Face(String.valueOf(i), i));
	}
	
	public void rollDie() {
		Random rand = new Random();
		Face tempFace = faces.get(rand.nextInt(nbFaces-1)+1);
		derniereValeurRoule = tempFace.getValue();
		lastRollContent = tempFace.getContent();
	}
	
}
