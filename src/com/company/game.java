package com.company;

import java.util.Scanner;
public class game {

    /**
     * Demande à l'utilisateur de choisir son pseudo
     * @return le pseudo du joueur (String)
     */
    public static String Joueurs(){
        Scanner player = new Scanner(System.in);

        String joueur = player.next();
        return joueur;
    }

    /**
     * Choisis quel joueur va jouer en premier, de façon aléatoire
     * @param pseudo1
     * @param pseudo2
     */
    public static void premierAleatoire(String pseudo1, String pseudo2){
        int min = 0; int max = 2;

        int aleatoire = (int)(Math.random()*(min-max))+max;

        if(aleatoire == 1){
            System.out.println("C'est à "+pseudo1+" de jouer en premier");
        }else {
            System.out.println("C'est à "+pseudo2+" de jouer en premier");
        }

    }

    /**
     * Place les joueurs en fonction des coordonnées x et y reçues en paramètre
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return le tableau avec les valeurs
     */
    public static String[][] fontionPlateau(int x1, int y1, int x2,int y2){
        String[][] plateau = new String[10][11];
        int i; int j;

        for (i=0;i<10;i++){
            for (j=0;j<11;j++){
                plateau[i][j] = "☐ ";
            }
        }
        plateau[x1][y1] = "X ";
        plateau[x2][y2] = "O ";

        affichagePlateau(plateau);
        return plateau;
    }

    /**
     * Affichage du plateau en paramètre, reçu de fontionPlateau
     * @param plateau
     */
    public static void affichagePlateau(String[][] plateau){

        for (int i=0;i<10;i++){
            for (int j=0;j<11;j++){
                System.out.print(plateau[i][j]);
            }
            System.out.println();
        }
    }


    /**
     * Permet de vérifier les cases autour des deux joueurs
     * pour savoir s'il est bloqué ou non
     * @param Plateau
     * @return un boolean. true = joueur bloqué.
     */
    public static boolean estBloque(String[][] Plateau) {

        boolean bloque = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 11; j++) {
                if (Plateau[i][j] == "X ") {
                    if (Plateau[i + 1][j] == "" && Plateau[i][j + 1] == "" && Plateau[i - 1][j] == "" && Plateau[i][j - 1] == "") {
                        //Joueur bloqué
                        bloque = true;
                        //Fin de partie
                    } else {
                        //Joueur non bloqué
                    }
                }
                if (Plateau[i][j] == "O ") {
                    if (Plateau[i + 1][j] == "" && Plateau[i][j + 1] == "" && Plateau[i - 1][j] == "" && Plateau[i][j - 1] == "") {
                        //Joueur bloqué
                        bloque = true;
                        //Fin de partie
                    } else {
                        //Joueur non bloqué
                    }
                }
            }
        }
       return bloque;
    }


    /**
     * Fonction base qui va se comporter comme une fonction main, qui va appeler
     * les différentes fonction du jeu
     */
    public static void base(){

        String pseudo1; String pseudo2; String[][] plateau;boolean bloque;
        int x1 = 4; int y1=5 ;      // Position initiale des deux joueurs
        int x2 = 5; int y2 = 5;

        System.out.println("Entrez le pseudo du joueur 1:");
        pseudo1= Joueurs();
        System.out.println("Entrez le pseudo du joueur 2:");
        pseudo2 = Joueurs();

        plateau = fontionPlateau(x1,y1,x2,y2);
        premierAleatoire(pseudo1,pseudo2);

        bloque = estBloque(plateau);

        if(bloque == true){
            //Fin de partie
        }else {
            //Le joueur peut jouer
        }

    }
}
