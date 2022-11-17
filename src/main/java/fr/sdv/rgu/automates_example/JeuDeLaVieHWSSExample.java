package fr.sdv.rgu.automates_example;

import fr.sdv.rgu.automates.JeuDeLaVie;

import java.util.concurrent.TimeUnit;

public class JeuDeLaVieHWSSExample {
    public static void main(String[] args) throws InterruptedException {

        JeuDeLaVie hwssFigure = new JeuDeLaVie(16,16);
        System.out.println("TEST : LE PLANEUR (Vaisseaux)");
        // Test : Le planeur
        // on créer des cellules vivantes
        hwssFigure.setAlive(4,4);
        hwssFigure.setAlive(5,4);
        hwssFigure.setAlive(2,5);
        hwssFigure.setAlive(7,5);
        hwssFigure.setAlive(8,6);
        hwssFigure.setAlive(2,7);
        hwssFigure.setAlive(8,7);
        hwssFigure.setAlive(3,8);
        hwssFigure.setAlive(4,8);
        hwssFigure.setAlive(5,8);
        hwssFigure.setAlive(6,8);
        hwssFigure.setAlive(7,8);
        hwssFigure.setAlive(8,8);

        int numberOperation = 10;
        for (int i = 0; i< numberOperation; i++){
            System.out.println("Operation " + i);
            hwssFigure.printGrid();
            hwssFigure.operation();
            TimeUnit.MILLISECONDS.sleep(500);
        }
    }

}
