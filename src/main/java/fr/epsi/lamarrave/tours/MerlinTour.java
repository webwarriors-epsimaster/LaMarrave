package fr.epsi.lamarrave.tours;

import fr.epsi.lamarrave.commandes.SoinCommande;
import fr.epsi.lamarrave.utilitaires.ICommande;

/**
 * Tour durant lequel le héro se voit être soigné par Merlin (voir la classe "SoinCommande")
 */
public class MerlinTour extends Tour {
	private final ICommande commande;

	/**
	 * Default constructor
	 */
	public MerlinTour() {
		this.commande = new SoinCommande();
	}

	@Override
	public void lancer() {
		// Le héro rencontre Merlin
		System.out.println("Bonjour jeune Padawan, ta voie tu trouveras !");

		// Lancement de la commande de soin
		this.commande.lancer();

		// Créer le tour suivant
		créerTourSuivant();

		// Lancer le tour suivant
		this.suivant.lancer();

	}


}