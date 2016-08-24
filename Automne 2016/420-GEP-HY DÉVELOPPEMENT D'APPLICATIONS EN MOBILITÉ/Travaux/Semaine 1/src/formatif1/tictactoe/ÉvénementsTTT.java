/*
 *  CEGEP de Saint-Hyacinthe
 */

package formatif1.tictactoe;

/**
 *
 * @author Stéphane
 */
public interface ÉvénementsTTT {

    /**
     * Est appelé pour signaler que le jeu est en attente d'une action du joueur spécifié.
     * 
     * @param joueur 
     */
    public void auTourDe(Modèle.Joueur joueur);

    /**
     * Est appelé quand la partie est terminée par la victoire d'un joueur.
     * 
     * @param joueur 
     */
    public void aGagné(Modèle.Joueur joueur) ;

    /**
     * Est appelé quand la partie est terminée par un match nul.
     */
    public void cartePleine();
    
    /**
     * Est appelé quand le joueur essaie de jouer sur une case occupée
     */
    public void positionDéjàOccuppée();
}
