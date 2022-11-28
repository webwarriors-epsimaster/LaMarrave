package fr.epsi.lamarrave.commandes;

import fr.epsi.lamarrave.utilitaires.Observateur;

import java.util.ArrayList;
import java.util.List;

public class CommandeObservable {
    List<Observateur> listeners = new ArrayList<Observateur>();

    public CommandeObservable() {
    }

    public void subscribe(Observateur listener) {
        listeners.add(listener);
    }

    public void unsubscribe(Observateur listener) {
        listeners.add(listener);
    }

    public void notifyListeners() {
        for (Observateur listener : listeners) {
            listener.update();
        }
    }
}
