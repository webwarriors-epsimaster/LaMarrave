package fr.epsi.lamarrave.commandes.strategies.caracteristiques;

import fr.epsi.lamarrave.personnages.Personnage;

public interface IPersonnageCaracteristiquesStrategie {
    public void executer(Personnage personnage, int nbPoints);
}
