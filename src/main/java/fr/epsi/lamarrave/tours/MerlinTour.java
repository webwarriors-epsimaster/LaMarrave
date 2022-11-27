package fr.epsi.lamarrave.tours;

import fr.epsi.lamarrave.personnages.Hero;
import fr.epsi.lamarrave.utilitaires.Singleton;

/**
 * Tour durant lequel le héro se voit être soigné par Merlin (voir la classe "SoinCommande")
 */
public class MerlinTour extends Tour {


	private final Hero hero;
	private final TourFabrique factory;

	/**
	 * Default constructor
	 */
	public MerlinTour() {
		this.hero = Singleton.recupererHero();
		this.factory = new TourFabrique();
	}

	@Override
	public void lancer() {


		// Le héro rencontre Merlin
		System.out.println("Bonjour jeune Padawan, ta voie tu trouveras !");

		// Lancement de la commande
		this.soignerHero();

		// Lancer le tour suivant
		this.setSuivant(factory.créerTour());
		this.suivant.lancer();

	}

	private void soignerHero(){
		final int pointsDeVieRestaures = hero.vieMax - hero.vie;

		hero.vie = hero.vieMax;
		System.out.println(String.format("Points de vie réstaurés", pointsDeVieRestaures));
	}

}