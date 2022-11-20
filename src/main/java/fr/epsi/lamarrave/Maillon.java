package fr.epsi.lamarrave;

/**
 * Dérivé du patron de conception "chaîne de responsabilité" héritant  de commande et permettant de poursuivre le processus à un autre maillon (suivant) de la chaîne
 */
public abstract class Maillon<T extends Maillon> implements Commande {

	/**
	 * Default constructor
	 */
	public Maillon() {
	}


	/**
	 * Définir le maillon s'éxécutant après celui-ci
	 * @param s
	 */
	public void setSuivant(T s) {
		// TODO implement here
	}
	
}