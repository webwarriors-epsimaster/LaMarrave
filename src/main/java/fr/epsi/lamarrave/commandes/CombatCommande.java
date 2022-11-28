package fr.epsi.lamarrave.commandes;

import java.util.Scanner;

import fr.epsi.lamarrave.personnages.Personnage;
import fr.epsi.lamarrave.personnages.PersonnageFabrique;
import fr.epsi.lamarrave.tours.CombatDonnées;
import fr.epsi.lamarrave.utilitaires.Commande;
import fr.epsi.lamarrave.utilitaires.Singleton;

/**
 * 
 */
public class CombatCommande implements Commande {

	/**
	 * Default constructor
	 */
	public CombatCommande(CombatDonnées donnéesDuCombat) {
		this.scanner = new Scanner(System.in);
		this.donnéesDuCombat = donnéesDuCombat;
	}

	private Scanner scanner;

	/**
	 * Données permettant le déroulement d'une confrontation
	 */
	public CombatDonnées donnéesDuCombat;

	/**
	 * @param parametres
	 */
	public void lancer() {
		// Si aucun adversaire n'est désigné, alors faire :
		// ∟ désigner un adversaire au hasard
		if (this.donnéesDuCombat.adversaire == null) {
			this.donnéesDuCombat.adversaire = new PersonnageFabrique().créerAdversaire();

			System.out.println("Vous tombez nez-à-nez avec "
					+ this.donnéesDuCombat.adversaire.getClass().getSimpleName());

			System.out.println("Continuer ?");
			scanner.nextLine();
		}

		// Si aucun attaquand n'est désigné, alors faire :
		// ∟ désigner un attaquant au hasard entre le héro et l'adversaire
		if (this.donnéesDuCombat.attaquant == null) {
			if (Math.random() < 0.5d) {
				this.donnéesDuCombat.attaquant = this.donnéesDuCombat.adversaire;

				System.out.println("C'est à "
						+ this.donnéesDuCombat.adversaire.getClass().getSimpleName()
						+ " de commencer");

				System.out.println("Continuer ?");
				scanner.nextLine();
			} else {
				this.donnéesDuCombat.attaquant = Singleton.recupererHero();

				System.out.println("C'est à vous de commencer");
				System.out.println("Continuer ?");
				scanner.nextLine();
			}
		}

		// Détermination du défenseur
		Personnage défenseur;

		if (this.donnéesDuCombat.attaquant == Singleton.recupererHero()) {
			défenseur = this.donnéesDuCombat.adversaire;
		} else {
			défenseur = Singleton.recupererHero();
		}

		// Lancement de la commande d'attaque
		AttaqueCommande attaqueCommande = new AttaqueCommande();
		attaqueCommande.défenseur = défenseur;
		attaqueCommande.attaquant = this.donnéesDuCombat.attaquant;
		attaqueCommande.lancer();

		// ...Fin de l'attaque
		System.out.println("Continuer ?");
		scanner.nextLine();
	}

}