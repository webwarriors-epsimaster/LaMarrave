package fr.epsi.lamarrave.tours;

import java.util.Random;

/**
 * 
 */
public class TourFabrique {

	/**
	 * Default constructor
	 */
	public TourFabrique() {
	}

	/**
	 * Renvoie un "Tour" aléatoire parmi les différentes classes héritantes.
	 * @return
	 */
	public Tour créerTour() {
		CombatTour combatTour = this.créerCombatTour();
		MerlinTour merlinTour = this.créerMerlinTour();
		MaitreArmeTour maitreArmeTour = this.créerMaitreArmeTour();
		
		int probabilités = combatTour.chance + merlinTour.chance + maitreArmeTour.chance;
		int aléatoire = new Random().nextInt(probabilités);

		if (aléatoire < combatTour.chance) {
			return combatTour;
		} else if (aléatoire < combatTour.chance + merlinTour.chance) {
			return merlinTour;
		} else {
			return maitreArmeTour;
		}
	}

	/**
	 * @return
	 */
	public MaitreArmeTour créerMaitreArmeTour() {
		return new MaitreArmeTour();
	}

	/**
	 * @return
	 */
	public MerlinTour créerMerlinTour() {
		return new MerlinTour();
	}

	/**
	 * @return
	 */
	public CombatTour créerCombatTour() {
		return new CombatTour();
	}

}