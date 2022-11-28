package fr.epsi.lamarrave.personnages;

import java.util.*;

/**
 * Adversaire commun mais coriace
 */
public class SylvieMalezieu extends Adversaire {

	/**
	 * Default constructor
	 */
	public SylvieMalezieu() {
		this.force += 5;
		this.vie += 5;
		this.armure += 2;
	}

	@Override
	public String récupérerAttaque() {
		double taChance = Math.random()*10;
		if (taChance <7) {
			return sortCommun();
		}
		else if(taChance<9) {
			return sortCritique();
		}
		else return sortUltime();
	}
	
	public String sortCommun(){
		return "attaque commune vous n'aurez pas très mal";
	}
	public String sortCritique() {
		this.force += 10;
		return "attaque critique, tu n'as pas de chance";
	}
	public String sortUltime() {
		this.force += 15;
		return "attaque ultime, si tu survis pense à remercier les dieux";
	}

}