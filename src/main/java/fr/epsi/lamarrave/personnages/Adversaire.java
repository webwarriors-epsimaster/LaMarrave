package fr.epsi.lamarrave.personnages;

import fr.epsi.lamarrave.utilitaires.Singleton;

/**
 * Personnage spécifiquement destiné à affronter le héro
 */
public abstract class Adversaire extends Personnage {

	/**
	 * Default constructor
	 */
	public Adversaire() {
		this.vie = 10 + Singleton.recupererHero().niveau * 2;
		this.vieMax = this.vie;
		this.armure = 10 + Singleton.recupererHero().niveau * 2;
		this.force = 20 + Singleton.recupererHero().niveau * 2;
	}

}