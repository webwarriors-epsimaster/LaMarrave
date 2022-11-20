package fr.epsi.lamarrave.tours;

/**
 * Tour opposant un attaquant et un défenseur choisi au hasard (s'il s'agit du
 * premier tour) entre le héro et un adversaire également tiré au hasard (s'il
 * s'agit du premier tour également) (voir la classe "AttaqueCommande")
 */
public class CombatTour extends Tour {

	/**
	 * Default constructor
	 */
	public CombatTour() {
	}

	/**
	 * Données permettant le déroulement d'une confrontation
	 */
	public CombatDonnées donnéesDuCombat;

	@Override
	public void lancer(Object parametres) {
		// Début du tour...
		
		// Créer une commande d'attaque
		// Lancement de la commande d'attaque

		// Créer un tour de combat dans lequel l'attaquant devient défenseur et inversement
		// Définir le tour comme étant le suivant
		// Si personne n'est vaincu, alors faire:
		// ∟ Lancer le tour suivant

		// ...Fin du tour
	}

}