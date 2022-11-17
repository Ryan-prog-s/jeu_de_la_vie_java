package fr.sdv.rgu.automates;

/**
 * @author Ryan Guillerm
 */

public class JeuDeLaVie {

    /** row : ligne de la grille */
    private int row;
    /** col : colonne de la grille */
    private int col;
    /** grid : grille du jeu correspondant a un tableau a deux dimensions */
    private int [][]grid;

    /**
     * Constructeur JeuDeLaVie prenant en paramètre une ligne (row) et une colonne (col) permettant de créer une grille
     * @param row entier
     * @param col entier
     */
    public JeuDeLaVie(int row, int col) {
        this.row = row;
        this.col = col;

        this.grid = new int [row][col];
    }

    /**
     * Recupere la ligne de la grille
     * @return int
     */
    public int getRow() {
        return row;
    }

    /**
     * Recupere la colonne de la grille
     * @return int
     */
    public int getCol() {
        return col;
    }

    /**
     * Affiche la grille courante
     */
    public void printGrid(){
        for (int y = 0; y <  col ; y++) {
            String line = " | ";
            for (int x = 0; x < row; x++) {
                if(this.grid[x][y] == 0){
                    line += " | ";
                }else {
                    line += " X ";
                }
            }
            line += " | ";
            System.out.println(line);
        }
        System.out.println("\n");
    }

    /**
     * Créer une cellule en l'indiquant en vie sur l'axe des x et l'axe des y
     * @param x entier x
     * @param y entier y
     */
    public void setAlive(int x, int y){
        this.grid[x][y] = 1;
    }

    /**
     * Compte les voisins d'une cellule en vie
     * @param x entier x
     * @param y entier y
     * @return int
     */
    public int countNeighborAlive(int x, int y){
        int count = 0;

        count += ifCellIsAlive(x-1, y-1);
        count += ifCellIsAlive(x,y-1);
        count += ifCellIsAlive(x+1,y-1);

        count += ifCellIsAlive(x-1,y);
        count += ifCellIsAlive(x+1,y);

        count += ifCellIsAlive(x-1,y+1);
        count += ifCellIsAlive(x,y+1);
        count += ifCellIsAlive(x+1,y+1);

        return count;
    }

    /**
     * Test si une cellule est en vie => return 0 si mort ou return 1 si vivante
     * @param x entier x
     * @param y entier y
     * @return int
     */
    public int ifCellIsAlive(int x, int y){
        //
        if (x < 0 || x>= row || y < 0 || y >= col){
            return 0;
        }
        return this.grid[x][y];
    }

    /**
     * Effectue les opérations nécessaires pour suivre les 4 règles du Jeu De La Vie
     */
    public void operation(){
        int [][] newGrid = new int [row][col]; //après chaque operation : on recreer une grille

        for (int y = 0; y <  col ; y++) {
            for (int x = 0; x < row; x++) {
                int aliveNeighbours = countNeighborAlive(x, y);
                // si la cellule est en vie
                if (ifCellIsAlive(x,y) == 1){
                    // REGLE 1 : si la cellule a moins de 2 voisins => elle meurt
                    if (aliveNeighbours < 2){
                        newGrid[x][y]  = 0;
                    }
                    // REGLE 2 : si la cellule possede 2 ou 3 voisins => elle reste en vie
                    else if (aliveNeighbours == 2 || aliveNeighbours == 3){
                        newGrid[x][y]  = 1;
                        // REGLE 3 : si la cellule a plus de 3 voisins => elle meurt
                    } else{
                        newGrid[x][y]  = 0;
                    }
                // si la cellule n'existe pas ou est morte
                }else {
                    // REGLE 4 : si la cellule possède 3 voisins => elle nait
                    if (aliveNeighbours == 3){
                        newGrid[x][y]  = 1;
                    }
                }
            }
        }

        this.grid = newGrid;
    }
}
