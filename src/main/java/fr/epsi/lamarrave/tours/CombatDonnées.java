package fr.epsi.lamarrave.tours;

import fr.epsi.lamarrave.personnages.Adversaire;
import fr.epsi.lamarrave.personnages.Personnage;
import fr.epsi.lamarrave.personnages.PersonnageFabrique;

/**
 * Stock les informations d'un combat pour les classes "TourCombat" et "AttaqueCommande"
 */
public class CombatDonnées {

	/**
	 * Adversaire opposant le héro pendant un combat (si non-défini, alors doit être tiré aléatoirement)
	 */
	public Adversaire adversaire;

	/**
	 * Personnage désigné comme attaquant
	 */
	public Personnage attaquant;

}