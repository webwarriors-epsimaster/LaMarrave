package fr.epsi.lamarrave;

/**
 * Représente un tour dans le jeu et pouvant s'obtenir aléatoirement en fonction de la chance qui lui est associé
 */
public abstract class Tour extends Maillon<Tour> {

	/**
	 * Default constructor
	 */
	public Tour() {
	}

	/**
	 * Détermine la probabilité de tirer le tour (voir la classe "TourFabrique")
	 */
	public int chance;

}