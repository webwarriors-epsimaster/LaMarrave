package fr.epsi.lamarrave.commandes;

import fr.epsi.lamarrave.personnages.Personnage;
import fr.epsi.lamarrave.utilitaires.Commande;

public class AttaqueCommande implements Commande {

    public Personnage attaquant;
    public Personnage défenseur;

    @Override
    public void lancer() {
        // L'attaquand attaque
        System.out.println(this.attaquant.getClass().getSimpleName()
                + " lance l'attaque : \""
                + this.attaquant.récupérerAttaque()
                + "\" et inflige "
                + this.attaquant.force + " aux points de vie de "
                + this.défenseur.getClass().getSimpleName());

        // Calcule des dommages
        int dommages = (this.attaquant.force - this.défenseur.armure);

        if (dommages > 0) {
            this.défenseur.vie = this.défenseur.vie - dommages;
        }
    }

}
