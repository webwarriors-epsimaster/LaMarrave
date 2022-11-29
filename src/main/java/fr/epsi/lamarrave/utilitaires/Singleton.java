package fr.epsi.lamarrave.utilitaires;

import fr.epsi.lamarrave.commandes.DefaiteCommande;
import fr.epsi.lamarrave.commandes.SoinCommande;
import fr.epsi.lamarrave.commandes.VictoireCommande;
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
	private static Commande defaiteCommande;
	private static Commande victoireCommande;

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

	public static Commande recupererDefaiteCommande() {
		if(defaiteCommande == null){
			defaiteCommande = new DefaiteCommande();
		}
		return defaiteCommande;
	}

	public static Commande recupererVictoireCommande() {
		if(victoireCommande == null){
			victoireCommande = new VictoireCommande();
		}
		return victoireCommande;
	}

}