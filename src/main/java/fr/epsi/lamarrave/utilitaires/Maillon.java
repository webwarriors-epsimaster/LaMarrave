package fr.epsi.lamarrave.utilitaires;

/**
 * Dérivé du patron de conception "chaîne de responsabilité" héritant  de commande et permettant de poursuivre le processus à un autre maillon (suivant) de la chaîne
 */
public abstract class Maillon<T extends Maillon> implements ICommande {

	/**
	 * Default constructor
	 */
	public Maillon() {
	}

	/**
	 * Maillon de la chaîne suivant
	 */
	protected T suivant;

	/**
	 * Définir le maillon s'éxécutant après celui-ci
	 * @param s
	 */
	public void setSuivant(T s) {
		this.suivant = s;
	}

	@Override
	public void lancer() {
		if (this.suivant != null) {
			this.suivant.lancer();
		}
	}
	
}