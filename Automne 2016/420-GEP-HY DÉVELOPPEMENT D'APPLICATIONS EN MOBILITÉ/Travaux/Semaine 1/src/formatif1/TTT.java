/*
 *  CEGEP de Saint-Hyacinthe
 */

package formatif1;

import java.util.InputMismatchException;
import java.util.Scanner;

import formatif1.tictactoe.ActionsTTT;
import formatif1.tictactoe.Modèle;
import formatif1.tictactoe.PositionInvalide;
import formatif1.tictactoe.ÉvénementsTTT;


/**
 * Jeu de tic tac toe en mode console
 * 
 * On utilise les chiffres pour jouer
 * 
 * 1|2|3<br/>
 * -----<br/>
 * 4|5|6<br/>
 * -----<br/>
 * 7|8|9<br/>
 * 
 * @author Stéphane
 */
public class TTT implements ÉvénementsTTT {
    ActionsTTT jeu;
    boolean jeuTerminé;

    public TTT() {
            // On utilisera le clavier de la console pour jouer
            
            jeu = new formatif1.tictactoe.Logique(this,Modèle.Joueur.X);
            jeuTerminé = false;
    }

    public static void main(String[] args) {

            TTT ttt = new TTT();

            do {
                    ttt.afficheGrille();
                    ttt.jouePosition(ttt.lireChoix());
            } while (!ttt.jeuTerminé);

            // Fini!
            ttt.afficheGrille();
    }
    
    public int lireChoix() {
            int choix=0;
            do{
                try{
                    Scanner clavier = new Scanner(System.in);
                    System.out.print("Entrez un chiffre, puis ENTER pour jouer:");
                    choix = clavier.nextInt();
                }
                catch(InputMismatchException ex)
                {
                    // caractère invalide, on réessaie
                }
            }
            while (choix <1 || choix >9);
            
            return choix;
    }

    public void afficheGrille() {
            System.out.println("-------------");

            for (int i = 0; i < 3; i++) {
                    System.out.print("| ");
                    for (int j = 1; j <= 3; j++) {
                        int position = i*3 + j;
                        try {
                            Modèle.Joueur joueur = jeu.getJoueur(position);
                            String contenu = ""+position;
                            if(joueur != null){
                                contenu = (joueur==Modèle.Joueur.O?"O":"X");
                            }
                            System.out.print( contenu+ " | ");
                        } catch (PositionInvalide ex) {
                            System.out.println("Logique de jeu défaillante");
                        }
                    }
                    System.out.println();
                    System.out.println("-------------");
            }
    }

    /**
     * Méthode principale pour participer au jeu
     * 
     * @param position position dans la grille de jeu, chiffre entre 1 et 9
     */
    public void jouePosition(int position) {
        try {
            jeu.jouePosition(position);
        } catch (PositionInvalide ex) {
            System.out.println("Vous avec avez entré un numéro invalide.");
        }
    }

    @Override
    public void aGagné(Modèle.Joueur j) {
            jeuTerminé = true;
            System.out.println(joueur(j) + " a gagné!");

    }

    @Override
    public void auTourDe(Modèle.Joueur j) {
            System.out.println("C'est le tour du " + joueur(j) + ".");

    }

    @Override
    public void cartePleine() {
            jeuTerminé = true;
            System.out.println("La carte est pleine. Match nul!");

    }

    @Override
    public void positionDéjàOccuppée() {
        System.out.println("Cette position est déjà occupée");
    }
    
    private char joueur(Modèle.Joueur j){
        return (j == Modèle.Joueur.O ? 'O':'X');
    }
}
