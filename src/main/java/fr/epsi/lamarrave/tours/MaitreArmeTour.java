package fr.epsi.lamarrave.tours;

import fr.epsi.lamarrave.commandes.MonteeDeNiveauCommande;
import fr.epsi.lamarrave.utilitaires.ICommande;

/**
 * Tour durant lequel le joueur monte d'un niveau grâce au maitre d'arme (voir la classe "CommandeMonteeDeNiveau")
 */
public class MaitreArmeTour extends Tour {
	private final ICommande commande;

	/**
	 * Default constructor
	 */
	public MaitreArmeTour() {
		super();
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