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
                    //L'utilisateur choisi 1 pour aller vers le haut
                    // haut = i - 1
                    for(int i = 0; i < 10; i++){
                        for(int j=0; j< 11; j++){
                            if (plateau[i][j] == "X "){
                                plateau[i][j] = "☐ ";
                                plateau[i-1][j] = "X ";
                            }
                        }
                    }
            }
        }
        return plateau;
    }
}

