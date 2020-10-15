package com.company;

import java.util.Scanner;
public class game {

    /**
     * Demande à l'utilisateur de choisir son pseudo
     * @return le pseudo du joueur (String)
     */
    public static String Joueurs(){
        Scanner player = new Scanner(System.in);

        String pseudo = "";
        int longueurPseudo = pseudo.length();
        while ( (longueurPseudo < 2 || (longueurPseudo > 10)) ){
            pseudo = player.next();
            longueurPseudo = pseudo.length();
        }
        return pseudo;
    }

    /**
     * Choisis quel joueur va jouer en premier, de façon aléatoire
     * @param pseudo1
     * @param pseudo2
     */
    public static String premierAleatoire(String pseudo1, String pseudo2){
        int min = 0; int max = 2;

        int aleatoire = (int)(Math.random()*(min-max))+max;

        if(aleatoire == 1){
            System.out.println("C'est à "+pseudo1+" de jouer en premier");
            return pseudo1;
        }else {
            System.out.println("C'est à "+pseudo2+" de jouer en premier");
            return pseudo2;
        }

    }

    /**
     * Place les joueurs en fonction des coordonnées x et y reçues en paramètre
     * @param x1 Coordonnée x du premier joueur
     * @param y1 Coordonnée y du premier joueur
     * @param x2 Coordonnée x du second joueur
     * @param y2 Coordonnée y du second jour
     * @return Tableau avec les valeurs
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
        int j;
        System.out.println("  "+"0 "+"1 "+"2 "+"3 "+"4 "+"5 "+"6 "+"7 "+"8 "+"9 "+"10 "+" X");
        for (int i=0;i<10;i++){
            System.out.print(i+" ");
            for (j=0;j<11;j++){
                System.out.print(plateau[i][j]);
            }
            System.out.println();
        }
        System.out.println("Y");
    }


    /**
     * Va exectuer dans un ordre précis les actions de déplacement du joueur
     * @param Plateau
     */
    public static void deplacement(String[][] Plateau,String joueur1, String joueur2, int tour){

        boolean bloque;
        bloque = Bloquage.estBloque(Plateau);
        if(bloque == true){ //Fin de partie
            System.out.println("Le joueur est bloqué!");
            System.out.println("Fin de la partie");
            Menu.score(tour, joueur1, joueur2);
            Menu.choix();
        }else { //Le joueur peut jouer

            if (tour%2 == 1){ //Les tours impairs = joueur1. Les tours pairs = joueur2
                System.out.println("C'est à "+joueur1+" de jouer");
                Plateau = Mouvement.mouvementJoueur1(Plateau);
                affichagePlateau(Plateau);
            }else{
                System.out.println("C'est à "+joueur2+" de jouer");
                Plateau = Mouvement.mouvementJoueur2(Plateau);
                affichagePlateau(Plateau);
            }

            Plateau = Destruction(Plateau);
            affichagePlateau(Plateau);
        }


    }

    /**
     * Détruis une case du plateau après le tour du joueur
     * @param plateau
     * @return le plateau + une case détruite
     */
    public static String[][] Destruction(String[][] plateau){

        Scanner choix = new Scanner(System.in);
        String choixUtilisateurX;
        String choixUtilisateurY;

        System.out.println("**********************************************************");
        System.out.println("phase de destruction");
        System.out.println("**********************************************************");
        System.out.println("quel case voulez vous détruire ?");
        System.out.println("valeur de Y ?");
        choixUtilisateurX = choix.next();//On récupère X de l'utilisateur
        if ((choixUtilisateurX.matches("^[mM].*"))) {
            String Quittez = choixUtilisateurX.toLowerCase();
            Quit.quittez();
        }
        System.out.println("Valeur de X ?");
        choixUtilisateurY = choix.next();//On récupère Y de l'utilisateur
        if ((choixUtilisateurY.matches("^[mM].*"))) {
            String Quittez = choixUtilisateurY.toLowerCase();
            Quit.quittez();
        }
        if(choixUtilisateurX.matches("^[0-9].*") && choixUtilisateurY.matches("^[0-9].*")) {
            int X = Integer.parseInt(choixUtilisateurX); //On vérifie que les valeurs soient bien des chiffres
            int Y = Integer.parseInt(choixUtilisateurY);
            if (X < 0 || X > 9 || Y < 0 || Y > 10) { //Que la valeur existe bien dans le tableau
                System.out.println("/! La case demandée n'existe pas !/");
                Destruction(plateau);
            } else if (plateau[X][Y] != "☐ ") {
                System.out.println("/! La case n'est pas disponible !/"); //Que la case soit disponible (ni un joueur ni une case détruite)
                Destruction(plateau);
            } else {
                plateau[X][Y] = "# "; //On détruis la case
            }
        }else {
            System.out.println("/! Erreur, veuillez bien insérer des coordonnées !/"); //Erreur dans la saisie X Y
            Destruction(plateau);
        }

        return plateau; //return le plateau avec une case détruite en plus
    }


    /**
     * Fonction base qui va se comporter comme une fonction main, qui va appeler
     * les différentes fonction du jeu
     */
    public static void base(){

        String pseudo1; String pseudo2;String premierJoueur;
        String joueur1; String joueur2;
        String[][] plateau;
        boolean enCours = true;
        int x1 = 4; int y1=5 ;      // Position initiale des deux joueurs
        int x2 = 5; int y2 = 5;
        int tour = 1;
        System.out.println("Entrez le pseudo du joueur 1 (entre 2 et 10 caractères):");
        pseudo1= Joueurs();
        System.out.println("Entrez le pseudo du joueur 2 (entre 2 et 10 caractères):");
        pseudo2 = Joueurs();

        premierJoueur = premierAleatoire(pseudo1,pseudo2);
        plateau = fontionPlateau(x1,y1,x2,y2);

        if(premierJoueur == pseudo1){   //En fonction du tirage aléatoire,
            joueur1 = pseudo1;          //Joueur1 et Joueur2 sont définis
            joueur2 = pseudo2;
        }else{
            joueur1 = pseudo2;
            joueur2 = pseudo1;
        }

        while(tour>0) {
            deplacement(plateau, joueur1, joueur2, tour);
            tour++;
        }


    }
}


