package fr.sdv.rgu.automates;

import java.util.Scanner;
public class MenuJeuDeLaVie {

    /**
     * Menu du jeu permettant de choisir un mode aleatoire ou a partir d'un modele
     * @return entier
     */
    public static int menu(){
        int userChoice;

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Entrez votre nom d'utilisateur :");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Bienvenu " + userName + " dans le Jeu de la Vie !");  // Output user input

        Scanner choice = new Scanner(System.in);
        System.out.println("Choisissez le mode de jeu : ");
        System.out.println("1 => Aléatoire");
        System.out.println("2 => \"Clignotant\" (Oscillateur)");
        System.out.println("3 => \"Crapaud\" (Oscillateur)");
        System.out.println("4 => \"Planeur\" (Vaisseaux)");

        userChoice = choice.nextInt();

        return userChoice;
    }

}
