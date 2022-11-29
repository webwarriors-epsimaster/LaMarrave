package fr.epsi.lamarrave.personnages;

import java.util.Random;

public class EtudiantEpsi extends Adversaire {

    EtudiantEpsi() {
        this.vie = 10;
        this.armure = 5;
        this.force = 12;
        this.vieMax = this.vie;
    }

    @Override
    public String récupérerAttaque() {
        String[] punchlines = new String[] {
                "Euh, c'est quoi un Singleton ?",
                "Au fait, c'est quoi une classe ?",
                "Vous sauriez pas ce qu'est un VLAN par hasard ?",
                "J'ai pas signé",
                "Pourquoi vous dites qu'il y a des cons partout ?",
        };

        return punchlines[new Random().nextInt(punchlines.length)];
    }

}
