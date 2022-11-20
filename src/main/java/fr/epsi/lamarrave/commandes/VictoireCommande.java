package fr.epsi.lamarrave.commandes;

import fr.epsi.lamarrave.personnages.Hero;
import fr.epsi.lamarrave.utilitaires.Commande;

/**
 * 
 */
public class VictoireCommande implements Commande {

	/**
	 * Default constructor
	 */
	public VictoireCommande() {
	}

	/**
	 * Héro récupéré depuis le Singleton
	 */
	private Hero héro;

	@Override
	public void lancer(Object parametres) {
		// Le héro a gagné la partie
	}

}