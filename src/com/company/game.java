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
     * Affichage tableau 11x10
     */
    public static void affichagePlateau(){
        String[][] plateau = new String[10][11];
        int i; int j;

        for (i=0;i<10;i++){
            for (j=0;j<11;j++){
                plateau[i][j] = "☐ ";
                plateau[5][6] = "X";
                plateau[6][6] = "o";
                System.out.print(plateau[i][j]);
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
        pseudo1= Joueurs();
        System.out.println("Entrez le pseudo du joueur 2:");
        pseudo2 = Joueurs();

        affichagePlateau();
        premierAleatoire(pseudo1,pseudo2);
    }
}
