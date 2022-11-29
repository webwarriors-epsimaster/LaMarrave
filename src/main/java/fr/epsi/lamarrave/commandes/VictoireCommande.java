package fr.epsi.lamarrave.commandes;

import fr.epsi.lamarrave.Main;
import fr.epsi.lamarrave.personnages.Hero;
import fr.epsi.lamarrave.utilitaires.Commande;
import fr.epsi.lamarrave.utilitaires.Observateur;

import java.util.Scanner;

/**
 * 
 */
public class VictoireCommande implements Commande, Observateur {

	/**
	 * Default constructor
	 */
	public VictoireCommande() {
	}

	@Override
	public void lancer() {
		if(Main.NB_TOURS >= 20){
			// Le héro a gagné la partie
			System.out.println("Bravo ! Tu a gagné la partie en résistant aux 20 tours !");
			System.exit(0);
		}
	}

	@Override
	public void update() {
		this.lancer();
	}
}