package fr.epsi.lamarrave;

/**
 * Dérivé du patron de conception "Commande" permettant de séparer le traitement de son contexte
 */
public interface Commande {

	/**
	 * @param parametres
	 */
	public void lancer(Object parametres);

}