package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class game {

    /**
     * Demande à l'utilisateur de choisir son pseudo
     * @return le pseudo du joueur (String)
     */
    public static String Players(){
        Scanner player = new Scanner(System.in);

        String players = player.next();
        return players;
    }

    public static void random(){

    }

    /**
     * Affichage tableau 11x10
     */
    public static void affichagePlateau(){
        String[][] board = new String[10][11];
        int i; int j;

        for (i=0;i<10;i++){
            for (j=0;j<11;j++){
                board[i][j] = "X ";
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }


    /**
     * Fonction base qui va se comporter comme une fonction main, qui va appeler
     * les différentes fonction du jeu
     */
    public static void base(){

        String pseudo1; String pseudo2;

        System.out.println("Entrez le pseudo du joueur 1:");
        pseudo1= Players();
        System.out.println("Entrez le pseudo du joueur 2:");
        pseudo2 = Players();

        affichagePlateau();
    }
}
