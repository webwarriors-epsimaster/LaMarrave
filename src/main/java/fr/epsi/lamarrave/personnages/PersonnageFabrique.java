package fr.epsi.lamarrave.personnages;

/**
 * Classe permettant de créer des adversaires et de fournir une méthodes pour en piocher de manière aléatoire
 */
public class PersonnageFabrique {

	/**
	 * @return
	 */
	public Adversaire créerAdversaire() {
		PascalBoyer pascalBoyer = this.créerPascalBoyer();
		SylvieMalezieu sylvieMalezieu = this.créerSylvieMalezieu();

		if (Math.random() >= 0.5) {
			return pascalBoyer;
		}

		return sylvieMalezieu;
	}

	/**
	 * @return
	 */
	public PascalBoyer créerPascalBoyer() {
		return new PascalBoyer();
	}

	/**
	 * @return
	 */
	public SylvieMalezieu créerSylvieMalezieu() {
		return new SylvieMalezieu();
	}

}