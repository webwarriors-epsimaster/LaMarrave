package fr.epsi.lamarrave.commandes;

import fr.epsi.lamarrave.Main;
import fr.epsi.lamarrave.personnages.Hero;
import fr.epsi.lamarrave.utilitaires.ICommande;
import fr.epsi.lamarrave.utilitaires.IObservateur;

import java.util.Scanner;

/**
 * 
 */
public class VictoireCommande implements ICommande, IObservateur {

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
	public void notifier() {
		this.lancer();
	}
}