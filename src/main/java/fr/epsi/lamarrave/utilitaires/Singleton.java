package fr.epsi.lamarrave.utilitaires;

import fr.epsi.lamarrave.personnages.Hero;

/**
 * Dérivé du patron de conception "Singleton" permettant de persister des objets dans le contexte d'éxécution et les rendre accessible partout
 */
public class Singleton {

	/**
	 * Default constructor
	 */
	public Singleton() {
	}

	/**
	 * Instance persistée du singleton(si non défini, doit etre implémenté dans le récupérateur)
	 */
	private static Hero hero;

	/**
	 * Renvoie le singleton persisté
	 * @return
	 */
	public static Hero recupererHero() {
		if(hero == null){
			hero = new Hero();
		}
		return hero;
	}

}