package com.company;

public class Bloquage {

    /**
     * Permet de vérifier les cases autour des deux joueurs
     * pour savoir s'il est bloqué ou non
     * @param Plateau
     * @return un boolean. true = joueur bloqué.
     */
    public static boolean estBloque(String[][] Plateau) {
        boolean bloque = false;
        String joueur2 = "O ";
        String joueur1 = "X ";
        String caseDetruite = "☐ ";

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 11; j++) {
                if (Plateau[i][j] == joueur1) {
                    String caseBas = Plateau[i][j + 1];
                    String caseGauche = Plateau[i - 1][j];
                    String caseDroite = Plateau[i + 1][j];
                    String caseHaut = Plateau[i][j - 1];
                    if ((caseDroite == caseDetruite) || (caseDroite == joueur2)) {
                        if ((caseBas == caseDetruite) || (caseBas == joueur2)) {
                            if ((caseGauche == caseDetruite) || (caseGauche == joueur2)) {
                                if ((caseHaut == caseDetruite) || (caseHaut == joueur2)) {
                                    bloque = true;
                                }
                            }
                        }
                    }
                    if ((caseBas == caseDetruite) || (caseBas == joueur2)) {
                        if ((caseDroite == caseDetruite) || (caseDroite == joueur2)) {
                            if ((caseGauche == caseDetruite) || (caseGauche == joueur2)) {
                                if ((caseHaut == caseDetruite) || (caseHaut == joueur2)) {
                                    bloque = true;
                                }
                            }
                        }
                    }
                    if ((caseGauche == caseDetruite) || (caseGauche == joueur2)) {
                        if ((caseBas == caseDetruite) || (caseBas == joueur2)) {
                            if ((caseDroite == caseDetruite) || (caseDroite == joueur2)) {
                                if ((caseHaut == caseDetruite) || (caseHaut == joueur2)) {

                                    bloque = true;
                                }

                            }
                        }
                    }
                    if ((caseHaut == caseDetruite) || (caseHaut == joueur2)) {
                        if ((caseBas == caseDetruite) || (caseBas == joueur2)) {
                            if ((caseGauche == caseDetruite) || (caseGauche == joueur2)) {
                                if ((caseDroite == caseDetruite) || (caseDroite == joueur2)) {

                                    bloque = true;
                                }
                            }
                        }
                    }
                }



                if (Plateau[i][j] == joueur2) {
                    String caseBas = Plateau[i][j + 1];
                    String caseGauche = Plateau[i - 1][j];
                    String caseDroite = Plateau[i + 1][j];
                    String caseHaut = Plateau[i][j - 1];
                    if ((caseDroite == caseDetruite) || (caseDroite == joueur1)) {
                        if ((caseBas == caseDetruite) || (caseBas == joueur1)) {
                            if ((caseGauche == caseDetruite) || (caseGauche == joueur1)) {
                                if ((caseHaut == caseDetruite) || (caseHaut == joueur1)) {
                                    bloque = true;
                                }
                            }
                        }
                    }
                    if ((caseBas == caseDetruite) || (caseBas == joueur1)) {
                        if ((caseDroite == caseDetruite) || (caseDroite == joueur1)) {
                            if ((caseGauche == caseDetruite) || (caseGauche == joueur1)) {
                                if ((caseHaut == caseDetruite) || (caseHaut == joueur1)) {
                                    bloque = true;
                                }
                            }
                        }
                    }
                    if ((caseGauche == caseDetruite) || (caseGauche == joueur1)) {
                        if ((caseBas == caseDetruite) || (caseBas == joueur1)) {
                            if ((caseDroite == caseDetruite) || (caseDroite == joueur1)) {
                                if ((caseHaut == caseDetruite) || (caseHaut == joueur1)) {

                                    bloque = true;
                                }

                            }
                        }
                    }
                    if ((caseHaut == caseDetruite) || (caseHaut == joueur1)) {
                        if ((caseBas == caseDetruite) || (caseBas == joueur1)) {
                            if ((caseGauche == caseDetruite) || (caseGauche == joueur1)) {
                                if ((caseDroite == caseDetruite) || (caseDroite == joueur1)) {

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
