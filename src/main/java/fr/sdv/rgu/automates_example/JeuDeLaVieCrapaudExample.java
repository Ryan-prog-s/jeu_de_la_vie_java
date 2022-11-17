package fr.sdv.rgu.automates_example;

import fr.sdv.rgu.automates.JeuDeLaVie;

import java.util.concurrent.TimeUnit;

public class JeuDeLaVieCrapaudExample {

    public static void main(String[] args) throws InterruptedException {
        JeuDeLaVie crapaudFigure = new JeuDeLaVie(10,10);
        System.out.println("TEST : LE CRAPAUD (Oscillateur)");
        // Test: Le crapaud
        // on créer des cellules vivantes
        crapaudFigure.setAlive(2,2);
        crapaudFigure.setAlive(3,2);
        crapaudFigure.setAlive(4,2);
        crapaudFigure.setAlive(3,3);
        crapaudFigure.setAlive(4,3);
        crapaudFigure.setAlive(5,3);

        int numberOperation = 5;
        for (int i = 0; i< numberOperation; i++){
            System.out.println("Operation " + i);
            crapaudFigure.printGrid();
            crapaudFigure.operation();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
