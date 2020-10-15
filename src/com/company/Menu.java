package com.company;

import java.util.Scanner;

public class Menu {
    /**
     * Affichage Menu avec différents choix
     */
    public static void choix() {
        //On va créer le menu principal avec 4 options
        Scanner choix = new Scanner(System.in);
        String choixUtilisateur;
        //Menu visuel proposé à l'utilisateur
        System.out.println("*************************** Don't Fall Guys ***************************");
        System.out.println("Choissisez l'option souhaiter entre 1 et 4.");
        System.out.println("1. Start");
        System.out.println("2. Règles");
        System.out.println("3. Scores");
        System.out.println("4. Quittez");
        System.out.println("***********************************************************************");

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
                    affichageScore();
                    break;
                case 4:
                    //ajouter Fonction Quittez
                    System.exit(0);

                default:
                    System.out.println("/!\\  Choix incorrect, veuillez choisir une option entre 1 et 4. /!\\  ");
                    choix();
            }
        } else {
            System.out.println("/!\\  Choix incorrect, veuillez choisir une option entre 1 et 4. /!\\  ");
            choix();

        }
    }

    /**
     * Affichage des règles suivi d'un retour menu
     */
    public static void affichageRegles() {

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
    public static String un = " ",deux= " ",trois= " ",quatre= " ",cinq= " ",six= " ",sept= " ",huit= " ",neuf= " ",dix= " ";

    public static void score(int tour, String Joueur1, String Joueur2) {
        if (tour%2 ==1){
            if (un == " "){
                un = Joueur1;
            }else if (deux == " "){
                deux = Joueur1;
            }else if (trois == " "){
                trois = Joueur1;
            }else if (quatre == " "){
                quatre = Joueur1;
            }else if (cinq == " "){
                cinq = Joueur1;
            }else if (six == " "){
                six = Joueur1;
            }else if (sept == " "){
                sept = Joueur1;
            }else if (huit == " "){
                huit = Joueur1;
            }else if (neuf == " "){
                neuf = Joueur1;
            }else if (dix == " ") {
                dix = Joueur1;
            }
        }
        if(tour%2 == 0){
            if (un == " "){
                un = Joueur2;
            }else if (deux == " "){
                deux = Joueur2;
            }else if (trois == " "){
                trois = Joueur2;
            }else if (quatre == " "){
                quatre = Joueur2;
            }else if (cinq == " "){
                cinq = Joueur2;
            }else if (six == " "){
                six = Joueur2;
            }else if (sept == " "){
                sept = Joueur2;
            }else if (huit == " "){
                huit = Joueur2;
            }else if (neuf == " "){
                neuf = Joueur2;
            }else if (dix == " ") {
                dix = Joueur2;
            }
        }
    }

    public static void affichageScore(){
        System.out.println("HISTORIQUE DES 10 DERNIERES PARTIES");
        System.out.println(" ");
        System.out.println("#1 Victoire : "+un);
        System.out.println("#2 Victoire : "+deux);
        System.out.println("#3 Victoire : "+trois);
        System.out.println("#4 Victoire : "+quatre);
        System.out.println("#5 Victoire : "+cinq);
        System.out.println("#6 Victoire : "+six);
        System.out.println("#7 Victoire : "+sept);
        System.out.println("#8 Victoire : "+huit);
        System.out.println("#9 Victoire : "+neuf);
        System.out.println("#10 Victoire : "+dix);

        choix();
    }
}

