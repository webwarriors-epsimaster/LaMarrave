package fr.epsi.lamarrave.commandes;

import fr.epsi.lamarrave.utilitaires.Observateur;

import java.util.ArrayList;
import java.util.List;

public class CommandeObservable {
    List<Observateur> listeners = new ArrayList<Observateur>();

    public void souscrire(Observateur listener) {
        listeners.add(listener);
    }

    public void desabonner(Observateur listener) {
        listeners.add(listener);
    }

    public void notifierLesObservateurs() {
        for (Observateur listener : listeners) {
            listener.update();
        }
    }
}
