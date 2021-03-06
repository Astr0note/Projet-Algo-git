package com.company;

import java.util.Scanner;

public class Bloquage {

    /**
     * Permet de vérifier les cases autour des deux joueurs
     * pour savoir s'il est bloqué ou non
     * @param Plateau
     * @return un boolean. true = joueur bloqué.
     */
    public static boolean estBloque(String[][] Plateau) {

        //Initialisation de toutes les variables
        boolean bloque = false;
        String joueur2 = "O ";
        String joueur1 = "X ";
        String caseDetruite = "  ";
        String caseGauche = "";
        String caseDroit = "";
        String caseHaute = "";
        String caseBas = "";

        //Vérification si le joueur est proche des bords du tableau
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 11; j++) {
                if (Plateau[i][j] == joueur1) {
                    if(j!= 10 && j!= 0 && i!=9 && i!=0){
                         caseDroit = Plateau[i][j + 1];
                         caseGauche = Plateau[i][j - 1];
                         caseHaute = Plateau[i - 1][j];
                         caseBas = Plateau[i + 1][j];
                    }else {     //Si le joueur est proche d'un bord, la case adjacente est considérée comme une case détruite, en fonction de
                                //la position du joueur
                        if(j == 10 && i == 0){ //Si on est dans le coin Haut Droit
                            caseDroit = caseDetruite;
                            caseGauche = Plateau[i][j - 1];
                            caseHaute = caseDetruite;
                            caseBas = Plateau[i + 1][j];
                        }
                        if(j == 10 && i == 9){  //Si on est dans le coin Bas Droit
                            caseDroit = caseDetruite;
                            caseGauche = Plateau[i][j - 1];
                            caseHaute = Plateau[i - 1][j];
                            caseBas = caseDetruite;
                        }
                        if (j == 10 && i!=0 && i!=9) {  //Si on est pas dans un coin mais tout à Droite
                             caseDroit = caseDetruite;
                             caseGauche = Plateau[i][j - 1];
                             caseHaute = Plateau[i - 1][j];
                             caseBas = Plateau[i + 1][j];
                        }
                        if(j == 0 && i == 0){   //Si on est dans le coin Haut Gauche
                            caseGauche = caseDetruite;
                            caseHaute = caseDetruite;
                            caseBas = Plateau[i + 1][j];
                            caseDroit = Plateau[i][j + 1];
                        }
                        if(j == 0 && i == 9){   //Si on est dans le coin Bas Gauche
                            caseGauche = caseDetruite;
                            caseHaute = Plateau[i - 1][j];
                            caseBas = caseDetruite;
                            caseDroit = Plateau[i][j + 1];
                        }
                        if (j == 0 && i!=0 && i!=9) {   //Si on est pas dans un coin mais tout à Gauche
                             caseGauche = caseDetruite;
                             caseHaute = Plateau[i - 1][j];
                             caseBas = Plateau[i + 1][j];
                             caseDroit = Plateau[i][j + 1];

                        }
                        if (i == 9 && j == 0){  //Si on est dans le coin Bas Gauche
                            caseBas = caseDetruite;
                            caseDroit = Plateau[i][j + 1];
                            caseHaute = Plateau[i - 1][j];
                            caseGauche = caseDetruite;
                        }
                        if (i == 9 && j == 10){ //Si on est dans le coin Bas Droit
                            caseBas = caseDetruite;
                            caseDroit = caseDetruite;
                            caseHaute = Plateau[i - 1][j];
                            caseGauche = Plateau[i][j - 1];
                        }
                        if (i == 9 && j!=0 && j!=10) {  //Si on est pas dans un coin mais tout en Bas
                             caseBas = caseDetruite;
                             caseDroit = Plateau[i][j + 1];
                             caseHaute = Plateau[i - 1][j];
                             caseGauche = Plateau[i][j - 1];
                        }
                        if (i==0 && j == 0){    //Si on est dans le coin Haut Gauche
                            caseHaute = caseDetruite;
                            caseDroit = Plateau[i][j + 1];
                            caseGauche = caseDetruite;
                            caseBas = Plateau[i + 1][j];
                        }
                        if(i==0 && j == 10){    //Si on est dans le coin Haut Droit
                            caseHaute = caseDetruite;
                            caseDroit = caseDetruite;
                            caseGauche = Plateau[i][j - 1];
                            caseBas = Plateau[i + 1][j];
                        }
                        if (i == 0 && j!=0 && j!= 10) { //Si on est pas dans un coin mais tout en Haut
                             caseHaute = caseDetruite;
                             caseDroit = Plateau[i][j + 1];
                             caseGauche = Plateau[i][j - 1];
                             caseBas = Plateau[i + 1][j];
                        }
                    }


                    //Comparaison pour chaque coté du joueurs, voir s'il est bloqué
                    if ((caseBas == caseDetruite) || (caseBas == joueur2)) {
                        if ((caseDroit == caseDetruite) || (caseDroit == joueur2)) {
                            if ((caseHaute == caseDetruite) || (caseHaute == joueur2)) {
                                if ((caseGauche == caseDetruite) || (caseGauche == joueur2)) {
                                    bloque = true;
                                }
                            }
                        }
                    }
                    if ((caseDroit == caseDetruite) || (caseDroit == joueur2)) {
                        if ((caseBas == caseDetruite) || (caseBas == joueur2)) {
                            if ((caseHaute == caseDetruite) || (caseHaute == joueur2)) {
                                if ((caseGauche == caseDetruite) || (caseGauche == joueur2)) {
                                    bloque = true;
                                }
                            }
                        }
                    }
                    if ((caseHaute == caseDetruite) || (caseHaute == joueur2)) {
                        if ((caseDroit == caseDetruite) || (caseDroit == joueur2)) {
                            if ((caseBas == caseDetruite) || (caseBas == joueur2)) {
                                if ((caseGauche == caseDetruite) || (caseGauche == joueur2)) {

                                    bloque = true;
                                }

                            }
                        }
                    }
                    if ((caseGauche == caseDetruite) || (caseGauche == joueur2)) {
                        if ((caseDroit == caseDetruite) || (caseDroit == joueur2)) {
                            if ((caseHaute == caseDetruite) || (caseHaute == joueur2)) {
                                if ((caseBas == caseDetruite) || (caseBas == joueur2)) {

                                    bloque = true;
                                }
                            }
                        }
                    }
                }


                //Vérification si le joueur est proche des bords du tableau
                if (Plateau[i][j] == joueur2) {
                    if(j!= 10 && j!= 0 && i!=9 && i!=0){
                        caseDroit = Plateau[i][j + 1];
                        caseGauche = Plateau[i][j - 1];
                        caseHaute = Plateau[i - 1][j];
                        caseBas = Plateau[i + 1][j];
                    }else {     //Si le joueur est proche d'un bord, la case adjacente est considérée comme une case détruite, en fonction de
                                //la position du joueur
                        if(j == 10 && i == 0){
                            caseDroit = caseDetruite;
                            caseGauche = Plateau[i][j - 1];
                            caseHaute = caseDetruite;
                            caseBas = Plateau[i + 1][j];
                        }
                        if(j == 10 && i == 9){
                            caseDroit = caseDetruite;
                            caseGauche = Plateau[i][j - 1];
                            caseHaute = Plateau[i - 1][j];
                            caseBas = caseDetruite;
                        }
                        if (j == 10 && i!=0 && i!=9) {
                            caseDroit = caseDetruite;
                            caseGauche = Plateau[i][j - 1];
                            caseHaute = Plateau[i - 1][j];
                            caseBas = Plateau[i + 1][j];
                        }
                        if(j == 0 && i == 0){
                            caseGauche = caseDetruite;
                            caseHaute = caseDetruite;
                            caseBas = Plateau[i + 1][j];
                            caseDroit = Plateau[i][j + 1];
                        }
                        if(j == 0 && i == 9){
                            caseGauche = caseDetruite;
                            caseHaute = Plateau[i - 1][j];
                            caseBas = caseDetruite;
                            caseDroit = Plateau[i][j + 1];
                        }
                        if (j == 0 && i!=0 && i!=9) {
                            caseGauche = caseDetruite;
                            caseHaute = Plateau[i - 1][j];
                            caseBas = Plateau[i + 1][j];
                            caseDroit = Plateau[i][j + 1];

                        }
                        if (i == 9 && j == 0){
                            caseBas = caseDetruite;
                            caseDroit = Plateau[i][j + 1];
                            caseHaute = Plateau[i - 1][j];
                            caseGauche = caseDetruite;
                        }
                        if (i == 9 && j == 10){
                            caseBas = caseDetruite;
                            caseDroit = caseDetruite;
                            caseHaute = Plateau[i - 1][j];
                            caseGauche = Plateau[i][j - 1];
                        }
                        if (i == 9 && j!=0 && j!=10) {
                            caseBas = caseDetruite;
                            caseDroit = Plateau[i][j + 1];
                            caseHaute = Plateau[i - 1][j];
                            caseGauche = Plateau[i][j - 1];
                        }
                        if (i==0 && j == 0){
                            caseHaute = caseDetruite;
                            caseDroit = Plateau[i][j + 1];
                            caseGauche = caseDetruite;
                            caseBas = Plateau[i + 1][j];
                        }
                        if(i==0 && j == 10){
                            caseHaute = caseDetruite;
                            caseDroit = caseDetruite;
                            caseGauche = Plateau[i][j - 1];
                            caseBas = Plateau[i + 1][j];
                        }
                        if (i == 0 && j!=0 && j!= 10) {
                            caseHaute = caseDetruite;
                            caseDroit = Plateau[i][j + 1];
                            caseGauche = Plateau[i][j - 1];
                            caseBas = Plateau[i + 1][j];
                        }
                    }

                    //Comparaison pour chaque coté du joueurs, voir s'il est bloqué
                    if ((caseBas == caseDetruite) || (caseBas == joueur1)) {
                        if ((caseDroit == caseDetruite) || (caseDroit == joueur1)) {
                            if ((caseHaute == caseDetruite) || (caseHaute == joueur1)) {
                                if ((caseGauche == caseDetruite) || (caseGauche == joueur1)) {
                                    bloque = true;
                                }
                            }
                        }
                    }
                    if ((caseDroit == caseDetruite) || (caseDroit == joueur1)) {
                        if ((caseBas == caseDetruite) || (caseBas == joueur1)) {
                            if ((caseHaute == caseDetruite) || (caseHaute == joueur1)) {
                                if ((caseGauche == caseDetruite) || (caseGauche == joueur1)) {
                                    bloque = true;
                                }
                            }
                        }
                    }
                    if ((caseHaute == caseDetruite) || (caseHaute == joueur1)) {
                        if ((caseDroit == caseDetruite) || (caseDroit == joueur1)) {
                            if ((caseBas == caseDetruite) || (caseBas == joueur1)) {
                                if ((caseGauche == caseDetruite) || (caseGauche == joueur1)) {

                                    bloque = true;
                                }

                            }
                        }
                    }
                    if ((caseGauche == caseDetruite) || (caseGauche == joueur1)) {
                        if ((caseDroit == caseDetruite) || (caseDroit == joueur1)) {
                            if ((caseHaute == caseDetruite) || (caseHaute == joueur1)) {
                                if ((caseBas == caseDetruite) || (caseBas == joueur1)) {

                                    bloque = true;
                                }
                            }
                        }
                    }
                }
            }
        }

        return bloque;
    }


}