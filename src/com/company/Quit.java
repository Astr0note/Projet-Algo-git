package com.company;

import java.util.Scanner;

public class Quit {
    public static void quittez() {
        //On va créer une fonction pour que l'utilisateur puisse quittez le jeu quand il le souhaite.
        //Il devra dabord lancer une partie pour pouvoir quittez et pourra le faire dès le premier tour si il tape "quittez
        Scanner scanUser = new Scanner(System.in);
        String quitUser;
        quitUser = scanUser.next();
        if ((quitUser.matches("^[quittez]"))){
            System.exit (0);
        }
    }
}