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
Nom du fichier : De.java
Date créé : Nov 3, 2014
Date dern. modif. Nov 11, 2014 
******************************************************* 
Historique des modifications 
******************************************************* 
2014-11-03 Version initiale
*******************************************************/

package framework;

import java.util.ArrayList;
import java.util.List;

public abstract class De implements Comparable<De> {
	
	protected int nbFaces;
	
	protected int derniereValeurRoule;
	protected String lastRollContent;
	
	protected List<Face> faces;
	
	/**
	 * Constructeur
	 * @param nbFaces
	 */
	public De(int nbFaces) {
		faces = new ArrayList<Face>();
		this.nbFaces = nbFaces;
	}
	
	/**
	 * Retourne un nombre aléatoire entre 1 et le nombre de face du dé.
	 * @return int
	 */
	public abstract void rollDie();
	
	/**
	 * Compare la valeur roulée par deux dés.
	 * @return int
	 */
	@Override
	public int compareTo(De o) {
		if(o == null)
			throw new IllegalArgumentException("Dé invalide.");
		
		return o.getLastRollValue() - derniereValeurRoule;
	}
	
	/**
	 * @return the lastRollValue
	 */
	public int getLastRollValue() {
		return derniereValeurRoule;
	}

	/**
	 * @param lastRollValue the lastRollValue to set
	 */
	public void setLastRollValue(int lastRollValue) {
		this.derniereValeurRoule = lastRollValue;
	}
	
	/**
	 * @return the numberOfFace
	 */
	public int getNumberOfFace() {
		return nbFaces;
	}
	
	/**
	 * @param faceNumber the faceNumber to set
	 */
	public void setNumberOfFace(int faceNumber) {
		this.nbFaces = faceNumber;
	}

}
