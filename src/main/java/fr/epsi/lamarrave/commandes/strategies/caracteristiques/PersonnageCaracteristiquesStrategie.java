package fr.epsi.lamarrave.commandes.strategies.caracteristiques;

import fr.epsi.lamarrave.personnages.Personnage;

public interface PersonnageCaracteristiquesStrategie {
    public void executer(Personnage personnage, int nbPoints);
}
