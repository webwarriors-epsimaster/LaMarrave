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
	private Hero hero;
	private int nbDeCaracteristiquesDisponibles = 3;

	private Scanner scanner = new Scanner(System.in);

	@Override
	public void lancer() {
		hero.niveau += 1;
		System.out.println("Niveau supérieur !");
		demandeAttributionDePointsAuTerminal();
		// Le héro monte de niveau
	}

	private void demandeAttributionDePointsAuTerminal(){
		this.genererPhraseChoix();
		int numeroDuChoixUtilisateur = scanner.nextInt();
		this.attributionPointsDeCaracteristiques(numeroDuChoixUtilisateur);

		//Relance la méthode récursivement jusqu'à que l'utilisateur consomme tout ses points de caracteristiques disponibles
		if(this.nbDeCaracteristiquesDisponibles > 0){
			demandeAttributionDePointsAuTerminal();
		}
	}

	private void genererPhraseChoix(){
		System.out.println(String.format("Vous avez %s point(s) à répartir", this.nbDeCaracteristiquesDisponibles));
		System.out.println("Choisissez une des caractéristiques suivantes en écrivant le chiffre correspondant :");

		for(ChoixCaracteristiquesEnum enumValue: ChoixCaracteristiquesEnum.values()){
			System.out.println(String.format("%s -> %s", enumValue.getNumeroDuChoix(), enumValue.getLibelle()));
		}
	}

	private void attributionPointsDeCaracteristiques(int numeroCaracteristique){
		ChoixCaracteristiquesEnum choixCaracteristiquesEnum = ChoixCaracteristiquesEnum.getEnumParChoixNumeroCaracteristique(numeroCaracteristique);

		if(choixCaracteristiquesEnum != null){
			choixCaracteristiquesEnum.apply(1);
			nbDeCaracteristiquesDisponibles--;
		}

	}

}