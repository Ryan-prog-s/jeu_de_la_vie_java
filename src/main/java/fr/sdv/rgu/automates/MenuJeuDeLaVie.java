package fr.sdv.rgu.automates;

import java.util.Scanner;
public class MenuJeuDeLaVie {

    /**
     * Menu du jeu permettant de choisir un mode aleatoire ou a partir d'un modele
     * @return entier
     */
    public static int menu(){
        int userChoice;

        Scanner user = new Scanner(System.in);  // Creation d'un scanner
        System.out.println("Entrez votre nom d'utilisateur :");

        String userName = user.nextLine();  // Lecture de ce qu'a renseigné l'utilisateur
        System.out.println("Bienvenu " + userName + " dans le Jeu de la Vie !");

        Scanner choice = new Scanner(System.in); //Creation d'un autre scanner
        // Affiche des choix des différents mode de jeu
        System.out.println("Choisissez le mode de jeu : ");
        System.out.println("1 => Aléatoire");
        System.out.println("2 => \"Clignotant\" (Oscillateur)");
        System.out.println("3 => \"Crapaud\" (Oscillateur)");
        System.out.println("4 => \"Planeur\" (Vaisseaux)");

        userChoice = choice.nextInt(); // Lecture du choix de l'utilisateur

        return userChoice;
    }

}
