package fr.epsi.lamarrave.tours;

import fr.epsi.lamarrave.commandes.SoinCommande;
import fr.epsi.lamarrave.personnages.Hero;
import fr.epsi.lamarrave.utilitaires.Commande;
import fr.epsi.lamarrave.utilitaires.Singleton;

/**
 * Tour durant lequel le héro se voit être soigné par Merlin (voir la classe "SoinCommande")
 */
public class MerlinTour extends Tour {

	private final TourFabrique factory;
	private final Commande commande;

	/**
	 * Default constructor
	 */
	public MerlinTour() {
		this.factory = new TourFabrique();
		this.commande = new SoinCommande();
	}

	@Override
	public void lancer() {


		// Le héro rencontre Merlin
		System.out.println("Bonjour jeune Padawan, ta voie tu trouveras !");

		// Lancement de la commande de soin
		this.commande.lancer();

		// Lancer le tour suivant
		this.setSuivant(factory.créerTour());
		this.suivant.lancer();

	}


}