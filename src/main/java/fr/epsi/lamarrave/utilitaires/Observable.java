package fr.epsi.lamarrave.utilitaires;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    List<IObservateur> listeners = new ArrayList<IObservateur>();

    public void souscrire(IObservateur listener) {
        listeners.add(listener);
    }

    public void desabonner(IObservateur listener) {
        listeners.add(listener);
    }

    public void notifierLesObservateurs() {
        for (IObservateur listener : listeners) {
            listener.notifier();
        }
    }
}
