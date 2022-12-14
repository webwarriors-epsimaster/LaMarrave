# A la Marrave !

Créé par Elodie LABORDE, Sofiane NASRI, Maïn CHAABEN & Tristan MULLER

## Architecture applicative

### Diagramme de classes

![Diagramme de classes sur tableau](.docfiles/diagrammeDeClassesTableau.jpg)
![Diagramme de classes](.docfiles/diagrammeDeClasses.png)

### Diagramme de séquence
#### Diagramme de séquence concernant l'ajout de caractéristiques par l'utilisateur.
![Diagramme de séquence](.docfiles/diagramme_sequence_ajout_caracteristiques.png)


### Patrons de conceptions utilisés

- **Commande** : Patron de conception du même nom permettant de séparer le traitement de son contexte.
- **Maillon/Tour** : Nous avons utilisé le patron de conception "*Chaîne de responsabilité*" pour les tours.
- **Personnage/Tour-Fabrique** : Le patron de conception fabrique est utilisé ici pour tirer des personnages et des tours aléatoirement.
- **Singleton** : Patron de conception du même nom permettant dans notre cas à persister le personnage du héro dans le contexte d'execution de l'application.
- **Stratégie** : Utilisation du pattern "Stratégie" pour l'ajout de caractéristiques et ainsi executer la bonne stratégie en fonction du choix utilisateur.
## Implémentation

### Génération du code

Grâce au logiciel de conception "*StarUML*", nous avons pu générer les classes non-complétées à partir de notre diagramme de classes.

### Répartition des tâches

Les tâches restantes ont été distribué de manière aléatoire :

 - **Main** : Implémenter le Personnage, Implémenter la fabrique de personnages, Implémenter les données du combat, Implémenter la commande de soin
 - **Tristan** : Implémenter le Héro, Implémenter le Tour, Implémenter la fabrique de tours, Implémenter la commande d'attaque
 - **Elodie** : Implémenter SylvieMalzieu, Implémenter le tour du maitre d'arme, Implémenter le tour de combat, Implémenter la commande de défaite
 - **Sofiane** : Implémenter PascalBoyer, Implémenter le tour de Merlin, Implémenter la commande de victoire, Implémenter la commande de montée de niveau

## Post-implémentation

L'architecture a subit quelques modifications durant l'implémentation, nous avons rajouté de nouvelles classes pour répondre au mieux au besoin tout en gardant notre architecture de départ intacte.

![architecture-post-implémentation](.docfiles/postImplémentation.svg)