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

        for (int i=0;i<10;i++){
            for (int j=0;j<11;j++){
                System.out.print(plateau[i][j]);
            }
            System.out.println();
        }
    }


    /**
     * Va exectuer dans un ordre précis les actions de déplacement du joueur
     * @param Plateau
     */
    public static void deplacement(String[][] Plateau){

        boolean bloque;
        bloque = Bloquage.estBloque(Plateau);
        if(bloque == true){
            //Fin de partie
            System.out.println("Le joueur est bloqué!");
            System.out.println("Fin de la partie");
            Menu.choix();
        }else {
            System.out.println("Pas bloqué");
            //Le joueur peut jouer

            //here : Fonction déplacement de Mathis
            Plateau = Mouvement.mouvemement(Plateau);
            affichagePlateau(Plateau);

            Plateau = Destruction(Plateau);
            affichagePlateau(Plateau);
        }


    }

    public static String[][] Destruction(String[][] plateau){
        int X; int Y;
        Scanner choix = new Scanner(System.in);
        System.out.println("valeur de X ?");
        X = choix.nextInt();
        System.out.println("Valeur de Y ?");
        Y = choix.nextInt();
        if(plateau[X][Y] == "# " ){
            System.out.println("impossible");
        }
        else{
            plateau[X][Y] = "# ";
        }

        return plateau;
    }


    /**
     * Fonction base qui va se comporter comme une fonction main, qui va appeler
     * les différentes fonction du jeu
     */
    public static void base(){

        String pseudo1; String pseudo2; String[][] plateau;boolean enCours = true;
        int x1 = 4; int y1=5 ;      // Position initiale des deux joueurs
        int x2 = 5; int y2 = 5;

        System.out.println("Entrez le pseudo du joueur 1:");
        pseudo1= Joueurs();
        System.out.println("Entrez le pseudo du joueur 2:");
        pseudo2 = Joueurs();

        plateau = fontionPlateau(x1,y1,x2,y2);
        premierAleatoire(pseudo1,pseudo2);


            //A faire boucler d'une certaines manière....
            deplacement(plateau);


    }
}


