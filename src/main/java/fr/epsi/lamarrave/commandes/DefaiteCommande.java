package fr.epsi.lamarrave.commandes;

import fr.epsi.lamarrave.personnages.Hero;
import fr.epsi.lamarrave.utilitaires.Commande;
import fr.epsi.lamarrave.utilitaires.Observateur;
import fr.epsi.lamarrave.utilitaires.Singleton;

/**
 * 
 */
public class DefaiteCommande implements Commande, Observateur {
	/**
	 * Héro récupéré depuis le Singleton
	 */
	private Hero hero;

	/**
	 * Default constructor
	 */
	public DefaiteCommande() {
		this.hero = Singleton.recupererHero();
	}

	/**
	 * @param parametres
	 */
	public void lancer() {
		// Le héro a perdu
		if(hero.vie < 1) {
			System.out.println("vous êtes mort, vous avez perdu, fin de la partie");
			System.exit(0);
		}
	}

	@Override
	public void update() {
		this.lancer();
	}
}