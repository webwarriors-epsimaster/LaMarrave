package fr.epsi.lamarrave.commandes;

import fr.epsi.lamarrave.Main;
import fr.epsi.lamarrave.personnages.Hero;
import fr.epsi.lamarrave.utilitaires.Commande;

import java.util.Scanner;

/**
 * 
 */
public class VictoireCommande implements Commande {

	/**
	 * Default constructor
	 */
	public VictoireCommande() {
	}

	/**
	 * Héro récupéré depuis le Singleton
	 */
	private Hero héro;

	@Override
	public void lancer() {
		if(Main.NB_TOURS >= 20){
			// Le héro a gagné la partie
			System.out.println("Bravo ! Tu a gagné la partie en résistant aux 20 tours !");
		}
	}

}