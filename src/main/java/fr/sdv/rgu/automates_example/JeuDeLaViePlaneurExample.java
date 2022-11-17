package fr.sdv.rgu.automates_example;

import fr.sdv.rgu.automates.JeuDeLaVie;

import java.util.concurrent.TimeUnit;

public class JeuDeLaViePlaneurExample {

    public static void main(String[] args) throws InterruptedException {
        JeuDeLaVie planeurFigure = new JeuDeLaVie(10,10);
        System.out.println("TEST : LE PLANEUR (Vaisseaux)");
        // Test : Le planeur
        // on créer des cellules vivantes
        planeurFigure.setAlive(3,4);
        planeurFigure.setAlive(4,5);
        planeurFigure.setAlive(2,6);
        planeurFigure.setAlive(3,6);
        planeurFigure.setAlive(4,6);

        int numberOperation = 5;
        for (int i = 0; i< numberOperation; i++){
            System.out.println("Operation " + i);
            planeurFigure.printGrid();
            planeurFigure.operation();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}