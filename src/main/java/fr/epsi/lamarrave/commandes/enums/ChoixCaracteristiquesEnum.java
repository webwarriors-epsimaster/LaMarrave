package fr.epsi.lamarrave.commandes.enums;

import fr.epsi.lamarrave.utilitaires.Singleton;

import java.util.function.Function;

public enum ChoixCaracteristiquesEnum implements Function<Integer, Integer> {
    ARMURE((i -> Singleton.recupererHero().armure += (int)i), "ARMURE"),
    PTS_VIE_MAX((i -> Singleton.recupererHero().vieMax += (int)i), "POINTS DE VIE MAXIMUM"),
    FORCE((i -> Singleton.recupererHero().force += (int)i), "FORCE");

    private Function<Object, Integer> updateCaracteristique;
    private String libelle;

    private static final ChoixCaracteristiquesEnum[] values = values();

    ChoixCaracteristiquesEnum(Function<Object, Integer> updateCaracteristique, String libelle) {
        this.updateCaracteristique = updateCaracteristique;
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

    @Override
    public Integer apply(Integer i) {
        return this.updateCaracteristique.apply(i);
    }
}
