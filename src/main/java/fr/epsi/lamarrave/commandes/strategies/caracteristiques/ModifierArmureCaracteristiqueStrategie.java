package fr.epsi.lamarrave.commandes.strategies.caracteristiques;

import fr.epsi.lamarrave.personnages.Personnage;

public class ModifierArmureCaracteristiqueStrategie implements PersonnageCaracteristiquesStrategie{

    @Override
    public void executer(Personnage personnage, int nbPoints) {
        personnage.armure += nbPoints;
    }
}
