package fr.epsi.lamarrave.tours;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TourFabriqueTest {
    @Test
    public void testCréerCombatTour() {
        TourFabrique fabrique = new TourFabrique();
        assertTrue(fabrique.créerCombatTour() instanceof CombatTour);
    }

    @Test
    public void testCréerMaitreArmeTour() {
        TourFabrique fabrique = new TourFabrique();
        assertTrue(fabrique.créerMaitreArmeTour()instanceof MaitreArmeTour);
    }

    @Test
    public void testCréerMerlinTour() {
        TourFabrique fabrique = new TourFabrique();
        assertTrue(fabrique.créerMerlinTour() instanceof MerlinTour);
    }

    @Test
    public void testCréerTour() {
        TourFabrique fabrique = new TourFabrique();
        List<Tour> toursGénérés = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            toursGénérés.add(fabrique.créerTour());
        }

        System.out.print(Arrays.toString(toursGénérés.toArray()));

        boolean contientUnCombatTour = false;
        boolean contientUnMerlinTour = false;
        boolean contientUnMaitreArmeTour = false;

        for (Tour tour : toursGénérés) {
            if (tour instanceof CombatTour) {
                contientUnCombatTour = true;
            } else if (tour instanceof MerlinTour) {
                contientUnMerlinTour = true;
            } else if (tour instanceof MaitreArmeTour) {
                contientUnMaitreArmeTour = true;
            }
        }

        assertTrue(contientUnCombatTour && contientUnMerlinTour && contientUnMaitreArmeTour);
    }
}
