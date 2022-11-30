package fr.epsi.lamarrave.utilitaires;

/**
 * Provient du patron de conception du même nom permettant d'observer un autre
 * objet et de réagir en fonction de ses modifications
 */
public interface IObservateur {
    /**
     * Prévenir à l'observateur qu'un changement a eu lieu
     */
    public void notifier();
}
