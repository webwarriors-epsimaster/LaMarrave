package fr.epsi.lamarrave.tours;

import fr.epsi.lamarrave.Main;
import fr.epsi.lamarrave.commandes.DefaiteCommande;
import fr.epsi.lamarrave.commandes.VictoireCommande;
import fr.epsi.lamarrave.utilitaires.Maillon;
import fr.epsi.lamarrave.utilitaires.Observable;
import fr.epsi.lamarrave.utilitaires.Singleton;

/**
 * Représente un tour dans le jeu et pouvant s'obtenir aléatoirement en fonction
 * de la chance qui lui est associé
 */
public abstract class Tour extends Maillon<Tour> {
	private final Observable observable = new Observable();

	/**
	 * Default constructor
	 */
	public Tour() {
		this.chance = 1;

		observable.souscrire(Singleton.recupererDefaiteCommande());
		observable.souscrire(Singleton.recupererVictoireCommande());
		observable.notifierLesObservateurs();
	}

	/**
	 * Détermine la probabilité de tirer le tour (voir la classe "TourFabrique")
	 */
	public int chance;

	/**
	 * Créé un tour aléatoire et le spécifie comme étant le tour suivant
	 */
	protected void créerTourSuivant() {
		System.out.println("\n\n");
		
		// Créer un tour aléatoire
		Tour tourSuivant = new TourFabrique().créerTour();
		System.out.println("Le nouveau tour est : " + tourSuivant.getClass().getSimpleName());
		
		// Définir le tour comme étant le suivant
		setSuivant(tourSuivant);

		// Incrémenter le compte de tours
		Main.NB_TOURS++;
	}

}