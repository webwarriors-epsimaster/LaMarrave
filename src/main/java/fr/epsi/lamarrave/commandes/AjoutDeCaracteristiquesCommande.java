package fr.epsi.lamarrave.commandes;

import fr.epsi.lamarrave.commandes.enums.ChoixCaracteristiquesEnum;
import fr.epsi.lamarrave.personnages.Hero;
import fr.epsi.lamarrave.utilitaires.Commande;
import fr.epsi.lamarrave.utilitaires.Singleton;

import java.util.Scanner;

public class AjoutDeCaracteristiquesCommande implements Commande {

    private final Hero hero;
    private int nbPointsDisponibles;

    private final Scanner scanner = new Scanner(System.in);

    public AjoutDeCaracteristiquesCommande(int nbPointsDisponibles) {
        this.nbPointsDisponibles = nbPointsDisponibles;
        this.hero = Singleton.recupererHero();
    }

    @Override
    public void lancer() {
        demandeAttributionDePointsAuTerminal();
    }

    private void demandeAttributionDePointsAuTerminal(){
        this.genererPhraseChoix();
        int numeroDuChoixUtilisateur = scanner.nextInt();
        this.attributionPointsDeCaracteristiques(numeroDuChoixUtilisateur);

        //Relance la méthode récursivement jusqu'à que l'utilisateur consomme tout ses points de caracteristiques disponibles
        if(this.nbPointsDisponibles > 0){
            demandeAttributionDePointsAuTerminal();
        }
    }

    private void genererPhraseChoix(){
        System.out.println(String.format("Vous avez %s point(s) à répartir", this.nbPointsDisponibles));
        System.out.println("Choisissez une des caractéristiques suivantes en écrivant le chiffre correspondant :");

        for(ChoixCaracteristiquesEnum enumValue: ChoixCaracteristiquesEnum.values()){
            System.out.println(String.format("%s -> %s", enumValue.getNumeroDuChoix(), enumValue.getLibelle()));
        }
    }

    private void attributionPointsDeCaracteristiques(int numeroCaracteristique){
        ChoixCaracteristiquesEnum choixCaracteristiquesEnum = ChoixCaracteristiquesEnum.getEnumParChoixNumeroCaracteristique(numeroCaracteristique);

        if(choixCaracteristiquesEnum != null){
            choixCaracteristiquesEnum.ajouterPoints(hero, 1);
            nbPointsDisponibles--;
        }

    }
}
