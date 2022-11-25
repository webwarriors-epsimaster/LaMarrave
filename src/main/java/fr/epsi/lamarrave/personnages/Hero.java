package fr.epsi.lamarrave.personnages;

import java.util.ArrayList;

/**
 * Le personnage qu'incarne le joueur
 */
public class Hero extends Personnage {

	/**
	 * Default constructor
	 */
	public Hero() {
		this.vie = 100;
		this.vieMax = 100;
		this.armure = 10;
		this.niveau = 1;
		this.pointsExpérience = 0;
		this.observateurs = new ArrayList<>();
	}

	@Override
	public String récupérerAttaque() {
		return "Par le pouvoir du Crâne Ancestral !";
	}

}