/*
 *  CEGEP de Saint-Hyacinthe
 *   
 *  Cours 420-5RJ-HY
 *  Bien programmer en Java
 */
package ca.qc.cegepsth.gep.formatif2;

import java.util.Scanner;

/**
 * Examen intra Automne 2015
 *
 * @author Stéphane Denis
 */
public class PenduConsole implements AfficheBonnesLettres {

    private static boolean gagné; // vrai quand le joueur à gagné

    // singletons
    private static PenduConsole jeuConsole;
    private static JeuPendu jeu;

    /**
     * L'application requiert de fournir le mot recherché en argument
     *
     * @param args Mot à faire deviner
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Vous devez fournir un mot à trouver.");
        } else {
            char[] motSecret = args[0].toUpperCase().toCharArray();
            jeuConsole = new PenduConsole();

            // Votre code est instancié ici
            jeu = new MonPendu(jeuConsole, motSecret);

            jeuConsole.interactionUsager(motSecret);
        }
    }

    private void interactionUsager(char[] motSecret) {
        Scanner sc = new Scanner(System.in);
        char lettre;
        int échecs = 0;
        gagné = false;
        System.out.println("Jeu du pendu");
        do {
            // Affiche la potence
            pendu.Bonhomme.affiche(échecs);
            
            System.out.println("Tappez une lettre et faites [entrée].");
            lettre = sc.next().charAt(0);

            if (!jeu.joue(Character.toUpperCase(lettre))) {
                échecs++;
            }
        } while (échecs < pendu.Bonhomme.maxMembres() && !gagné);

        // Partie terminée
        if (gagné) {
            System.out.println("Bravo!");
        } else {
            System.out.println("Désolé! le mot cherché était :");
            jeuConsole.bonnesLettres(motSecret);
        }
    }

    /**
     * Affiche les lettres trouvées séparées par des espaces Affiche des
     * soulignés si le caractère est le code "null" Ce qui signifie que le
     * caractère n'a pas été trouvé
     *
     * @param lettres Caractères nuls ou trouvés
     */
    @Override
    public void bonnesLettres(char[] lettres) {
        boolean pasFini = false;
        for (char lettre : lettres) {
            if (lettre == '\u0000') {
                pasFini = true;
                System.out.print("_ ");
            } else {
                System.out.print(lettre + " ");
            }
        }
        System.out.println();
        
        // Le joueur gagne si il ne reste plus de vide
        gagné = !pasFini;
    }
}
