package fr.epsi.lamarrave.personnages;

import java.util.Random;

/**
 * Classe permettant de créer des adversaires et de fournir une méthodes pour en piocher de manière aléatoire
 */
public class PersonnageFabrique {

	/**
	 * @return
	 */
	public Adversaire créerAdversaire() {
		Adversaire[] adversaires = new Adversaire[]{
			créerEtudiantEpsi(),
			créerPascalBoyer(),
			créerSylvieMalezieu(),
		};

		return adversaires[new Random().nextInt(adversaires.length)];
	}

	/**
	 * @return
	 */
	public EtudiantEpsi créerEtudiantEpsi() {
		return new EtudiantEpsi();
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