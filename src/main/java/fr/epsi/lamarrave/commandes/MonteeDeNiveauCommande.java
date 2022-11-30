package fr.epsi.lamarrave.commandes;

import fr.epsi.lamarrave.commandes.enums.ChoixCaracteristiquesEnum;
import fr.epsi.lamarrave.personnages.Hero;
import fr.epsi.lamarrave.utilitaires.ICommande;
import fr.epsi.lamarrave.utilitaires.Singleton;

import java.util.Objects;
import java.util.Scanner;

/**
 * 
 */
public class MonteeDeNiveauCommande implements ICommande {

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

	private final ICommande commande = new AjoutDeCaracteristiquesCommande(3);

	@Override
	public void lancer() {
		hero.niveau += 1;
		System.out.println("Niveau supérieur !");
		commande.lancer();
	}

}