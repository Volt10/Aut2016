package ca.qc.cegepsth.gep.formatif2;


public class MonPendu extends JeuPendu {
    
    /**
     * 
     * CTOR
     * 
     * @param interfaceUsager L'interface du joueur
     * @param motSecret Le mot secret à deviner
     */
    public MonPendu(AfficheBonnesLettres interfaceUsager, char[] motSecret) {
        super(interfaceUsager,motSecret);
    }

    /**
     * 
     * Cette méthode permet de valider si une lettre
     * est présente ou non dans le mot secret. De plus,
     * elle fait appelle à l'interface pour faire 
     * afficher les bonnes lettres.
     * 
     * @param essai La lettre soumise par le joueur
     * @return True si elle est parmis les lettres du mot secret.
     */
    @Override
    public boolean joue(char essai) {
        boolean lettreValide = false;
        for (int i = 0; i < motSecret.length; i++) {
            if(motSecret[i] == essai){
                essais[i] = essai;
                lettreValide = true;
            }
        }     
        interfaceUsager.bonnesLettres(essais); 
        return lettreValide;
    }
    
}
