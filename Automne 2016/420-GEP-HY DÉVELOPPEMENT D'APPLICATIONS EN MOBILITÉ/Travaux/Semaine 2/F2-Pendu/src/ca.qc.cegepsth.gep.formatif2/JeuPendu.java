/*
 *  CEGEP de Saint-Hyacinthe
 */
package ca.qc.cegepsth.gep.formatif2;

/**
 *
 * @author Stéphane Denis
 */
public abstract class JeuPendu {

    char[] motSecret; // Le mot à trouver
    char[] essais;    // Ce que le joueur à trouvé jusqu'à maintenant
    AfficheBonnesLettres interfaceUsager;

    /**
     * Constructeur
     *
     * @param motSecret Mot qui doit être trouvé
     */
    public JeuPendu(AfficheBonnesLettres interfaceUsager, char[] motSecret) {
        this.motSecret = motSecret;
        this.essais = new char[motSecret.length];
        this.interfaceUsager = interfaceUsager;
    }

    /**
     * Valide si le joueur à trouvé une lettre valide
     *
     * @param essai Lettre soumis par le joueur
     * @return Vrai si la lettre fait partie du mot secret
     */
    public abstract boolean joue(char essai) ;
}
