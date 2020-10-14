package com.company;

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

    /**
     * Choisis quel joueur va jouer en premier, de façon aléatoire
     * @param pseudo1
     * @param pseudo2
     */
    public static void random(String pseudo1, String pseudo2){
        int min = 0; int max = 2;

        int random = (int)(Math.random()*(min-max))+max;

        if(random == 1){
            System.out.println("C'est à "+pseudo1+" de jouer en premier");
        }else {
            System.out.println("C'est à "+pseudo2+" de jouer en premier");
        }

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

        random(pseudo1,pseudo2);
    }
}
