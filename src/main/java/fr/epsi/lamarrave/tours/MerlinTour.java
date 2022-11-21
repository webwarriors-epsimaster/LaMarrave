package fr.epsi.lamarrave.tours;

import fr.epsi.lamarrave.personnages.Hero;
import fr.epsi.lamarrave.utilitaires.Singleton;

/**
 * Tour durant lequel le héro se voit être soigné par Merlin (voir la classe "SoinCommande")
 */
public class MerlinTour extends Tour {

	/**
	 * Default constructor
	 */
	public MerlinTour() {
	}

	@Override
	public void lancer() {


		// Le héro rencontre Merlin
		System.out.println("Bonjour jeune Padawan, ta voie tu trouveras !");
		System.out.println("Points de vie réstaurés");

		// Lancement de la commande
		this.soignerHero();

		// Lancer le tour suivant
		// ...Fin du tour
	}

	private void soignerHero(){
		Hero hero = Singleton.recupererHero();
		hero.vie = hero.vieMax;
	}

}