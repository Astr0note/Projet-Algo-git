package com.company;

import java.util.Scanner;

public class Mouvement {
    public static String[][] mouvementJoueur1(String[][] plateau) {
        Scanner mouvementUtilisateur = new Scanner(System.in);
        String déplacement;
        String caseDetruite = "# ";
        String caseGauche = "";
        String caseDroit = "";
        String caseHaute = "";
        String caseBas = "";
        String joueur1 = "X ";
        String joueur2 = "O ";
        int stop;
        int i;
        int j;

        déplacement = mouvementUtilisateur.next();

        if ((déplacement.matches("^[zqsdZQSD].*"))) {
            String déplacer = déplacement.toLowerCase();
             switch (déplacer) {
               case "z":
                   //L'utilisateur choisi z pour aller vers le haut
                   // haut = i - 1
                   for (i = 0; i < 10; i++) {
                       for (j = 0; j < 11; j++) {
                           if (plateau[i][j] == joueur1) {
                               if ( (i == 0) || (plateau[i - 1][j] == caseDetruite) || (plateau[i-1][j] == joueur2)){
                                   System.out.println("La case ou vous souhaitez aller est détruite ou hors limite ! déplacer vous la ou c'est possible");
                                   mouvementJoueur1(plateau);
                                   break;
                               }else{
                                   plateau[i][j] = "☐ ";
                                   plateau[i - 1][j] = "X ";
                               }
                           }
                       }
                   }
                   break;
                   case "q":
                       //L'utilisateur choisi q pour aller vers la gauche
                       // gauche = j - 1
                       for (i = 0; i < 10; i++) {
                           for (j = 0; j < 11; j++) {
                               if (plateau[i][j] == joueur1) {
                                   if((j == 0) || (plateau[i][j-1] == caseDetruite) || (plateau[i][j-1] == joueur2)) {
                                       System.out.println("La case ou vous souhaitez aller est détruite ou hors limite ! déplacer vous la ou c'est possible");
                                       mouvementJoueur1(plateau);
                                       break;
                                               } else{
                                                   plateau[i][j] = "☐ ";
                                                   plateau[i][j - 1] = "X ";
                                                   break;
                                               }
                                           }
                                       }
                                   }
                       break;
                       case "s":
                           //L'utilisateur choisi s pour aller vers le bas
                           // gauche = i + 1
                           stop = 0;
                           for (i = 0; i < 10; i++) {
                               for (j = 0; j < 11; j++) {
                                   if (plateau[i][j] == joueur1 && stop == 0) {
                                       if ( (i == 9) || (plateau[i + 1][j] == caseDetruite) || (plateau[i+1][j] == joueur2) ){
                                           System.out.println("La case ou vous souhaitez aller est détruite ou hors limite ! déplacer vous la ou c'est possible");
                                           mouvementJoueur1(plateau);
                                           break;
                                       } else {
                                           plateau[i][j] = "☐ ";
                                           plateau[i + 1][j] = "X ";
                                           stop++;
                                       }
                                   }
                               }
                           }
                           break;
                           case "d":
                               //L'utilisateur choisi q pour aller vers la gauche
                               // gauche = j + 1
                               for (i = 0; i < 10; i++) {
                                   for (j = 0; j < 11; j++) {
                                       if (plateau[i][j] == joueur1) {
                                           if ( (j == 10) || (plateau[i][j+1] == caseDetruite) || (plateau[i][j+1] == joueur2)) {
                                               System.out.println("La case ou vous souhaitez aller est détruite ou hors limite ! déplacer vous la ou c'est possible");
                                               mouvementJoueur1(plateau);
                                               break;
                                           } else{
                                               plateau[i][j] = "☐ ";
                                               plateau[i][j + 1] = "X ";
                                               break;
                                           }
                                       }
                                   }
                                }
                                break;
                            default:
                                System.out.println("Commande de déplacement inexistante");
                                mouvementJoueur1(plateau);

                        }
                    }else{
            System.out.println("Commande de déplacement inexistante");
            System.out.println("Veuillez vous déplacer avec Z/Q/S/D");
            mouvementJoueur1(plateau);
        }
                    return plateau;
                }

