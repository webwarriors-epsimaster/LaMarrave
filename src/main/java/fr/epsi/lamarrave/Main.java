package fr.epsi.lamarrave;

import fr.epsi.lamarrave.commandes.AjoutDeCaracteristiquesCommande;
import fr.epsi.lamarrave.tours.TourFabrique;
import fr.epsi.lamarrave.utilitaires.Singleton;

/**
 * Hello world!
 *
 */
public class Main {
    public static int NB_TOURS = 0;

    public static void main( String[] args ) {
        System.out.println("Création de personnage :");
        new AjoutDeCaracteristiquesCommande(13).lancer();
        Singleton.recupererHero().vie = Singleton.recupererHero().vieMax;
        new TourFabrique().créerTour().lancer();
    }
}
