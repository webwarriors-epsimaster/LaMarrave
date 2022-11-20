package fr.epsi.lamarrave;

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
	private static Singleton instance;


	/**
	 * Renvoie le singleton persisté
	 * @return
	 */
	public static Singleton recupererInstance() {
		// TODO implement here
		return null;
	}

}