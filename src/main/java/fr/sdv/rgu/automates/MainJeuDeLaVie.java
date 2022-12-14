package fr.sdv.rgu.automates;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static fr.sdv.rgu.automates.MenuJeuDeLaVie.menu;
import static java.lang.System.exit;

public class MainJeuDeLaVie {
    public static void main(String[] args) throws InterruptedException {

        // Nombre de lignes de la grille
        int numberRows = 8;
        // Nombre de colonnes de la grille
        int numberCols = 8;

        // Creation d'une grille
        JeuDeLaVie currentFigure = new JeuDeLaVie(numberRows, numberCols);

        // Affichage du menu
        int userChoice;
        userChoice = menu();

        // switch permettant d'executer le choix de l'utilisateur
        switch (userChoice) {
            case 1:
                // Random cells
                int minX = 0;
                int maxY = currentFigure.getCol() -1;
                int cellsNumber = 10;
                for (int i = 0; i< cellsNumber; i++){
                    Random random = new Random();
                    int randomX = random.nextInt(maxY + 1 - minX) + minX;
                    int randomY = random.nextInt(maxY + 1 - minX) + minX;
                    currentFigure.setAlive(randomX,randomY);
                }
                break;
            case 2:
                // Figure clignotant
                currentFigure.setAlive(3,4);
                currentFigure.setAlive(4,4);
                currentFigure.setAlive(5,4);
                break;
            case 3:
                // Figure crapaud
                currentFigure.setAlive(2,2);
                currentFigure.setAlive(3,2);
                currentFigure.setAlive(4,2);
                currentFigure.setAlive(3,3);
                currentFigure.setAlive(4,3);
                currentFigure.setAlive(5,3);
                break;
            case 4:
                // Figure planeur
                currentFigure.setAlive(3,2);
                currentFigure.setAlive(4,3);
                currentFigure.setAlive(2,4);
                currentFigure.setAlive(3,4);
                currentFigure.setAlive(4,4);
                break;
            default:
                // Choice de l'utilisateur pas bon
                exit(0);
        }

        //Nombre d'operation a effectuer
        int numberOperation = 5;
        for (int i = 0; i< numberOperation; i++){
            System.out.println("Operation " + i);
            //Affichage de la grille
            currentFigure.printGrid();
            //Operation suivant les regles du jeu
            currentFigure.operation();
            TimeUnit.SECONDS.sleep(1);
        }

    }
}
