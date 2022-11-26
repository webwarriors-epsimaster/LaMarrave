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
	}

	@Override
	public String récupérerAttaque() {
		return "Attaque tétrachiée !!";
	}

}