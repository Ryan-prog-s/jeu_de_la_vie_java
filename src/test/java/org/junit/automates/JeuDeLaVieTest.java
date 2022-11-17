package org.junit.automates;

import fr.sdv.rgu.automates.JeuDeLaVie;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class JeuDeLaVieTest {

    /**
     * Test le constructeur de la classe
     */
    @Test
    public void testJeuDeLaVie() {
        try {
            new JeuDeLaVie(10, 10);
            new JeuDeLaVie(0, 10);
            new JeuDeLaVie(15, 12);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /**
     * Test la grille
     */
    @Test
    public void testGrid(){
        try {
            JeuDeLaVie testFigure = new JeuDeLaVie(4,4);
            testFigure.printGrid();
        }
        catch(Exception e){
            fail(e.getMessage());
        }
    }

    /**
     * Test de la methode getRow
     */
    @Test
    public void testGetRow(){
        JeuDeLaVie testFigure = new JeuDeLaVie(10,10);
        int rowValue = testFigure.getRow();
        Assert.assertEquals(10, rowValue);
    }

    /**
     * Test de la methode getCol
     */
    @Test
    public void testGetCol(){
        JeuDeLaVie testFigure = new JeuDeLaVie(10,5);
        int colValue = testFigure.getCol();
        Assert.assertEquals(5, colValue);
    }

    //Liste des regles :
    /*
        => Regle 1 : si la cellule a moins de 2 voisins => elle meurt
        => Regle 2 : si la cellule possede 2 ou 3 voisins => elle reste en vie
        => Regle 3 : si la cellule a plus de 3 voisins => elle meurt
        => Regle 4 : si la cellule possède 3 voisins => elle nait
     */

    /**
     * Test Regle 1 : Test de la methode si une cellule meurt quand elle possede moins de 2 voisins
     */
    @Test
    public void test_si_cellule_meurt_quand_moins_de_2voisins(){
        JeuDeLaVie testFigure = new JeuDeLaVie(10,5);
        testFigure.setAlive(4,3);
        testFigure.operation(); // la cellule est seul, après l'operation elle devrait etre morte
        int testCellAlive = testFigure.ifCellIsAlive(4,3);
        Assert.assertEquals(0, testCellAlive);
    }

    /**
     * Test Regle 2 : Test de la methode si une cellule reste en vie quand elle possede 2 ou 3 voisins
     */
    @Test
    public void test_si_cellule_reste_en_vie_quand_2ou3voisins(){
        JeuDeLaVie testFigure = new JeuDeLaVie(10,5);
        testFigure.setAlive(3,3); //A
        testFigure.setAlive(4,3); //B
        testFigure.setAlive(5,3); //C
        testFigure.operation(); // après l'operation la cellule B devrait resté vivante, les autres etant morte (figure du clignotant)
        int testCellAlive = testFigure.ifCellIsAlive(4,3);
        Assert.assertEquals(1, testCellAlive);
    }

    /**
     * Test Regle 3 : Test de la methode si une cellule meurt si elle a plus de trois voisins
     */
    @Test
    public void test_si_cellule_meurt_quand_plus_de_3voisins(){
        JeuDeLaVie testFigure = new JeuDeLaVie(10,5);
        testFigure.setAlive(3,3); //A
        testFigure.setAlive(4,3); //B
        testFigure.setAlive(5,3); //C
        testFigure.setAlive(4,2); //D
        testFigure.setAlive(4,4); //E

        testFigure.operation(); // après l'operation la cellule B devrait mourir
        int testCellAlive = testFigure.ifCellIsAlive(4,3);
        Assert.assertEquals(0, testCellAlive);
    }

    /**
     * Test Regle 4 : Test de la methode si une cellule nait si elle possède trois voisins
     */
    @Test
    public void test_si_cellule_nait_si_possede_3voisins(){
        JeuDeLaVie testFigure = new JeuDeLaVie(10,5);

        //Figure du crapaud
        testFigure.setAlive(2,2); //A
        testFigure.setAlive(3,2); //B
        testFigure.setAlive(4,2); //C
        testFigure.setAlive(3,3); //D
        testFigure.setAlive(4,3); //E
        testFigure.setAlive(5,3); //F

        testFigure.operation(); // après l'operation la cellule G devrait naitre
        int testCellAlive = testFigure.ifCellIsAlive(2,3);
        Assert.assertEquals(1, testCellAlive);
    }

}