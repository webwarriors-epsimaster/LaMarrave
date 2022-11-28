package fr.epsi.lamarrave.tours;

import fr.epsi.lamarrave.commandes.CombatCommande;
import fr.epsi.lamarrave.utilitaires.Singleton;

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
		this.donnéesDuCombat = new CombatDonnées();
	}

	/**
	 * Données permettant le déroulement d'une confrontation
	 */
	public CombatDonnées donnéesDuCombat;

	@Override
	public void lancer() {
		// Créer une commande de combat
		CombatCommande combatCommande = new CombatCommande(donnéesDuCombat);

		// Lancement de la commande de combat
		combatCommande.lancer();

		if (this.donnéesDuCombat.adversaire.vie > 0) {
			// Créer un tour de combat
			CombatTour combatTour = new CombatTour();
			combatTour.donnéesDuCombat.adversaire = this.donnéesDuCombat.adversaire;

			// L'attaquant devient défenseur et inversement
			combatTour.donnéesDuCombat.attaquant = donnéesDuCombat.attaquant == donnéesDuCombat.adversaire
					? Singleton.recupererHero()
					: donnéesDuCombat.adversaire;

			// Définir le tour comme étant le suivant
			setSuivant(combatTour);

			// Lancer le tour suivant
			lancer();
		} else {
			// Créer le tour suivant
			créerTourSuivant();

			// Lancer le tour suivant
			lancer();
		}
	}

}