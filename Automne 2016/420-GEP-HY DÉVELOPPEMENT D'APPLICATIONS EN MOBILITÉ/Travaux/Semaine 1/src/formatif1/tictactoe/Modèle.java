/*
 *  CEGEP de Saint-Hyacinthe
 */

package formatif1.tictactoe;

/**
 *
 * @author Stéphane
 */
public abstract class Modèle implements ActionsTTT{
    
    public enum Joueur {X,O};
    
    // État de la grille de jeu, null si vide
    Joueur  A1,A2,A3,
            B1,B2,B3,
            C1,C2,C3;
    
    Joueur joueurActif;
    
    ÉvénementsTTT interfaceUtilisateur;
    
    Modèle(ÉvénementsTTT interfaceUtilisateur, Joueur joueurActif){
        this.interfaceUtilisateur = interfaceUtilisateur;
        this.joueurActif = joueurActif;
    }


}