    public static String[][] mouvementJoueur2(String[][] plateau) {
        Scanner mouvementUtilisateur = new Scanner(System.in);
        String déplacement;
        String caseDetruite = "# ";
        String caseGauche = "";
        String caseDroit = "";
        String caseHaute = "";
        String caseBas = "";
        String joueur1 = "X ";
        String joueur2 = "O ";
        int stop;
        int i;
        int j;

        déplacement = mouvementUtilisateur.next();

        if ((déplacement.matches("^[zqsdZQSD].*"))) {
            String déplacer = déplacement.toLowerCase();
            switch (déplacer) {
                case "z":
                    //L'utilisateur choisi z pour aller vers le haut
                    // haut = i - 1
                    for (i = 0; i < 10; i++) {
                        for (j = 0; j < 11; j++) {
                            if (plateau[i][j] == joueur2) {
                                if ( (i == 0) || (plateau[i - 1][j] == caseDetruite) || (plateau[i-1][j] == joueur1)){
                                    System.out.println("La case ou vous souhaitez aller est détruite ou hors limite ! déplacer vous la ou c'est possible");
                                    mouvementJoueur2(plateau);
                                    break;
                                }else{
                                    plateau[i][j] = "☐ ";
                                    plateau[i - 1][j] = "X ";
                                }
                            }
                        }
                    }
                    break;
                case "q":
                    //L'utilisateur choisi q pour aller vers la gauche
                    // gauche = j - 1
                    for (i = 0; i < 10; i++) {
                        for (j = 0; j < 11; j++) {
                            if (plateau[i][j] == joueur2) {
                                if((j == 0) || (plateau[i][j-1] == caseDetruite) || (plateau[i][j-1] == joueur1)) {
                                    System.out.println("La case ou vous souhaitez aller est détruite ou hors limite ! déplacer vous la ou c'est possible");
                                    mouvementJoueur2(plateau);
                                    break;
                                } else{
                                    plateau[i][j] = "☐ ";
                                    plateau[i][j - 1] = "X ";
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case "s":
                    //L'utilisateur choisi s pour aller vers le bas
                    // gauche = i + 1
                    stop = 0;
                    for (i = 0; i < 10; i++) {
                        for (j = 0; j < 11; j++) {
                            if (plateau[i][j] == joueur2 && stop == 0) {
                                if ( (i == 9) || (plateau[i + 1][j] == caseDetruite) || (plateau[i+1][j] == joueur1) ){
                                    System.out.println("La case ou vous souhaitez aller est détruite ou hors limite ! déplacer vous la ou c'est possible");
                                    mouvementJoueur2(plateau);
                                    break;
                                } else {
                                    plateau[i][j] = "☐ ";
                                    plateau[i + 1][j] = "X ";
                                    stop++;
                                }
                            }
                        }
                    }
                    break;
                case "d":
                    //L'utilisateur choisi q pour aller vers la gauche
                    // gauche = j + 1
                    for (i = 0; i < 10; i++) {
                        for (j = 0; j < 11; j++) {
                            if (plateau[i][j] == joueur2) {
                                if ( (j == 10) || (plateau[i][j+1] == caseDetruite) || (plateau[i][j+1] == joueur1)) {
                                    System.out.println("La case ou vous souhaitez aller est détruite ou hors limite ! déplacer vous la ou c'est possible");
                                    mouvementJoueur2(plateau);
                                    break;
                                } else{
                                    plateau[i][j] = "☐ ";
                                    plateau[i][j + 1] = "X ";
                                    break;
                                }
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Commande de déplacement inexistante");
                    mouvementJoueur2(plateau);

            }
        }else{
            System.out.println("Commande de déplacement inexistante");
            System.out.println("Veuillez vous déplacer avec Z/Q/S/D");
            mouvementJoueur2(plateau);
        }
        return plateau;
    }
            }


