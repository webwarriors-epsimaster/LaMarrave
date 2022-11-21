package fr.epsi.lamarrave.commandes;

import fr.epsi.lamarrave.personnages.Hero;
import fr.epsi.lamarrave.utilitaires.Commande;

/**
 * 
 */
public class MonteeDeNiveauCommande implements Commande {

	/**
	 * Default constructor
	 */
	public MonteeDeNiveauCommande() {
	}

	/**
	 * Héro récupéré depuis le Singleton
	 */
	private Hero héro;

	@Override
	public void lancer() {
		// Le héro monte de niveau
	}

}