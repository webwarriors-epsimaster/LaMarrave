package fr.epsi.lamarrave.personnages;

import java.util.List;

import fr.epsi.lamarrave.utilitaires.IObservateur;

/**
 * Classe représentant un personnage dans le jeu avec toutes les caractéristiques qui lui sont propre
 */
public abstract class Personnage {

	/**
	 * 
	 */
	public int vie;

	/**
	 * 
	 */
	public int vieMax;

	public int force;


	/**
	 * 
	 */
	public int pointsExpérience;

	/**
	 * 
	 */
	public int niveau;

	/**
	 * 
	 */
	public int armure;

	/**
	 * Observateurs de l'objet actuel
	 */
	public List<IObservateur> observateurs;

	/**
	 * @return Nom de ce qui sera affiché lors de l'attaque (ex. Coup d'épée)
	 */
	public abstract String récupérerAttaque();

}