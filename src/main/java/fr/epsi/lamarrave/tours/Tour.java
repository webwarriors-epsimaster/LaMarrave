package fr.epsi.lamarrave.tours;

import fr.epsi.lamarrave.utilitaires.Maillon;
import fr.epsi.lamarrave.utilitaires.Singleton;

/**
 * Représente un tour dans le jeu et pouvant s'obtenir aléatoirement en fonction
 * de la chance qui lui est associé
 */
public abstract class Tour extends Maillon<Tour> {

	/**
	 * Default constructor
	 */
	public Tour() {
		this.chance = 1;
	}

	/**
	 * Détermine la probabilité de tirer le tour (voir la classe "TourFabrique")
	 */
	public int chance;

	/**
	 * Créé un tour aléatoire et le spécifie comme étant le tour suivant
	 */
	protected void créerTourSuivant() {
		// Créer un tour aléatoire
		Tour tourSuivant = new TourFabrique().créerTour();
		
		// Définir le tour comme étant le suivant
		setSuivant(tourSuivant);
	}

}