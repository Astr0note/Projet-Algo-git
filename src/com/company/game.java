package com.company;

import java.sql.SQLOutput;
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

    public static void affichagePlateau(){
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


    }
}
