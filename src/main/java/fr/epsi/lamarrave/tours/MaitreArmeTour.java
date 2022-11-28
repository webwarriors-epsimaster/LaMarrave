package fr.epsi.lamarrave.tours;

import fr.epsi.lamarrave.commandes.MonteeDeNiveauCommande;
import fr.epsi.lamarrave.commandes.SoinCommande;
import fr.epsi.lamarrave.personnages.Hero;
import fr.epsi.lamarrave.utilitaires.Commande;
import fr.epsi.lamarrave.utilitaires.Singleton;

/**
 * Tour durant lequel le joueur monte d'un niveau grâce au maitre d'arme (voir la classe "CommandeMonteeDeNiveau")
 */
public class MaitreArmeTour extends Tour {
	private final Commande commande;

	/**
	 * Default constructor
	 */
	public MaitreArmeTour() {
		this.commande = new MonteeDeNiveauCommande();
	}

	@Override
	public void lancer() {
		// Le héro rencontre  le maitre d'arme
		System.out.println("*insulte*, fdp !");

		// Lancement de la commande
		this.commande.lancer();

		// Créer le tour suivant
		créerTourSuivant();

		// Lancer le tour suivant
		this.suivant.lancer();
	}
}