package fr.sdv.rgu.automates_example;

import fr.sdv.rgu.automates.JeuDeLaVie;

import java.util.concurrent.TimeUnit;

public class JeuDeLaVieClignotantExample {

    public static void main(String[] args) throws InterruptedException {

        JeuDeLaVie clignotantFigure = new JeuDeLaVie(10,10);

        System.out.println("TEST : LE CLIGNOTANT (Oscillateur)");
        // Test : Le clignotant
        // on créer des cellules vivantes
        clignotantFigure.setAlive(3,4);
        clignotantFigure.setAlive(4,4);
        clignotantFigure.setAlive(5,4);

        int numberOperation = 5;
        for (int i = 0; i< numberOperation; i++){
            System.out.println("Operation " + i);
            clignotantFigure.printGrid();
            clignotantFigure.operation();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
