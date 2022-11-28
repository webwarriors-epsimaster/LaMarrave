package fr.epsi.lamarrave.commandes;

import fr.epsi.lamarrave.personnages.Hero;
import fr.epsi.lamarrave.utilitaires.Commande;
import fr.epsi.lamarrave.utilitaires.Singleton;

/**
 * 
 */
public class SoinCommande implements Commande {

	private final Hero hero;

	/**
	 * Default constructor
	 */
	public SoinCommande() {
		this.hero = Singleton.recupererHero();
	}

	/**
	 * Héro récupéré depuis le Singleton
	 */
	public void lancer() {
		final int pointsDeVieRestaures = hero.vieMax - hero.vie;

		// Le héro est soigné à 100%
		hero.vie = hero.vieMax;
		System.out.println(String.format("Points de vie réstaurés", pointsDeVieRestaures));
	}

}