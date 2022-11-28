package fr.epsi.lamarrave.commandes;

import fr.epsi.lamarrave.personnages.Hero;
import fr.epsi.lamarrave.utilitaires.Commande;

/**
 * 
 */
public class DefaiteCommande implements Commande {

	/**
	 * Default constructor
	 */
	public DefaiteCommande() {
	}

	/**
	 * Héro récupéré depuis le Singleton
	 */
	private Hero hero;

	/**
	 * @param parametres
	 */
	public void lancer() {
		// Le héro a perdu
		if(hero.vie<=0) {
			System.out.println("vous êtes mort, vous avez perdu, fin de la partie");
		}
	}

}