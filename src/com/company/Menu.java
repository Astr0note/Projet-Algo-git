package com.company;

import java.util.Scanner;

public class Menu{
    /**
     * Affichage Menu avec différents choix
     */
    public static void choix() {
        //On va créer le menu principal avec 4 options
        Scanner choix = new Scanner(System.in);
        String choixUtilisateur;
        //Menu visuel proposé à l'utilisateur
        System.out.println("**********************************************************");
        System.out.println("Choissisez l'option souhaiter entre 1 et 4.");
        System.out.println("1. Start");
        System.out.println("2. Règles");
        System.out.println("3. Scores");
        System.out.println("4. Quittez");
        System.out.println("**********************************************************");

        choixUtilisateur = choix.next(); //On récupère ce que tape l'utilisateur
        if ((choixUtilisateur.matches("^[1-4].*"))) {
            int choixUser = Integer.parseInt(choixUtilisateur);
            switch (choixUser) { //En fonction de son choix on lance un cas différent
                case 1:
                    //ajouter Fonction démarrer
                    game.base();    // Fichier du jeu
                    break;
                case 2:
                    //ajouter Fonction règles
                    affichageRegles();

                    break;
                case 3:
                    //ajouter Fonction score
                    break;
                case 4:
                    //ajouter Fonction Quittez
                    break;

                default:
                    System.out.println("/!\\  Choix incorrect, veuillez choisir une option entre 1 et 4. /!\\  ");
                    choix();
            }
        }
        else {
            System.out.println("/!\\  Choix incorrect, veuillez choisir une option entre 1 et 4. /!\\  ");
            choix();

            }
        }

    /**
     * Affichage des règles suivi d'un retour menu
     */
    public static void affichageRegles(){

        System.out.println("Règles");
        System.out.println("Pendant son tour un joueur peut déplacer son pion d’une case (verticalement ou\n" +
                "horizontalement), puis il détruit une case du plateau.\n" +
                "Le dernier joueur pouvant encore se déplacer gagne.");
        System.out.println("Attention :\n" +
                "- Un joueur ne peut pas détruire une case occupée.\n" +
                "- Un joueur ne peut pas occuper une case détruite ou une case déjà occupée.\n" +
                "- Un joueur bloqué pendant un tour est déclaré perdant.");
        choix();
    }
}
