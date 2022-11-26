package fr.epsi.lamarrave.commandes.strategies.caracteristiques;

import fr.epsi.lamarrave.personnages.Personnage;

public class ModifierVieMaximumCaracteristiqueStrategie implements PersonnageCaracteristiquesStrategie{
    @Override
    public void executer(Personnage personnage, int nbPoints) {
        personnage.vieMax += nbPoints;
    }
}
