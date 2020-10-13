package com.company;

import java.util.Scanner;

public class Menu{

    public static void choix() {

        //On va créer le menu principal avec 4 options.
        Scanner choix = new Scanner(System.in);
        int choixUtilisateur;

        System.out.println("nom"+ \+"prenom");

        choixUtilisateur = choix.nextInt();
        switch (choixUtilisateur) {
            case 1:
                //ajouter Fonction démarrer
                break;
            case 2:
                //ajouter Fonction règles
                break;
            case 3:
                //ajouter Fonction score
                break;

        }
    }
}
