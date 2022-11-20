package fr.epsi.lamarrave.personnages;

import java.util.List;

import fr.epsi.lamarrave.utilitaires.Observateur;

/**
 * Classe représentant un personnage dans le jeu avec toutes les caractéristiques qui lui sont propre
 */
public class Personnage {

	/**
	 * Default constructor
	 */
	public Personnage() {
	}

	/**
	 * 
	 */
	public int vie;

	/**
	 * 
	 */
	public int vieMax;

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
	public List<Observateur> observateurs;

}