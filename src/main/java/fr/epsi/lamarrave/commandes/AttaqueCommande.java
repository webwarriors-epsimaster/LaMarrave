package fr.epsi.lamarrave.commandes;

import fr.epsi.lamarrave.tours.CombatDonnées;
import fr.epsi.lamarrave.utilitaires.Commande;

/**
 * 
 */
public class AttaqueCommande implements Commande {

	/**
	 * Default constructor
	 */
	public AttaqueCommande() {
	}

	/**
	 * Données permettant le déroulement d'une confrontation
	 */
	public CombatDonnées donnéesDuCombat;

	/**
	 * @param parametres
	 */
	public void lancer() {
		// Début de l'attaque...

		// Si aucun adversaire n'est désigné, alors faire :
		// ∟ désigner un adversaire au hasard

		// Si aucun attaquand n'est désigné, alors faire :
		// ∟ désigner un attaquant au hasard entre le héro et l'adversaire

		// L'attaquand attaque

		// ...Fin de l'attaque
	}

}