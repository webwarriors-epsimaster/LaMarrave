package fr.epsi.lamarrave.commandes;

import fr.epsi.lamarrave.personnages.Personnage;
import fr.epsi.lamarrave.utilitaires.ICommande;

public class AttaqueCommande implements ICommande {

    public Personnage attaquant;
    public Personnage défenseur;

    @Override
    public void lancer() {
        // Calcul des dommages
        int dommages = (this.attaquant.force - this.défenseur.armure);

        // L'attaquand attaque
        System.out.println(this.attaquant.getClass().getSimpleName()
                + " lance l'attaque : \""
                + this.attaquant.récupérerAttaque()
                + "\" et inflige "
                + dommages + " aux points de vie de "
                + this.défenseur.getClass().getSimpleName());

        if (dommages > 0) {
            this.défenseur.vie = this.défenseur.vie - dommages;
        }
        
        System.out.println(this.défenseur.getClass().getSimpleName() + " a " + this.défenseur.vie


        + " points de vie sur " + this.défenseur.vieMax);
    }

}
