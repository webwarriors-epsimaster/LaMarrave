package fr.epsi.lamarrave;

import fr.epsi.lamarrave.commandes.CommandeObservable;
import fr.epsi.lamarrave.tours.TourFabrique;

/**
 * Hello world!
 *
 */
public class Main {
    public static int NB_TOURS = 0;

    public static void main( String[] args ) {
        new TourFabrique().créerTour().lancer();
    }
}
