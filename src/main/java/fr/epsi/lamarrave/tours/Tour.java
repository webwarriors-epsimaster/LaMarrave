package fr.epsi.lamarrave.tours;

import fr.epsi.lamarrave.commandes.CommandeObservable;
import fr.epsi.lamarrave.commandes.DefaiteCommande;
import fr.epsi.lamarrave.commandes.VictoireCommande;
import fr.epsi.lamarrave.utilitaires.Maillon;

/**
 * Représente un tour dans le jeu et pouvant s'obtenir aléatoirement en fonction
 * de la chance qui lui est associé
 */
public abstract class Tour extends Maillon<Tour> {
	final CommandeObservable observable = new CommandeObservable();

	/**
	 * Default constructor
	 */
	public Tour() {
		this.chance = 1;

		//TODO : Créer un Singleton pour les deux commandes ci-dessous et ainsi évité l'instanciation excessives ??
		observable.subscribe(new DefaiteCommande());
		observable.subscribe(new VictoireCommande());
		observable.notifyListeners();
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
		System.out.println("Le nouveau tour est : " + tourSuivant.getClass().getSimpleName());
		
		// Définir le tour comme étant le suivant
		setSuivant(tourSuivant);
	}

}