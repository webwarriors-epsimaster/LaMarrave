package fr.epsi.lamarrave.commandes.enums;

import fr.epsi.lamarrave.commandes.strategies.caracteristiques.ModifierArmureCaracteristiqueStrategie;
import fr.epsi.lamarrave.commandes.strategies.caracteristiques.ModifierForceCaracteristiqueStrategie;
import fr.epsi.lamarrave.commandes.strategies.caracteristiques.ModifierVieMaximumCaracteristiqueStrategie;
import fr.epsi.lamarrave.commandes.strategies.caracteristiques.PersonnageCaracteristiquesStrategie;
import fr.epsi.lamarrave.personnages.Hero;

import java.util.function.Function;

public enum ChoixCaracteristiquesEnum {
    ARMURE(new ModifierArmureCaracteristiqueStrategie(), "ARMURE"),
    PTS_VIE_MAX(new ModifierVieMaximumCaracteristiqueStrategie(), "POINTS DE VIE MAXIMUM"),
    FORCE(new ModifierForceCaracteristiqueStrategie(), "FORCE");

    private PersonnageCaracteristiquesStrategie strategie;
    private String libelle;

    private static final ChoixCaracteristiquesEnum[] values = values();

    ChoixCaracteristiquesEnum(PersonnageCaracteristiquesStrategie strategie, String libelle) {
        this.strategie = strategie;
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getNumeroDuChoix() {
        return this.ordinal() + 1;
    }

    public static ChoixCaracteristiquesEnum getEnumParChoixNumeroCaracteristique(int numeroCaracteristique){
        //Mise à l'échelle du numéro de caractéristique car un array commence à 0 !
        numeroCaracteristique -= 1;

        if(numeroCaracteristique > values().length || numeroCaracteristique < 0){
            return null;
        }
        
        return values()[numeroCaracteristique];
    }

    public void ajouterPoints(Hero hero, int nbPoints){
        this.strategie.executer(hero, nbPoints);
    }

}
