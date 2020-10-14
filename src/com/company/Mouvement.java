package com.company;

import java.util.Scanner;

public class Mouvement {
    public static String[][] mouvemement(String[][] plateau){
        Scanner mouvementUtilisateur = new Scanner(System.in);
        String déplacement;

        déplacement = mouvementUtilisateur.next();
        if((déplacement.matches("^[zqsdZQSD].*"))){
            String déplacer = déplacement.toLowerCase();
            switch (déplacer) {
                case "z":
                    //L'utilisateur choisi z pour aller vers le haut
                    // haut = i - 1
                    for(int i = 0; i < 10; i++){
                        for(int j=0; j< 11; j++){
                            if(i == 10) {
                                break;
                            }else if (plateau[i][j] == "X "){
                                plateau[i][j] = "☐ ";
                                plateau[i-1][j] = "X ";
                                break;
                            }
                        }
                    }
                    break;
                case "q":
                    //L'utilisateur choisi q pour aller vers la gauche
                    // gauche = j - 1
                    for(int i = 0; i < 10; i++){
                        for(int j=0; j< 11; j++){
                            if(j == 10) {
                                break;
                            }else if (plateau[i][j] == "X "){
                                plateau[i][j] = "☐ ";
                                plateau[i][j-1] = "X ";
                                break;
                            }
                        }
                    }
                    break;
                case "s":
                    //L'utilisateur choisi s pour aller vers le bas
                    // gauche = i + 1
                    for(int i = 0; i < 10; i++){
                        for(int j=0; j< 11; j++){
                            if(i == 10) {
                                break;
                            }else if (plateau[i][j] == "X "){
                                plateau[i][j] = "☐ ";
                                plateau[i+1][j] = "X ";
                                break;
                            }
                        }
                    }
                    break;
                case "d":
                    //L'utilisateur choisi q pour aller vers la gauche
                    // gauche = j + 1
                    for(int i = 0; i < 10; i++){
                        for(int j=0; j< 11; j++){
                            if(j == 10) {
                                break;
                            }else if (plateau[i][j] == "X "){
                                        plateau[i][j] = "☐ ";
                                        plateau[i][j+1] = "X ";
                                        break;
                            }
                        }
                    }
                    break;
                default:
                   System.out.println("Commande de déplacement inexistante");
                   mouvemement(plateau);
            }
        }
        return plateau;
    }
}

