/*
 *  CEGEP de Saint-Hyacinthe
 */

package ca.qc.cegepsth.gep.formatif2;

/**
 *
 * @author Stéphane Denis
 */
public interface AfficheBonnesLettres {
    /**
     * Donne les lettres qui ont été trouvées
     * @param lettres Caractère ou null (si pas encore trouvé)
     */
    public void bonnesLettres(char[] lettres);
}
