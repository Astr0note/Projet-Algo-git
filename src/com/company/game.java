package com.company;

import java.util.Scanner;

public class game {

    static String joueur1 ;
    static String joueur2 ;

    public static void Players(){

        Scanner player = new Scanner(System.in);

        System.out.println("Pseudo joueur 1:");
        joueur1 = player.next();

        System.out.println("Pseudo joueur 2:");
        joueur2 = player.next();

    }

    public static void random(){

    }

    public static void affichagePlateau(){
    }
}
