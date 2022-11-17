# Jeu de la Vie en JAVA

Creation d'un automate cellulaire ayant une structure bidimensionnelle représentant des cellules.
- Un X marque l'epmlacement d'une cellule
- Un | délimite les cellules

Le jeu de la vie est un simple jeu de simulation au sens mathématique.
Il suit 4 règles : 
  - 1) Chaque cellule ayant deux cellules adjacentes survit à la génération suivante.
  - 2) Chaque cellule ayant quatre cellules adjacentes ou plus disparaît, ou meurt, par surpopulation à la génération suivante.
  - 3) Chaque cellule ayant strictement moins de 2 cellules adjacentes meurt d'isolement à la génération suivante.
  - 4) Si un emplacement a exactement trois cellules adjacentes alors une cellule nait à cet emplacement à la génération suivante.

## Contenu du repository : 

Le dossier ```src``` contient 1 dossier principal contenant tout le fonctionnement du Jeu de la Vie et 1 dossier ```test``` contentant tout les tests du Jeu de la Vie.
```
src
│
└───main
│   │
│   └───java
│   
└───test
    │
    └───java
```

## Lancement du jeu

Pour lancer le jeu, il suffit d'executer la classe ```MainJeuDeLaVie``` puis un menu apparait afin de chosir le mode de jeu (aléatoire ou a partir d'un modele).

La classe principale créant la grille, les cellules et le jeu est la classe ```JeuDeLaVie```.
Ces deux classes se trouvant dans le package ```src\main\java\fr\sdv\rgu\automates```.

Le package ```src\main\java\fr\sdv\rgu\automates_example``` contient différentes classes permettant de tester des figures de type oscillateurs ou vaisseaux.



[Ryan Guillerm](https://github.com/Ryan-prog-s) --- :school: Sup de Vinci / :office: Nokia
