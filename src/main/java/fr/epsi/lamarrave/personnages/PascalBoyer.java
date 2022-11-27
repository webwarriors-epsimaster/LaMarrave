package fr.epsi.lamarrave.personnages;

import java.util.*;

/**
 * L'adversaire le plus chiant, dispose de la compétence "Tétrachiée"
 */
public class PascalBoyer extends Adversaire {

	/**
	 * Default constructor
	 */
	public PascalBoyer() {
		this.force += 10;
		this.vie += 10;
		this.armure += 4;
	}

	@Override
	public String récupérerAttaque() {
		return "Attaque tétrachiée !!";
	}

}