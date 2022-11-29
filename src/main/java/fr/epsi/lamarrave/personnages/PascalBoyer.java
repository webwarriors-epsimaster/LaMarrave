package fr.epsi.lamarrave.personnages;

/**
 * L'adversaire le plus chiant, dispose de la compétence "Tétrachiée"
 */
public class PascalBoyer extends Adversaire {

	/**
	 * Default constructor
	 */
	public PascalBoyer() {
		super();
		this.force += 10;
		this.vie += 30;
		this.vieMax = this.vie;
	}

	@Override
	public String récupérerAttaque() {
		return "Attaque tétrachiée !!";
	}

}