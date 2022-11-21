package fr.epsi.lamarrave.commandes;

import fr.epsi.lamarrave.personnages.Hero;
import fr.epsi.lamarrave.utilitaires.Commande;

/**
 * 
 */
public class SoinCommande implements Commande {

	/**
	 * Default constructor
	 */
	public SoinCommande() {
	}

	/**
	 * Héro récupéré depuis le Singleton
	 */
	private Hero héro;

	public void lancer() {
		// Le héro est soigné à 100%
	}

}