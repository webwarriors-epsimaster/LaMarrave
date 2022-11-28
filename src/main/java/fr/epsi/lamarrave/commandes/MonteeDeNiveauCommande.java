package fr.epsi.lamarrave.commandes;

import fr.epsi.lamarrave.commandes.enums.ChoixCaracteristiquesEnum;
import fr.epsi.lamarrave.personnages.Hero;
import fr.epsi.lamarrave.utilitaires.Commande;
import fr.epsi.lamarrave.utilitaires.Singleton;

import java.util.Objects;
import java.util.Scanner;

/**
 * 
 */
public class MonteeDeNiveauCommande implements Commande {

	/**
	 * Default constructor
	 */
	public MonteeDeNiveauCommande() {
		this.hero = Singleton.recupererHero();
	}

	/**
	 * Héro récupéré depuis le Singleton
	 */
	private final Hero hero;

	private final Commande commande = new AjoutDeCaracteristiquesCommande(3);

	@Override
	public void lancer() {
		hero.niveau += 1;
		System.out.println("Niveau supérieur !");
		commande.lancer();
	}

}