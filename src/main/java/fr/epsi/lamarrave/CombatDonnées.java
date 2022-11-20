package fr.epsi.lamarrave;

import java.util.*;

/**
 * Stock les informations d'un combat pour les classes "TourCombat" et "AttaqueCommande"
 */
public class CombatDonnées {

	/**
	 * Default constructor
	 */
	public CombatDonnées() {
	}

	/**
	 * Adversaire opposant le héro pendant un combat (si non-défini, alors doit être tiré aléatoirement)
	 */
	public Adversaire adversaire;

	/**
	 * 
	 */
	public Personnage attaquant;

}