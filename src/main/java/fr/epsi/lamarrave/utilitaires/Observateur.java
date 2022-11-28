package fr.epsi.lamarrave.utilitaires;

/**
 * Provient du patron de conception du même nom permettant d'observer un autre
 * objet et de réagir en fonction de ses modifications
 */
public interface Observateur {
    /**
     * Prévenir à l'observateur qu'un changement a eu lieu
     * @param data Objet permettant d'identifier quel évènement a eu lieu
     */
    public void update();
}
